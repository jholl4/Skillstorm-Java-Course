package com.skillstorm.userinput;

import java.util.Scanner;

public class ScannerExamples {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: "); // print will not go to the next line unlike println
		String name = scanner.nextLine();
		
		System.out.println("Thanks, " + name + "!");
		
		// Read the next "token"
		System.out.print("How many cats do you have? ");
		int numCats = scanner.nextInt();
		System.out.println("Wow, you have " + numCats + " cats!");
		
		scanner.close();
	}

}
