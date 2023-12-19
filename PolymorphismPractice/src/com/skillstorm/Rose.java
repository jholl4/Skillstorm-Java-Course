package com.skillstorm;

public class Rose extends Flower {

	boolean thorny;

	public Rose(String color, String name, boolean thorny) {
		super(color, name);
		this.thorny = thorny;
	}

	public void smell() {
		// System.out.printf("This %s %s rose smells good!\n", this.color, this.name);
	}

}
