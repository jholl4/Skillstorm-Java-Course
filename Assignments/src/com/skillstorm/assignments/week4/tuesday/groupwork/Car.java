package com.skillstorm.assignments.week4.tuesday.groupwork;

public class Car implements Vehicle{
	private String make;
	private String model;
	private int year;
	
	@Override
	public void go() {
		System.out.println("Zoom!");
		
	}
}
