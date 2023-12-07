package com.skillstorm.assignments.week4.thursday;

@SuppressWarnings("serial")
public class InvalidSizeException extends IllegalArgumentException{
	
	public InvalidSizeException() {
		super("Invalid size");
	}
	
	public InvalidSizeException(String message) {
		super(message);
	}

}
