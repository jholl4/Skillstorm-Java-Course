package com.skillstorm;

public class GroupWork {
	public static void main(String[] args) {
		// Warm-up 1: Count to 100 by 2's
		for(int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		// Warm-up 2: Add up the numbers 1 to 10
		int result = 0;
		// YOUR CODE HERE
		for(int i = 1; i <= 10; i++) {
			result += i;
		}
		
		System.out.printf("Adding 1 through 10 results in: %d%n", result);
		
		System.out.printf("Your reversed string is: %s%n", challenge1("Hello"));
		
		System.out.printf("Your sarcastic string is: %s%n", challenge2("Hello Spongebob"));
	}
	

	
	/**
	 * Reverse a String. 
	 * 
	 * For example, given "Hello" it will return "olleH" 
	 * 
	 * @param s The String to reverse
	 * @return A new String containing the characters in reverse order
	 * 
	 */
	public static String challenge1(String s) {
		// YOUR CODE HERE 
		String result = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		
		return result.trim();
	}
	
	/**
	 * Capitalizes every other letter in a String. 
	 * 
	 * For example, given "hello" it will return "HeLlO" 
	 * 
	 * @param s The String to capitalize
	 * @return A new String with every other letter capitalized
	 * 
	 */
	public static String challenge2(String s) {
		// YOUR CODE HERE
		String result = "";
		for(int i = 0; i <= s.length() - 1; i++) {
			if(i % 2 == 0) {
				result += ("" + s.charAt(i)).toLowerCase();
			}else {
				result += ("" + s.charAt(i)).toUpperCase();
			}
		}
		return result;
	}

}
