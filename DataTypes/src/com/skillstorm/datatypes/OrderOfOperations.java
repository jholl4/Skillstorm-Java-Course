package com.skillstorm.datatypes;

public class OrderOfOperations {

	public static void main(String[] args) {
		
		// Parenthesis
		// Exponents
		// Multiplication/
		// Division
		// Addition/
		// Subtraction
		
		// Full list of Java order of operations at https://introcs.cs.princeton.edu/java/11precedence/
		
		// Operators to know:
		// + - * /
		// % is the modulus aka the remainder
		int result = 3 % 2; // 3 / 2 = 1 remainder 1 = 1
		result = 2 % 3; // 2 / 3 = 0 remainder 2 = 2
				
		// Assignment operators (assignment happens last)
		// += -=
		// *= /= %=
		int a = 10;
		a += 1; // 11
		a++; // 12 This is a postfix
		++a; // This is a prefix
		
		// String concatenation with pemdas
		System.out.println("1" + 1 + 1); // 111
		System.out.println("1" + (1 + 1));
		
		

	}

}
