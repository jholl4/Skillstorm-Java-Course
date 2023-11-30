package com.skillstorm.assignments.week3.wednesday;

public class Circle {

	double radius;
	
	public Circle() {
		// default constructor
		this.radius = 3;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double diameter(){
		return Math.PI * 2 * this.radius;
	}
	
	public double circumference() {
		return 2 * Math.PI * this.radius;
	}
	
	public boolean isSameCircle(Circle otherCircle) {
		if(otherCircle==null) {
			return false;
		}
		return radius==otherCircle.radius;
	}
	
	

}
