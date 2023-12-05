package com.skillstorm.assignments.week4.tuesday;

public class FillableTest {

	public static void main(String[] args) {

		CoffeeMug coffee1 = new CoffeeMug();
		CoffeeMug coffee2 = new CoffeeMug(24);
		CoffeeMug coffee3 = new CoffeeMug(24, 10);
		
		System.out.printf("Coffee mug tests%n-------------------%n%n");
		
		System.out.printf("Starting status for all coffee cups:%n%n%s%n%s%n%s%n",
				coffee1, coffee2, coffee3);
		System.out.println("Filling coffee 1:");
		coffee1.fill();
		System.out.println(coffee1);
		System.out.printf("Attempting to overfill coffee 1...%n");
		coffee1.fill(5);
		System.out.println(coffee1);
		System.out.printf("Checking coffee 2:%n%s%nChecking coffee 3:%n%s%n", coffee2, coffee3);
		System.out.printf("Testing coffee equals method. Are coffees 2 and 3 filled to the "
				+ "same level? %b%n%n", coffee2.equals(coffee3));
		
		GasTank tank1 = new GasTank();
		GasTank tank2 = new GasTank(30);
		GasTank tank3 = new GasTank(30, 5);
		
		System.out.printf("Gas tank tests%n-------------------%n%n");
		System.out.printf("Starting status for all gas tanks:%n%n%s%n%s%n%s%n", tank1, tank2, tank3);
		System.out.println("Attempting to overfill tank 2...");
		tank2.fill(25);
		System.out.println(tank2);
		System.out.println("Attempting to siphon more gas than tank 1 has...");
		tank1.empty(30);
		System.out.println(tank1);
		
		System.out.println("Siphoning tank 1 and tank 2...");
		tank1.empty();
		System.out.println(tank1);
		tank2.empty();
		System.out.println(tank2);
		System.out.printf("Are tank 1 and tank 2 both at the same level? %b", tank1.equals(tank2));
		

	}

}
