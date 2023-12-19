package com.skillstorm;

import java.util.Scanner;

public class IfElseExamples {

	public static void main(String[] args) {
		// Example 1: Prompt user for yes or no
		Scanner scanner = new Scanner(System.in);
		System.out.print("Are you over 21? (Yes or no): ");
		String response = scanner.nextLine().toLowerCase();
		if (response.equals("yes")) {
			System.out.println("Here's your drink!");
		} else {
			System.out.println("Sorry, you're too young to drink!");
		}

		// Example 2: Nested Logic
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Do you live in the USA?");
		String isInUSA = scanner.nextLine();

		// Check if they are in Canada and over 18
		// Then they can drink
		if (!isInUSA.toLowerCase().contains("y")) {
			if (age >= 18) {
				System.out.println("Here's your drink!");
			} else {
				System.out.println("Sorry, you're underage!");
			}
			// Else if they're in the US and over 21
			// Then they can drink
		} else {
			if (age >= 21) {
				System.out.println("Here's your drink!");
			} else {
				System.out.println("Sorry, you're underage!");
			}
		}

		// if(!isInUSA)

		scanner.close();
	}

}
