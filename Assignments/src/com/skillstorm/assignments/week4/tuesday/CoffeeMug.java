package com.skillstorm.assignments.week4.tuesday;

public class CoffeeMug implements Fillable {

	private final double OUNCES;

	private double coffee;

	public CoffeeMug() {
		this.OUNCES = 12;
		this.coffee = 0;
	}

	public CoffeeMug(double ounces) {
		this.OUNCES = ounces;
	}

	public CoffeeMug(double ounces, double coffee) {
		this.OUNCES = ounces;
		this.coffee = coffee;
	}

	/**
	 * @return the oUNCES
	 */
	public double getOUNCES() {
		return OUNCES;
	}

	/**
	 * @return the coffee
	 */
	public double getCoffee() {
		return coffee;
	}

	@Override
	public void fill() {
		coffee = OUNCES;

	}

	@Override
	public void empty() {
		coffee = 0;

	}

	@Override
	/**
	 * Pass a quantity argument in ounces to add the amount to the cup.
	 */
	public void fill(double quantity) {
		if (quantity > 0 && (quantity + coffee) <= OUNCES) {
			coffee += quantity;
			System.out.printf("Pouring %f ounces of coffee. Can't wait to drink it!", quantity);
		} else if ((quantity + coffee) > OUNCES) {
			coffee = OUNCES;
			System.out.printf(
					"OOPS! You spilled some on the table! At least your cup is full!" + " I'll get you a towel.%n%n");
		} else if (quantity <= 0) {
			System.out.println("You try to fill your coffee cup but the pot is empty :( Time to" + " brew more!");
		}

	}

	@Override
	/**
	 * Pass a quantity argument in ounces to remove the amount from the cup.
	 */
	public void empty(double quantity) {
		if (quantity > 0 && (coffee - quantity) > 0) {
			coffee -= quantity;
			System.out.printf("Drinking %f ounces of coffee. Yum! You have %.1f ounces left.%n", quantity, coffee);
		} else if ((coffee - quantity) < 0) {
			coffee = 0;
			System.out.println("Stop! You drank all of it!");
		}

	}

	@Override
	public String toString() {
		return String.format("The %.1f ounce coffee cup currently contains %.1f ounces of coffee.%n", OUNCES, coffee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeeMug other = (CoffeeMug) obj;
		return Double.doubleToLongBits(coffee) == Double.doubleToLongBits(other.coffee);
	}

}
