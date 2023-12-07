package com.skillstorm.assignments.week4.thursday.groupwork;

public class TestEmployees {
	
	public static void main(String[] args) {
		Employee employeeSal = new SalaryEmployee(1, "Tim", null);
		Employee employeeHrs = new HourlyEmployee(2, "Carlos", null);
		try {
			((SalaryEmployee) employeeSal).setSalary(6.00);
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}

}
