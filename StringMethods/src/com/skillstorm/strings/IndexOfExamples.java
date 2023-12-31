package com.skillstorm.strings;

public class IndexOfExamples {
	
	public static void main(String[] args) {
		String cat = "Boots";
		System.out.println(cat);
		
		// Example 1:
		System.out.println(">> Look for the letter s");
		System.out.println("Index of s is " + cat.indexOf('s'));
		System.out.println("Index of S is " + cat.indexOf('S'));
		
		System.out.println("\n>> Looking for the letter o I get the first occurrence " + cat.indexOf('o'));
		System.out.println("\n>> Looking for the letter o I get the last occurrence " + cat.lastIndexOf('o'));
		
		// Example 2: Using indexOf(char, startLocation)
		String students = "Shawn, Abdel, Sam, Nick";
		//
		//
		int indexOfComma = students.indexOf(",");
		String firstStudent = students.substring(0, indexOfComma);
		System.out.println("\nThe first student is: " + firstStudent);
		
		int indexOfNextComma = students.indexOf(",", indexOfComma + 1);
		String secondStudent = students.substring(indexOfComma + 1, indexOfNextComma);
		System.out.println("The second student is: " + secondStudent);
		
		int indexOfLastComma = students.lastIndexOf(",");
		String lastStudent = students.substring(indexOfLastComma + 1).trim();
		System.out.println("The last student is: " + lastStudent);
	}

}
