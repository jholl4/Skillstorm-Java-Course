package com.skillstorm.assignments.week3.wednesday;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(6.4);
		Circle circle3 = new Circle(3);
		
		System.out.println("Circle 1 diameter: " + circle1.diameter());
		System.out.println("Circle 2 diameter: " + circle2.diameter());
		System.out.println("Circle 3 diameter: " + circle3.diameter());
		
		System.out.println("Circle 1 area: " + circle1.area());
		System.out.println("Circle 2 area: " + circle2.area());
		System.out.println("Circle 3 area: " + circle3.area());
		
		System.out.println("Circle 1 circumference: " + circle1.circumference());
		System.out.println("Circle 2 circumference: " + circle2.circumference());
		System.out.println("Circle 3 circumference: " + circle3.circumference());
		
		System.out.println("Circle 1 radius: " + circle1.radius);
		System.out.println("Circle 2 radius: " + circle2.radius);
		System.out.println("Circle 3 radius: " + circle3.radius);
		
		System.out.println("Are both circles the same size (circle 1 & 2)? " + circle1.isSameCircle(circle2));
		System.out.println("Are both circles the same size (circle 1 & 3)? " + circle1.isSameCircle(circle3));
	}
	
	

}
