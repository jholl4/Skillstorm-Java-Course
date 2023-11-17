package com.skillstorm.strings;

public class StringFormatExamples {
	
	public static void main(String[] Args) {
		// I'm at the grocery store and they have cookies on sale 1.99 for 5
		// To look at the cost of one cookie
		// I want to see the price
		// but format it nicely
		double costForOneOfFive = 1.99 / 5; 
		String formattedString = String.format("The price of one cookie is $%.2f", costForOneOfFive);
		System.out.println(formattedString);
		
		/*
		 * Formatters to know:
		 * %f for floating point (double and float types)
		 * %s for strings
		 * %d for whole numbers
		 * 
		 * To format it further
		 * %10f means a width of 10
		 * %.2f means 2 digits after the decimal
		 */
	}

}
