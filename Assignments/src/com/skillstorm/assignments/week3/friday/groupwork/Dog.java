package com.skillstorm.assignments.week3.friday.groupwork;

import java.util.Objects;

public class Dog extends Animal {

	/* Add some properties */
	private int numOfPuppies;
	private boolean isServiceDog;

	public Dog() {

	}

	public Dog(String name, boolean isAlive, boolean isExtinct) {
		super(name, isAlive, isExtinct);
		this.numOfPuppies = 3;
		this.isServiceDog = false;
	}

	public int getNumOfPuppies() {
		return numOfPuppies;
	}

	public void setNumOfPuppies(int numOfPuppies) {
		this.numOfPuppies = numOfPuppies;
	}

	public boolean isServiceDog() {
		return isServiceDog;
	}

	public void setServiceDog(boolean isServiceDog) {
		this.isServiceDog = isServiceDog;
	}

	/* Override the talk toString and equals methods */

	@Override
	public void talk() {
		System.out.println("Woof!");
	}

	@Override
	public String toString() {
		return String.format("This dog's name is %s. It has %d puppies.", this.getName(), this.numOfPuppies);
	}

	public boolean equals(Dog dog) {
		return this.getName().equals(dog.getName()) && this.numOfPuppies == dog.numOfPuppies;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)return true;
		if(obj==null)return false;
		if(obj.getClass() != this.getClass())return false;
		Dog other = (Dog) obj;
		return Objects.equals(other, this) && other.numOfPuppies == this.numOfPuppies && other.isServiceDog == this.isServiceDog;
	}

}
