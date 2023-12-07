package com.skillstorm.assignments.week4.thursday.groupwork;

public abstract class Employee {
	
	private long id = 1;
	private String name = "Name";
	private Employee manager = null;
	
	public Employee(int id, String name, Employee manager) {
		this.id = id;
		this.name = name;
		this.manager = manager;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the manager
	 */
	public Employee getManager() {
		return manager;
	}



	/**
	 * @param manager the manager to set
	 */
	public void setManager(Employee manager) {
		this.manager = manager;
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/*
	 * Calculates the pay for the current period.
	 */
	abstract double calculatePay() throws InvalidPayException;
	

}
