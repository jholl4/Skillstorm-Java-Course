package com.skillstorm.assignments.week5.tuesday.groupwork;

import java.util.ArrayList;

public class StudentUtilities {
	
	/**
	 * For each student in the array, return the student with a 4.0 GPA
	 * 
	 * @param students A list of students
	 * @return A list of students with all A's
	 */
	public static ArrayList<Student> getStraightAStudents(ArrayList<Student> students)throws IllegalArgumentException {
		if (students == null || students.isEmpty()) throw new IllegalArgumentException("Argument must"
				+ " be a student list with non-null elements and not empty");
		ArrayList<Student> straightAStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.calculateGPA() == 4.0) {
				straightAStudents.add(student);
			}
		}
		return straightAStudents;
	}
	
	/**
	 * Return all students at or above 2.5 GPA
	 * 
	 * @param students
	 * @return
	 */
	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students)throws IllegalArgumentException {
		if (students == null || students.isEmpty()) throw new IllegalArgumentException("Argument must"
                + " be a student list with non-null elements and not empty");
		ArrayList<Student> targetStudents = new ArrayList<>();
		for(Student student : students){
			if(student.calculateGPA() >= 2.5){
				targetStudents.add(student);
			}
		}
		return targetStudents;
	}
	
	/**
	 * return all students with a GPA of provided gpa or higher
	 * 
	 * @param students
	 * @param gpa
	 * @return
	 */
	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students, double gpa) throws IllegalArgumentException {
		if (students == null || students.isEmpty())throw new IllegalArgumentException("Argument must"
				+ " be a student list with non-null elements and not empty");
		ArrayList<Student> gpaStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.calculateGPA() >= gpa) {
				gpaStudents.add(student);
			}
		}
		return gpaStudents;
	}

}
