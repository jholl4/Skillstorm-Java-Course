//package com.skillstorm.assignment;
//
//import java.util.Iterator;
//
//public class OrderOfOperations {
//	
//	public static void main(String[] args) {
//		
//		int modLength = 14; 
//		
//		// Using modulus:
////		System.out.println("Modulus equation answers:");
////		int[] modulusQuestions = new int[modLength];
////		
////		// Create an array of strings with the equations
////		String[] modulusQuestionsStrings = new String[] {"5+7%6", "12%6", "6%12", "3%5", "5%3", "5%5", "1%-2", "-1%2", "-1%-2", 
////				"0%2", "2%0", "6*2%6", "12%4", "7%3%2"};
////		//Declare an integer array to append the contents of the string array into, while type casting them to int
////		int[] modTestArray = new int[modulusQuestionsStrings.length];
////		// Iterate over the string array to append the int array
////		for (int i = 0; i < modulusQuestionsStrings.length; i++) {
////			try {
////				//Parse each string as an integer and append it into the int array
////				modTestArray[i] = evaluateExpression(modulusQuestionsStrings[i]);
////			} catch (NumberFormatException e) {
////				System.out.println("Error parsing string at index " + i + ": " + e.getMessage());
////			} catch (ArithmeticException e) {
////				System.out.println("Error in question " + (i + 1) + ": " + e.getMessage());
////			}
////		}
////		
////		private static int evaluateExpression(String expression) {
////			String[] parts = expression.split("%");
////			int dividend = Integer.parseInt(parts[0]);
////			int divisor = Integer.parseInt(parts[1]);
////			
////			if (divisor == 0) {
////				throw new ArithmeticException("Divide by zero");
////			}
////			int result = dividend % divisor; 
////			return;
////		}
//		
//		
//		// Trying the int array with a try/catch block
//			try {
//			} catch (ArithmeticException e) {
//				System.out.println("Error in array: " + e.getMessage());
//			}
//		
//		int[] modulusQuestions = new int[] {5+7%6, 12%6, 6%12, 3%5, 5%3, 5%5, 1%-2, -1%2, -1%-2, 
//				0%2, 2%0, 6*2%6, 12%4, 7%3%2};
//		// Iterate over the question array
//		for (int i = 0; i < modulusQuestions.length; i++) {
//			try {
//				int result = modulusQuestions[i];
//				System.out.println((i+1) + ":" + result);
//			} catch (ArithmeticException e ) {
//				// Added this to handle the divide by zero exception
//				System.out.println("Error on question " + i + ". Check your arithmetic!");
//			}
//			
//		}
//			
//	}
//
//}
