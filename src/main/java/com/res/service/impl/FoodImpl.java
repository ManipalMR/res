package com.res.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.res.dto.FoodDto;
import com.res.model.Food;
import com.res.repository.FoodRepository;
import com.res.service.FoodService;
@Service
public class FoodImpl implements FoodService{
	
	@Autowired
	private FoodRepository foodReposiitory;

	@Override
	public FoodDto addValues(FoodDto foodDto) {
		Food food = convertDtotoEntity(foodDto);
		Food respone = foodReposiitory.save(food);
		FoodDto responseDto = convertEntitytoDto(respone);
		return responseDto;
	}

	private FoodDto convertEntitytoDto(Food food) {
		FoodDto foodDto = new FoodDto();
		foodDto.setFoodId(food.getFoodId());
		foodDto.setFoodName(food.getFoodName());
		return foodDto;
	}

	private Food convertDtotoEntity(FoodDto foodDto) {
		 Food  food =  new Food();
		 food.setFoodId(foodDto.getFoodId());
		 food.setFoodName(foodDto.getFoodName());
		return food;
	}
	
	

}
