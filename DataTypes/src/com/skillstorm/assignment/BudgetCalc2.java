package com.skillstorm.assignment;

import java.util.Scanner;

public class BudgetCalc2 {
	
	// This assignment written by Josh Holland
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello and welcome to your Budget Calculator!");
		System.out.println("Let's get started! How much do you make each month?");
		double income = scanner.nextDouble();
		
		System.out.println("Great. Now let's switch gears to your expenses.");
		System.out.println("How much is your monthly rent or mortgage?");
		double housing = scanner.nextDouble();
		
		System.out.println("What are your combined monthly utility costs?");
		double utilities = scanner.nextDouble();
		
		System.out.println("How much is your combined car payment and insurance?");
		double transport = scanner.nextDouble();
		
		double savings = income - housing - utilities - transport;
		
		if(savings <= 0.00) {
			System.out.println("You're in the negative! Time for some budget cuts! You are at a net loss of " + savings + "!");
		}else {
			System.out.println("Congratulations! You're saving " + savings + " this month!");
		}
		
		scanner.close();
		
		
		
	}

}
