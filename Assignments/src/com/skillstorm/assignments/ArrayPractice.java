package com.skillstorm.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
	
	// Part 1

	public static void main(String[] args) {
		int i = 0;
		String[] favoriteFoods = {"Clam Chowder", "Sushi", "Drunken Noodles"};
		System.out.printf("Some of my favorite foods are:%n");
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		System.out.printf("%n");
		
		// Reset i to zero
		i = 0;
		
		// Update the list with new foods
		favoriteFoods = Arrays.copyOf(favoriteFoods, 3);
		favoriteFoods[0] = "Seafood";
		favoriteFoods[1] = "Thai Food";
		favoriteFoods[2] = "Japanese Food";
		
		// Print the new list of favorite foods
		System.out.printf("My updated list of favorite foods are:%n");
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		System.out.printf("%n");
		
		// Reset i to zero
		i = 0;
		
		// Create a copy of the array with a new food added to it
		favoriteFoods = Arrays.copyOf(favoriteFoods, 5);
		
		// Add two new foods to the array
		favoriteFoods[3] = "Pizza";
		favoriteFoods[4] = "Chili";
		
		// Print the new array one element at a time
		System.out.printf("My new list with more favorite foods are:%n");
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		i++;
		System.out.println(favoriteFoods[i]);
		System.out.printf("%n");
		
		// Reset i to zero
		i = 0;
		
		// Part 2: test arrays
		int[] test1 = {1, 2, 3};
		int[] test2 = {1};
		int[] test3 = {};
		int[] test4 = null;
		
		System.out.printf("The last element of the first test array: %s%n", getLastElement(test1));
		System.out.printf("The last element of the second test array: %s%n", getLastElement(test2));
		System.out.printf("The last element of the third test array: %s%n", getLastElement(test3));
		System.out.printf("The last element of the fourth test array: %s%n", getLastElement(test4));
		
	}
	/**
	 * 
	 * @param argArray
	 * @return Last element of argArray
	 */
	public static int getLastElement(int[] argArray) {
		if (argArray != null && argArray.length > 0) {
			int index = argArray.length - 1;
			return argArray[index];
		}else {
			System.out.printf("Invalid argument; returning default value of zero%n");
			return 0;
		}
	}

}
