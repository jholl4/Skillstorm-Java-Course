package com.skillstorm.assignments.week4.thursday;

public class Circle {

	private double radius;

	public Circle() {
		// default constructor
		this.radius = 3;
	}

	public Circle(double radius) throws InvalidSizeException {
		if (radius <= 0) {
			throw new InvalidSizeException();
		}
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) throws InvalidSizeException {
		if (radius <= 0) {
			throw new InvalidSizeException();
		}
		this.radius = radius;
	}

	/**
	 * 
	 * @return calculated area
	 */
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	/**
	 * 
	 * @return calculated diameter
	 */
	public double diameter() {
		return Math.PI * 2 * this.radius;
	}

	/**
	 * 
	 * @return calculated circumference
	 */
	public double circumference() {
		return 2 * Math.PI * this.radius;
	}

	/**
	 * 
	 * @param otherCircle
	 * @return boolean; true if param circle equal to this circle
	 */
	public boolean isSameCircle(Circle otherCircle) {
		if (otherCircle == null) {
			return false;
		}
		return radius == otherCircle.radius;
	}

	@Override
	public String toString() {
		return String.format("Circle with radius of %f, area of %f, diameter of %f, and"
				+ " circumference of %f.",
				this.radius, this.area(), this.diameter(), this.circumference());
	}

}
