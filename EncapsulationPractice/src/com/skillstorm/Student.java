package com.skillstorm;

public class Student {
	
	private String name;
	private double gpa;
	private Course[] courses;
	private static int maxCourses = 6;
	private int numOfCourses;
	
	public Student() {
		this.name = "John Doe";
		this.gpa = 1.5;
		this.courses = new Course[maxCourses];
	}
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.courses = new Course[maxCourses];
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name==null || name=="") {
			System.out.println("Please enter a valid name.");
			return;
		}
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		if(!(gpa<=0 && gpa<=4.0)){
			System.out.println("GPA out of range.");
			return;
		}
		this.gpa = gpa;
	}
	
	public int getMaxCourses() {
		return maxCourses;
	}
	
	public static void setMaxCourses(int setMaxCourses) {
		if(maxCourses<0){
			System.out.println("Must be above zero.");
			return;
		}
		maxCourses = setMaxCourses;
	}
	
	public Course[] getCourses() {
		return courses;
	}
	
	public int getNumOfCourses() {
		return numOfCourses;
	}
	
	public void enroll(Course course) {
		if(course == null) {
			System.out.println("Please enter a non-null course");
			return;
		}else {
			this.courses[numOfCourses] = course;
			this.numOfCourses++;
		}
		
	}
	
	public void withdraw(Course course) {
		for(int i=0; i<numOfCourses; i++) {
			if(this.courses[i]==course) {
				this.courses[i] = null;
				this.numOfCourses--;
				break;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%s attends %d course(es).", name, numOfCourses);
	}
	
	
	
}