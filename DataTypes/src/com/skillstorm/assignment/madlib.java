package com.skillstorm.assignment;

import java.util.Scanner;

public class madlib {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Madlibs!");
		
		System.out.print("Please enter the name of a food: ");
		String food = scanner.nextLine();
		
		System.out.print("Please enter an adverb: ");
		String adverb = scanner.nextLine();
		
		System.out.print("Please enter an verb: ");
		String verb = scanner.nextLine();
		
		System.out.print("Please enter the name of a place: ");
		String place = scanner.nextLine();
		
		System.out.print("Please enter the name of a thing: ");
		String thing = scanner.nextLine();
		
		System.out.print("Please enter an adjective: ");
		String adjective = scanner.nextLine();
		
		System.out.print("Please enter the name of a food: ");
		String foods = scanner.nextLine();
		
		System.out.print("Please enter a color: ");
		String color = scanner.nextLine();
		
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		
		//Need to move the buffer to the next line after asking for an int.
		scanner.nextLine();
		
		System.out.print("Please enter a person's name: ");
		String person = scanner.nextLine();
		
		System.out.println("Today we picked apples from " + person + "'s orchard. I had no idea there were so many different types of apples. \n"
				+ "I ate " + number + " " + color + " apples straight off the tree. They tasted like " + foods + ". Then there was a " + adjective + " apple \n"
				+ "that looked like a " + thing + ". When our bags were full, we went on a free hay ride to " + place + " and back. It ended at a hay pile \n"
				+ "where we got to " + verb + " " + adverb + ". I can hardly wait to get home and cook with the apples. We are going to make apple " + food + " and apple pies!");
		
		
		scanner.close();
	}

}
