package com.res.dto;



public class FoodDto {
	
	private Integer foodId;
	
	private String foodName;

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public FoodDto(Integer foodId, String foodName) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
	}

	public FoodDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
