package com.skillstorm.assignments.week3.friday;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		// testing triangle
		Triangle tri = new Triangle();
		System.out.println(tri);
		
		// testing rectangle
		Rectangle rec = new Rectangle();
		System.out.println(rec);
		
		// testing equals methods
		// Should be:
		// false
		// false
		System.out.println("testing tri vs rec " + tri.equals(rec));
		System.out.println("testing rec vs tri " + rec.equals(tri));
		
		// instantiate some more triangles and rectangles
		Triangle tri2 = new Triangle();
		Triangle tri3 = new Triangle(3, 5);
		Rectangle rec2 = new Rectangle();
		Rectangle rec3 = new Rectangle(3, 5);
		
		// test equals with more triangles and rectangles
		// Should be:
		// true
		// false
		// true
		// false
		System.out.println("testing tri vs tri2 " + tri.equals(tri2));
		System.out.println("testing tri3 vs rec3 " + tri3.equals(rec3));
		System.out.println("testing rec vs rec2 " + rec.equals(rec2));
		System.out.println("testing rec2 vs rec3 " + rec2.equals(rec3));
		
	}

}
