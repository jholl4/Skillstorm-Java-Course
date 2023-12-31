package com.skillstorm.strings;

import java.util.Scanner;

public class CompoundInterestCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user for their principal
		System.out.println("Welcome to the Compund Interest Calculator!");
		System.out.print("Please enter your principal amount: ");
		double principal = scanner.nextDouble();
		
		// Ask the user for their interest rate
		System.out.print("Please enter your interest rate: ");
		double rate = scanner.nextDouble() / 100;
		
		// Ask the user for the number of compounding periods per unit of time (year)
		System.out.print("Please enter the compound period (typically how many months per year): ");
		int months = scanner.nextInt();
		
		// Ask the user for the number of years for the loan
		System.out.print("Please enter the amount of years for the loan period: ");
		int years = scanner.nextInt();		
		
		// Calculate the interest and print the results with 2 decimal places
		double total = principal * Math.pow(1+rate/months, months*years);
		System.out.format("The amount of interest after %d years is $%,.2f.\n", years, total-principal);
		System.out.format("The total after %d years is $%,.2f.\n", years, total);
		
		
		scanner.close();
		
	}

}
