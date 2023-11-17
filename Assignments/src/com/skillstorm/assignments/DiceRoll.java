package com.skillstorm.assignments;

import java.util.Scanner;

public class DiceRoll {
	
	public static void main(String[] args) {
		
		// Prompt the user to enter a number between 1 and 6
		System.out.print("Welcome to Dice Roll! Please guess a number between 1 and 6!");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		
		// Step 2, ask the user to bet a dollar amount. Give them 3/1 odds meaning they profit 3
		// times the amount they wagered. a $1 bet pays out $4. Store the dollar amount in a double.
		// Let the user know how much they won.
		System.out.print("Nice! But how confident are you in your guess? Enter a dollar amount "
				+ "for your bet.");
		double bet = scanner.nextDouble();
		double odds = 3;
		double profit = bet*3+bet;
		
		
		// Use Math.random() to "roll" the dice
		int answer = (int)((Math.random() * 10 + 1));
		System.out.println(answer);
		
		// Let the user know if the guessed correctly or not and how much they won or lost
	}

}
