package com.skillstorm.assignments.week4.thursday;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a double>>>");
		
		double userRadius = scanner.nextDouble();
		
		try{
			Circle circle = new Circle(userRadius);
			System.out.println(circle);
		}catch(Exception e) {
			Circle circle = new Circle(1);			
			System.out.println(circle);
		}
		
		
		scanner.close();

	}

}
