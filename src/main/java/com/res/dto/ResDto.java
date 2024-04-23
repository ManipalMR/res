package com.res.dto;



public class ResDto {
	
	private Integer resId;
	
	private String resName;
	
	private Integer  foodId;

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public ResDto(Integer resId, String resName, Integer foodId) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.foodId = foodId;
	}

	public ResDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
