package com.res.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.res.dto.ResDto;
import com.res.model.Food;
import com.res.model.Res;
import com.res.repository.FoodRepository;
import com.res.repository.ReRepository;
import com.res.service.ResService;

@Service
public class ResImpl implements ResService{
	
	@Autowired
	private ReRepository reRepoitory ;
	
	@Autowired
	private FoodRepository foodRepository ;

	@Override
	public Object postValu(ResDto resDto) {
		Optional<Food> option = foodRepository.findById(resDto.getFoodId());
		if(option.isEmpty()) {
			return "not id found";
		}
			Res res = new Res();
			res.setResId( resDto.getResId());
			res.setResName(resDto.getResName());
			res.setFood(option.get());
			reRepoitory.save(res);
	
		return resDto;
	}

}
