package com.skillstorm;

import java.util.Scanner;

public class IfElseIfPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Setting up an if else if block
		// based on a decision tree
		System.out.print("Has the \"Use by\" date on the milk passed? yes/no: >");
		boolean hasUseByDatePassed = scanner.next;
		boolean isSpoiled = true;
		boolean wasTheUseByDateMoreThan3DaysAgo = false;
		boolean doesItSmellFunny = false;
		
		if(!hasUseByDatePassed) {
			// Not spoiled?
			isSpoiled = false;
		}else if(!wasTheUseByDateMoreThan3DaysAgo){
			isSpoiled = false;
		}else if(!doesItSmellFunny) {
			isSpoiled = false;
		}else {
			isSpoiled = true; // This is redundant
		}
		System.out.println("The milk ");

	}

}
