package com.res.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.res.dto.ResDto;
import com.res.service.ResService;

@RestController
public class ResController {
	
	@Autowired
	private ResService resService ;
	
	@PostMapping("/postValue")
	
	public ResponseEntity<?> postValue(@RequestBody ResDto resDto){
		Object response = resService.postValu(resDto);
		return new ResponseEntity<Object> (response,HttpStatus.OK);
		
	}

}
