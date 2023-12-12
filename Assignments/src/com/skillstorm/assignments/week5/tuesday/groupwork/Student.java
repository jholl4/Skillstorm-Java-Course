package com.skillstorm.assignments.week5.tuesday.groupwork;

import java.util.ArrayList;

public class Student {
	
	///////////////////////////////////////////////
	// Static properties
	private static long numberStudents = 0;
	
	///////////////////////////////////////////////
	// Instance properties
	private final long studentId;
	
	private String name;
	
	private final ArrayList<String> grades;;
	
	///////////////////////////////////////////////
	// Constructors
	public Student() {
		this("unknown");
	}
	
	public Student(String name) {
		this.name = name;
		this.studentId = numberStudents++;
		this.grades = new ArrayList<>();
	}
	
	///////////////////////////////////////////////
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStudentId() {
		return studentId;
	}
	
	public ArrayList<String> getGrades() {
		return new ArrayList<>(grades); // return a copy
	}
	
	///////////////////////////////////////////////
	// Methods
	public void addGrade(String grade) {
		if (!validGrade(grade.toUpperCase()))
			return;
		this.grades.add(grade.toUpperCase());
	}
	

	public void updateGrade(int index, String newGrade) {
		if (!validGrade(newGrade))
			return;
		this.grades.set(index, newGrade);
	}
	/**
	 * return true if grade is ABCD or F
	 * @param grade
	 * @return
	 */
	static boolean validGrade(String grade) {
		if(grade == null || grade == "") return false;
		if(grade.equalsIgnoreCase("A")
				|| grade.equalsIgnoreCase("B")
				|| grade.equalsIgnoreCase("C")
				|| grade.equalsIgnoreCase("D")
				|| grade.equalsIgnoreCase("F")) {
			return true;
		}
		return false;
	}
	
	/**
	 * Calculate GPA
	 * 
	 * @return
	 */
	public double calculateGPA() {
		double calculatedGpa = 0.0;
		for(int i = 0; i < grades.size(); i++){
			calculatedGpa += convert(grades.get(i));
		}
		return calculatedGpa / grades.size();
	}
	
	/**
	 * Converts the String "A" to a number 4.0
	 * Converts the String "B" to a number 3.0
	 * Converts the String "C" to a number 2.0
	 * Converts the String "D" to a number 1.0
	 * Converts the String "F" to a number 0.0
	 * @param grade
	 * @return
	 * @throws IllegalArgumentException if grade is not A, B, C, D, or F
	 */
	public double convert(String grade) {
		switch (grade) {
		case "A":
			return 4.0;
		case "B":
			return 3.0;
		case "C":
		    return 2.0;
		case "D":
			return 1.0;
		case "F":
			return 0.0;
		default:
			return 0.0;
		}
	}
	
	public String toString() {
		return String.format("Student %s has a gpa of %.2f", name, calculateGPA());
	}

}
