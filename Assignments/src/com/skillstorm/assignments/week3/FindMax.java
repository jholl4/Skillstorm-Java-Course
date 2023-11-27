package com.skillstorm.assignments.week3;

public class FindMax {

	public static void main(String[] args)throws NullPointerException {
		int[] multiEleArray = {10, 3, 23, 72, 44};
		int[] oneEleArray = {10};
		int[] emptyArray = {};
		int[] negArray = {-2, 8, 100, -64, 32, 0};
		
		System.out.printf("%nTesting findMax method with a null value:%n");
		try {
			System.out.println(findMax(null));
		}catch(NullPointerException e) {
			System.out.println("Invalid input; please use something other than null.");
		}
		
		System.out.printf("%nTesting findMax method with an empty array:%n");
		System.out.println(findMax(emptyArray));
		
		System.out.printf("%nTesting findMax method with a one-element array:%n");
		System.out.println(findMax(oneEleArray));
		
		System.out.printf("%nTesting findMax method with a multi-element array:%n");
		System.out.println(findMax(multiEleArray));
		
		System.out.printf("%nTesting findMin using negArray:%n");
		System.out.println(findMin(negArray));


	}
	/**
	 * 
	 * @param inputArray
	 * @return int
	 */
	public static int findMax(int[] inputArray)throws NullPointerException {
		
		int result = 0;
		
		for(int n : inputArray) {
			try {
				if(n > result) result = n;

			}catch(NullPointerException e) {
				System.out.println("Invalid input; please use something other than null.");
			}
		}
		System.out.print("The largest number in your array is: ");
		return result;
		
	}
	/**
	 * 
	 * @param inputArray
	 * @return int
	 */
	public static int findMin(int[] inputArray) {
		
		int result = inputArray[0];
		
		for(int n : inputArray) {
			if(n < result) {
				result = n;
			}
		}
		System.out.print("The smallest number in your array is: ");
		return result;
		
	}

}