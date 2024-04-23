package com.res.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "res")
public class Res {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="res_id",nullable = false)
	private Integer resId;
	@Column(name="res_name",nullable = false)
	private String resName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "food_id"
	)
	private Food food;

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

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Res(Integer resId, String resName, Food food) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.food = food;
	}

	public Res() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
