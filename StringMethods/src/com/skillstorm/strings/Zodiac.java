package com.skillstorm.strings;

import java.util.Scanner;

public class Zodiac {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Establish the user's birth year
		System.out.print("Please enter your birth year: ");
		int year = scanner.nextInt();
		
		// Use modulus on user's birth year based on the number of zodiac signs
		int positionInList = year % 12;
		// Since each zodiac has exactly 10 characters including white space, we multiply by 10
		int startPositionInString = positionInList * 10;
		// This variable will be used to help find the end of the substring
		int nextPositionInList = positionInList+ 1;
		// Find the end position of the substring
		int endPositionInString = nextPositionInList * 10;
		
		String zodiacAnimals = 
                "Monkey    " +
                "Rooster   " +
                "Dog       " +
                "Pig       " +
                "Rat       " +
                "Ox        " +
                "Tiger     " +
                "Rabbit    " +
                "Dragon    " +
                "Snake     " +
                "Horse     " +
                "Goat      "
                ;
		
		// Assign the user's animal to a new string and trim the whitespace
		String yourAnimal = zodiacAnimals.substring(startPositionInString, endPositionInString).
				trim();
		
		// Format and print a string to tell the user their zodiac animal
		System.out.println(String.format("Your zodiac animal is the %s.", yourAnimal));
				
		scanner.close();
		
	}

}
