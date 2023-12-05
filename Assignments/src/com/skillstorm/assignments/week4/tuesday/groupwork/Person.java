package com.skillstorm.assignments.week4.tuesday.groupwork;

public class Person {
	
	private String name;
	private Vehicle vehicle;
	
	/**
	 * @param name
	 * @param vehicle
	 */
	public Person(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}


	void commute() {
		this.vehicle.go();
	}

}
