package com.skillstorm.assignments.week4.thursday.groupwork;

public class HourlyEmployee extends Employee {
	
	private double hoursWorked;
	private double wage; // per hour
	
	public HourlyEmployee(int id, String name, Employee manager) {
		super(id, name, manager);
	}
	
	@Override
	public double calculatePay() {
		return wage * hoursWorked;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	// Throw custom exception that checks valid wage
	// Federal minimum wage is $7.25
	public void setWage(double wage) throws InvalidWageException {
		if(wage < 7.25) {
			throw new InvalidWageException("Must be higher than the federal wage minimum");
		}
		this.wage = wage;
	}
	
	
}
