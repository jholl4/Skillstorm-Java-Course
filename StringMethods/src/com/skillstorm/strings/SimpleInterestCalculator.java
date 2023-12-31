package com.skillstorm.strings;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Simple Interest Calculator!");
		
		// Ask the user for their principle
		System.out.print("Please enter your total loan amount: ");
		double principal = scanner.nextDouble();
		
		// Ask the user for their interest rate
		System.out.print("Please enter your interest rate: ");
		double rate = scanner.nextDouble() / 100;
		
		// Ask the user for the loan period in years
		System.out.print("Please enter the loan period in years: ");
		int years = scanner.nextInt();
		
		//calculate the amount of interest and add it to the total loan
		double total = principal * (1 + rate * years);
		double interest = total - principal;
		System.out.println(String.format("Your total loan amount including interest over %d years is $%,.2f.", years, total));
		System.out.println(String.format("Your total amount of interest is $%,.2f.", interest));
		
		scanner.close();

	}

}
