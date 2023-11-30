package com.skillstorm;

public class TestCourses {
	
	public static void main(String[] args) {
		// Wreaking havoc
		Course math = new Course("Java Vettec 20231113");
		Student john = new Student();
		Student matt = new Student("Matt", 3.5);
		Student tim = new Student("Tim", 4.0);
		
		
		System.out.println(math);
		
		System.out.println("Enrolling Tim in math.");
		math.enroll(tim);
		System.out.println(tim);
		System.out.println(math);
		
		System.out.println("Withdrawing Tim from math");
		math.withdraw(tim);
		System.out.println(tim);
		System.out.println(math);
		
		
		
		
		
//		course.setNumberOfStudents(500);
//		System.out.println(course);
//		
//		course.setStudents(new Student[500]);
//		System.out.println(course);
	}

}
