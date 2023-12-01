package com.skillstorm.assignments.week3.friday.groupwork;

public class AnimalTest {

	public static void main(String[] args) {
		Cat kitty = new Cat();
		System.out.println(kitty);
		
		Dog gimli = new Dog("Gimli", true, false);
		System.out.println(gimli);
		
		Dog gandalf = new Dog("Gandalf", true, false);
		System.out.println(gandalf);
		
		System.out.printf("Are %s and %s the same dog? %b.%n", gimli.getName(), gandalf.getName(), gimli.equals(gandalf));
		
		System.out.println(kitty.reproduce());
		kitty.talk();
		gimli.talk();
		
		

	}

}
