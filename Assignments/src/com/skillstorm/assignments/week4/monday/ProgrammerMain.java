package com.skillstorm.assignments.week4.monday;

import java.util.Arrays;

public class ProgrammerMain {

	public static void main(String[] args) {
		// create a programmer
		Programmer josh = new Programmer("Josh", "Unemployed", "C#", "Java", "Python");
		System.out.printf("We've created a new programmer! Here are the details...%n%n%s", josh);
		
		// Learn a new language
		josh.learnLanguage("Ruby");
		System.out.println(josh);
		
		// Forget a language
		josh.forgetLanguage("python");
		System.out.println(josh);

		// create a new programmer
		Programmer zim = new Programmer("Zim", "Irken Invaders", "Z#", "Gir", "Irken");
		System.out.printf("We've created a new programmer! Here are the details...%n%n%s", zim);
		
		// Learn a new language
		zim.learnLanguage("Human");
		System.out.println(zim);
		
		// Forget a language
		zim.forgetLanguage("human");
		System.out.println(zim);
		
		System.out.printf("Creating a programmer with a blank string in the constructor. Should have "
				+ "a language list that doesn't include the blank string:%n%n");
		Programmer gir = new Programmer("Gir", "Henchman", "Babble", "", "Machine Language");
		System.out.println(gir);
		
		System.out.printf("Testing learnLanguage method with an invalid input: %n%n");
		gir.learnLanguage("");
		
		System.out.println("Checking if Gir and Josh are equal: " + gir.equals(josh));
		System.out.println();
		
		// compare programmers that know the same languages (but in different orders)
		System.out.println("Creating two new programmers with the same languages"
				+ " but in a different order in their language arrays...");
		Programmer josh2 = new Programmer("Josh 2.0", "SuperGoogle", "Java", "C#", "Python");
		Programmer josh3 = new Programmer("Josh 3.0", "SuperMicrosoft", "c#", "python", "java");
		System.out.println("Checking if Josh 3.0 and Josh 2.0 are equal: " + josh3.equals(josh2));
	}

}
