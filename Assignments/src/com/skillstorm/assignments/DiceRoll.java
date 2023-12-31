package com.skillstorm.assignments;

import java.util.Scanner;

public class DiceRoll {
	
	public static void main(String[] args) {
		
		// User's initial account balance to bet from
		double balance = 100;
		
		// This variable used for the do while status to check if it will continue the loop
		boolean cont = false;
		
		// Number for calculating the odds; a 3 will result in 3/1 odds, 4 will result in 4/1 odds etc
		double odds = 3;
		
		boolean validChoice = false;
		
		int guess;
		
		// Scanner created outside of do while loop for user input
		Scanner scanner = new Scanner(System.in);
		
		do {
			// Prompt the user to enter a number between 1 and 6
			System.out.println("Welcome to Dice Roll!");
			
			do {
				System.out.print("Please guess a number between 1 and 6: ");
				guess = scanner.nextInt();
				scanner.nextLine(); // Clearing buffer
				if(guess >= 1 && guess <= 6) {
					validChoice = true;
				}else {
					validChoice = false;
				}
			} while(!validChoice);
			
			// Step 2, ask the user to bet a dollar amount. Give them 3/1 odds meaning they profit 3
			// times the amount they wagered. a $1 bet pays out $4. Store the dollar amount in a double.
			System.out.format("Nice! But how confident are you in your guess? Enter a dollar amount "
					+ "to bet from your balance of $%,.2f: ", balance);
			double bet = scanner.nextDouble();
			scanner.nextLine(); // Clearing buffer
			
			// Subtract the bet amount from the balance
			balance -= bet;
			System.out.format("You placed a bet of $%,.2f. Your new balance is $%,.2f.\n", bet, balance);
			double profit = bet*odds+bet;
			
			
			// Use Math.random() to "roll" the dice
			int answer = (int)((Math.random() * 6 + 1));
			System.out.format("You guessed %s. Let's see if you were correct...\n", guess);
			
			// Compare the guess to the answer and let them know the result and their winnings/balance
			if(guess == answer) {
				balance += profit;
				System.out.format("You guessed correctly! You now have $%,.2f. Congratulations!\n", balance);
			}else {
				System.out.format("Sorry, you guessed incorrectly; The correct number was %d. Your balance is still $%,.2f.\n", answer, balance);
			}
			System.out.print("Would you like to try again? yes or no >");
			String contAnswer = scanner.nextLine();
			if(contAnswer.equalsIgnoreCase("no")) {
				System.out.println("Alrighty then. Goodbye!");
				cont = false;
			}else {
				cont = true;
			}
//			System.out.println(cont); // debugging for cont status
			
		} while(cont);

		
	}

}
