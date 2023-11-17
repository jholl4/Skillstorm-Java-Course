package com.skillstorm.chars;

public class FunWithChars {
	
	// Write a program that prompts the user for a message to encode
	// encode it by using rotation
	// decode it and print it
	// message must be 10 characters long
	
	// encoding strategy is that each letter is rotated a different amount
	// 1
	// 3
	// 5
	// 7
	// ...
	
	public static void main(String[] args) {
		// Treating a char as a number is allowed
		int x = 'a' + 'b'; // a is ascii number 97 and b is ascii number 98
		System.out.println((char) x);
		
		char jRotated = 'j' + 2;
		char oRotated = 'o' + 2;
		char sRotated = 's' + 2;
		char hRotated = 'h' + 2;
		System.out.println((char) jRotated + (char) oRotated + (char) sRotated + (char) hRotated);
		System.out.println(jRotated);
		System.out.println(oRotated);
		System.out.println(sRotated);
		System.out.println(hRotated);
	}
	
	private static String decoder(String[] message) {
		String result = "";
		return result;
	}

}
