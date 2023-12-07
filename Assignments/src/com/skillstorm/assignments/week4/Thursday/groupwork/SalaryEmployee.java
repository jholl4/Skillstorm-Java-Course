package com.skillstorm.assignments.week4.thursday.groupwork;

public class SalaryEmployee extends Employee {

	private double salary; // annual salary
	
	public SalaryEmployee(int id, String name, Employee manager) {
		super(id, name, manager);
	}
	
	@Override
	// calculating for one month's pay based on a 4 week month
	public double calculatePay() {
		return salary * 2;
	}

	public double getSalary() {
		return salary;
	}

	// salary for every two weeks
	public void setSalary(double salary) throws InvalidSalaryException {
		if(salary < 580) {
			throw new InvalidSalaryException("Please ensure salary is above the minimum");
		}
		this.salary = salary;
	}
	
	
}
