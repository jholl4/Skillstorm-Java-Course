package com.skillstorm.assignments.week3.friday.groupwork;

public class Cat extends Animal{
	/* Add some properties*/
	private int numLivesLeft;
	private double weightInLbs;
	
	
	public Cat() {
		super("nameless stray", true, false);
		this.numLivesLeft = 9;
		this.weightInLbs = 5;
	}
	
	public Cat(String name, boolean isAlive, boolean isExtinct) {
		super(name, isAlive, isExtinct);
		this.numLivesLeft = 9;
		this.weightInLbs = 5;
	}
	
	

	public int getNumLivesLeft() {
		return numLivesLeft;
	}



	public void setNumLivesLeft(int numLivesLeft) {
		this.numLivesLeft = numLivesLeft;
	}



	public double getWeightInLbs() {
		return weightInLbs;
	}



	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}



	@Override
	public void talk() {
		System.out.println("Meow!");
	}
	
	@Override
	public Cat reproduce() {
		return new Cat(this.getName() + " Jr", true, false);
	}

	@Override
	public String toString() {
		return String.format("This cat's name is %s. It has %d lives left.", this.getName(), this.numLivesLeft);
	}
	
	
	
	
	
}
