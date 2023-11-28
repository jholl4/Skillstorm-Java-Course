package com.skillstorm;

import java.util.Arrays;

public class CodeDemo {
	
	public static void main(String[] args) {
		int[] testArr = {3, 7, 1, 9};
		int[] testArr2 = {6, 4, 8};
		System.out.println("Copy range to new array: " + Arrays.toString(copyRange(testArr, 1, 3)));
		System.out.println("Append two arrays: " + Arrays.toString(append(testArr, testArr2)));
		System.out.println("All even? " + allEven(testArr2));
	}
	
	/**
	 * Copy All returns a new array with all the elements from the original array
	 * copied over. Not using the Arrays utility class's copy method!
	 * @author Erica
	 */
	public static int[] copy(int[] numbers) {
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		return copy;
	}
	
	/**
	 * Copy range from start index (inclusive) to end index (exclusive)
	 * @return A new array with all the elements between the start and end index
	 *         If end > length what should we do? returns everything up to the end of the array and nothing beyond
	 *         If start >= end what should we do? returns an empty array
	 * @author Team
	 */
	public static int[] copyRange(int[] numbers, int start, int end) {
		int[] copy = new int[end-start+1];
		
		int numberCounter = start;
		int copyCounter = 0;
		while(numberCounter <= end) {
			copy[copyCounter] = numbers[numberCounter];
			numberCounter++;
			copyCounter++;
		}
		
		return copy;
	}
	
	/**
	 * Append returns a new array with all the elements of arr1 and all the elements of arr2
	 * @author Team
	 */
	public static int[] append(int[] arr1, int[] arr2) {
		if(arr1==null || arr1.length == 0) return arr2;
		if(arr2==null || arr2.length==0) return arr1;
		
		int[] result = new int[arr1.length + arr2.length];
		
		int counter = 0;
		while(counter < result.length) {
			if(counter < arr1.length) {
				result[counter] = arr1[counter];
			}else {
				result[counter] = arr2[counter-arr1.length];
			}
			counter++;
		}
		
		return result;
	}
	
	/**
	 * Write a method that takes in a number array
	 * and returns true if the array contains negative values
	 * @author Erica
	 */
	public static boolean containsNegatives(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0)
				return true;
		}
		return false;
	}
	
	/**
	 * Write a method that returns true if all the number are even
	 * @author Team
	 */
	public static boolean allEven(int[] nums) {
		int counter = 0;
		while(counter < nums.length) {
			if(nums[counter] % 2 == 1) {
				return false;
			}
			counter++;
		}
		return true;
	}
	
	/**
	 * Write a method that takes in a String 
	 * and encodes it by rotating all the letters by n characters.
	 * @author Team
	 */
	public static String rotate(String str, int rotation) {
		String result = "";
		
		return result;
	}
	
	// Helper method
	

}
