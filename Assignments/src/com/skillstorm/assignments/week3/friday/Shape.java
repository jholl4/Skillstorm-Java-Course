package com.skillstorm.assignments.week3.friday;

import java.util.Objects;

import com.skillstorm.assignments.week3.friday.groupwork.Dog;

public class Shape {
	
	private double height;
	private double base;
	
	public Shape() {
		height = 0;
		base = 0;
	}
	
	public Shape(double height, double width) {
		this.height = height;
		this.base = width;
	}
	
	
	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double width) {
		this.base = width;
	}

	

	public double area() {
		return 0.0;
	}
	
	public double perimeter() {
		return 0.0;
	}
	
	public boolean equals(Object obj) {
		if(obj==this)return true;
		if(obj==null)return false;
		if(obj.getClass() != this.getClass())return false;
		Shape other = (Shape) obj;
		return this.getBase()==other.getBase() && this.getHeight()==other.getHeight();
	}

}
