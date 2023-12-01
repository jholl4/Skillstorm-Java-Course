package com.skillstorm.assignments.week3.friday;

import java.util.Objects;

public class Rectangle extends Shape{
	
	public Rectangle() {
		super(1, 1);
	}
	
	public Rectangle(double height, double width) {
		super(height, width);
	}
	
	@Override
	public double area() {
		return getBase() * getHeight();
	}
	
	@Override
	public double perimeter() {
		return getBase() * 2 + getHeight() * 2;
	}
	
	@Override
	public String toString() {
		return String.format("This is a rectangle. Its area is %.2f and its perimeter is %.2f.%n", area(), perimeter());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)return true;
		if(obj==null)return false;
		if(obj.getClass() != this.getClass())return false;
		Rectangle other = (Rectangle) obj;
		return super.equals(other);
	}

}
