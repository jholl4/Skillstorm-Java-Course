package com.skillstorm.datatypes;

public class PrefixPostfixOrderOfOperations {

	public static void main(String[] args) {
		// Example 1:
		int a = 1;
		System.out.println(a++); // This will print out 1 because we used a postfix
		System.out.println(++a); // This will print out 2 because with a prefix, it increments before printing
		
		// We have to distinguish between 
		int x = 10;
		x += 10 * x++;
		// Breaking this down
		// x = x + 10 * x + 1;
		// x = 10 + 10 * 10;
		
		System.out.println(x);

	}

}
