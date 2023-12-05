package com.skillstorm.assignments.week4.tuesday;

public class GasTank implements Fillable {

	private final double GALLONS;

	private double gas;

	public GasTank() {
		this.GALLONS = 15;
		this.gas = 0;
	}

	public GasTank(double gallons) {
		this.GALLONS = gallons;
	}

	public GasTank(double gallons, double gas) {
		this.GALLONS = gallons;
		this.gas = gas;
	}

	/**
	 * @return the gALLONS
	 */
	public double getGALLONS() {
		return GALLONS;
	}

	/**
	 * @return the gas
	 */
	public double getGas() {
		return gas;
	}

	@Override
	public void fill() {
		gas = GALLONS;

	}

	@Override
	public void empty() {
		gas = 0;

	}

	@Override
	/**
	 * Pass a quantity argument in gallons to add that amount to the gas tank.
	 */
	public void fill(double quantity) {
		if (quantity > 0 && (gas + quantity) <= GALLONS) {
			gas += quantity;
			System.out.printf("Look at me, I can afford %.1f gallons of gas for my vehicle!%n%n", quantity);
		} else if ((gas + quantity) > GALLONS) {
			gas = GALLONS;
			System.out.printf("Well, you filled your tank, but you got gas all over the place too."
					+ " Don't light any matches!%n%n");
		}

	}

	@Override
	/**
	 * Pass a quantity argument in gallons to remove the amount from the gas tank.
	 */
	public void empty(double quantity) {
		if (quantity > 0 && (gas - quantity) > 0) {
			gas -= quantity;
			System.out.printf("Oh no! A thief siphoned %.1f gallons of gas from your vehicle!"
					+ " Now you have %.1f gallons left.%n", quantity, gas);
		} else if ((gas - quantity) < 0) {
			gas = 0;
			System.out.println("A thief siphoned your gas! It's all gone!");
		}

	}

	@Override
	public String toString() {
		return String.format("The %.1f gallon gas tank contains %.1f gallons of gas.%n", GALLONS, gas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GasTank other = (GasTank) obj;
		return Double.doubleToLongBits(gas) == Double.doubleToLongBits(other.gas);
	}

}
