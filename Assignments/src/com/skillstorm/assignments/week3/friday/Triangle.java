package com.skillstorm.assignments.week3.friday;

import java.util.Objects;

public class Triangle extends Shape{
	
	private double sideA;
	private double sideB;
	private double sideC;
	

	public Triangle() {
		super(0.5, 1);
		sideA = 1;
		sideB = 1;
		sideC = 1;
	}
	
	public Triangle(double height, double width) {
		super(height, width);
		sideA = getBase();
		sideB = 1;
		sideC = 1;
	}
	
	
	@Override
	public double area() {
		return this.getBase() * this.getHeight() / 2;
	}
	
	@Override
	public double perimeter() {
		return sideA + sideB + sideC;
	}
	
	@Override
	public String toString() {
		return String.format("This is a triangle. Its area is %.2f and its perimeter is %.2f.%n", area(), perimeter());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)return true;
		if(obj==null)return false;
		if(obj.getClass() != this.getClass())return false;
		Triangle other = (Triangle) obj;
		if (!super.equals(other)) {
			return false;
		}else if (other.sideA!=this.sideA) {
			return false;
		}else if(other.sideB!=this.sideB) {
			return false;
		}else if(other.sideC!=this.sideC) {
			return false;
		}else {
			return true;
		}

	}

}
