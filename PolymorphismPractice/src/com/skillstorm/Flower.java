package com.skillstorm;

public class Flower {

	private String color;
	private String name;

	public Flower(String color, String name) {
		this.color = color;
		this.name = name;
	}

	public void smell() {
		System.out.printf("This %s %s flower smells good!\n", this.color, this.name);
	}

}
