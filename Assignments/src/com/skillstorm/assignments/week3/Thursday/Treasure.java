package com.skillstorm.assignments.week3.Thursday;

public class Treasure {

    private String name;

    private String description;

    private double value; // worth in dollars

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Treasure() {
		this.name = "gold bar";
		this.description = "The root of all evil?";
		this.value = 1_227_462.20;
	}

	public Treasure(String name, String description, double value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public String toString() {
		return String.format("You see a %s. %s Your treasure-hunting instincts tell you it may be worth around $%,.2f.", name, description, value);
	}
    
    

}
