package com.skillstorm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer to test FizzBuzz>>");
		int input = scanner.nextInt();
		System.out.println("Your output: " + fizzBuzz(input));
		scanner.close();
	}
	/**
		Given an integer n, for every integer i <= n, the task is to print “FizzBuzz” if i is 
		divisible by 3 and 5, “Fizz” if i is divisible by 3, “Buzz” if i is divisible by 5 or i 
		(as a string) if none of the conditions are true.
	**/
	public static List<String> fizzBuzz(int n) {
		
		 // Initialize an empty result list.
		List<String> result = new ArrayList<String>(); 
		
		 // Iterate on the given number from 1 to n
		for(int i=1; i<=n; i++) {
			
			// If i is divisible by both 3 and 5, add fizzbuzz to the result list
			if(i%3==0 && i%5==0) {
				result.add("fizzbuzz");
			// If i is divisible by 3, add fizz to the result list
			}else if(i%3==0) {
				result.add("fizz");
			// if i is divisible by 5, add buzz to the result list
			}else if(i%5==0) {
				result.add("buzz");
			// If not, convert i to a string and add it to the result list
			}else {
				result.add(Integer.toString(i));
			}
		}
		
		return result;
		
	}

}
