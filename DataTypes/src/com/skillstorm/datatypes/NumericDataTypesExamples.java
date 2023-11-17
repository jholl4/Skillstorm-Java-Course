package com.skillstorm.datatypes;

public class NumericDataTypesExamples {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		// Whole numbers
		// - byte
		// - short
		// - int
		// - long
		
		int x = 10;
//		x = 2_000_000_000_000_000_000 // invalid too large out of range for int
		
		long y = 2_000_000_000_000_000_000L;
		
		short largestShort = Short.MAX_VALUE;
		System.out.println("Largest short value is " + largestShort);
		
		byte b = 127;
		byte bb = -128;
		byte largestByte = Byte.MAX_VALUE;
		System.out.println("Largest byte value is " + largestByte);
		System.out.println("Smallest byte value is " + Byte.MIN_VALUE);
		
		
		

	}

}
