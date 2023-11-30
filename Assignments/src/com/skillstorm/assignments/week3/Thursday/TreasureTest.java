package com.skillstorm.assignments.week3.Thursday;

import java.util.Arrays;

public class TreasureTest {
	
	public static void main(String[] args) {
		
		// Create treasure chest
		System.out.printf("%nYou found a treasure chest!%n");
		TreasureChest chest1 = new TreasureChest();
		System.out.println(chest1);
		
		// Instantiate 3 treasures and print them out
		System.out.printf("%nYou have a sudden premonition of what is to come. Are those treasures?%n");
		Treasure treasure1 = new Treasure();
		Treasure treasure2 = new Treasure("teddy bear", "You suddenly experience a warm and fuzzy "
				+ "feeling deep in the dark recesses of your heart.", 16.99);
		Treasure treasure3 = new Treasure("helmet", "This helmet is wrapped in barbed wire. Handle "
				+ "with care!", 100);
		System.out.println(treasure1);
		System.out.println(treasure2);
		System.out.println(treasure3);
		
		// Create an array containing the three treasures
		Treasure[] treasureCollection = {treasure1, treasure2, treasure3};
		
		// Instantiate a new chest with the 3 treasures contained within, then print the chest
		System.out.printf("%nYou find another chest.%n");
		TreasureChest chest2 = new TreasureChest(25, 3, 2, 2, true, treasureCollection);
		System.out.println(chest2);
		
		// print results of chest2's getContents method
		System.out.printf("%nYou try to ascertain the contents of the chest.%n");
		System.out.println(chest2.getContents());
		if(chest2.getContents()==null) {
			System.out.printf("Drat! You can't tell what's inside. Perhaps the chest is locked...%n");
		}else {
			System.out.println("Here is what you see: " + Arrays.toString(chest2.getContents()));
		}
		
		// unlock chest2 and print it
		System.out.printf("%nYou unlock the chest.%n");
		chest2.setLocked(false);
		System.out.println(chest2);
		
		System.out.printf("%nYou check the contents of the chest again. This is what you see:%n");
		for(Treasure treasure : chest2.getContents()) {
			System.out.println(treasure);
		}
		
	}
	
	

}
