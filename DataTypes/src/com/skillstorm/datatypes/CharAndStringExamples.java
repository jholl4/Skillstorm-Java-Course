package com.skillstorm.datatypes;

public class CharAndStringExamples {
	
	public static void main(String[] args) {
		// Example 1: char literals single quotes
		char c = 'a';
		String c2 = "a";
		
		// Example 2: String concatenation (means to chain together
		String name = "Josh" + "Holland";
		System.out.println(name);
		
		// This will concatenate the number 2 to the end of the string 2
		String someCell = "2" + 2;
		System.out.println(someCell);
		
		// Example 3:
//		String d = 'c' + 2 + ""; //Doesn't work 'c' + 2
		String e = "c" + 2;
		System.out.println(e);
		
	}

}
