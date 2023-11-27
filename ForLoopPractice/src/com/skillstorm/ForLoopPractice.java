package com.skillstorm;

public class ForLoopPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		int[] nums = {1, 2, 3};
		String[] consoles = {"Switch", "Xbox", "Playstation"};
		
		countTo100();
		countIntArray(nums);
		System.out.println(concatArray(consoles));
	}
	
	public static void countTo100() throws InterruptedException {
		for(int i=10; i<=100; i+=10) {
			Thread.sleep(300);
			System.out.println(i);
		}
	}
	
	public static void countIntArray(int[] array) {
		System.out.println("Using an enhanced for loop on an array of integers:");
		for(int i : array) {
			System.out.println(i);
		}
	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static String concatArray(String[] array) {
		String result = "";
		System.out.println("Here is your array in a string:");
		for(String console : array) {
			result += console + " ";
		}
		return result.trim();
	}

}
