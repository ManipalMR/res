package com.res.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.res.dto.FoodDto;
import com.res.service.FoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodservice;
	
	@PostMapping("/pstValues")
	public ResponseEntity<?> addValues(@RequestBody  FoodDto foodDto){
		FoodDto response = foodservice.addValues(foodDto) ;
		
		return new ResponseEntity<FoodDto> (response,HttpStatus.OK);
	
	}
	

}
