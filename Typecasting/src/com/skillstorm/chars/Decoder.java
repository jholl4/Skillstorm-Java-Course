package com.skillstorm.chars;

import java.util.Scanner;

public class Decoder {
	
	public static void main(String[] args) {
		// Write a program that prompts the user for a message to encode
		// encode it by using rotation
		// decode it and print it
		// message must be 10 characters long
		
		// encoding strategy is that each letter is rotated a different amount
		// 1
		// 3
		// 5
		// 7
		// 9
		// 11
		// 13
		// 15
		// 17
		// 19
		
		Scanner decScan = new Scanner(System.in).useDelimiter("");
		
		System.out.print("Please enter your encoded message");
		String encMessage = decScan.nextLine();
		
		
		char first = (char) (encMessage.charAt(0) - 1);
		char second = (char) (encMessage.charAt(1) - 3);
		char third = (char) (encMessage.charAt(2) - 5);
		char fourth = (char) (encMessage.charAt(3) - 7);
		char fifth = (char) (encMessage.charAt(4) - 9);
		char sixth = (char) (encMessage.charAt(5) - 11);
		char seventh = (char) (encMessage.charAt(6) - 13);
		char eighth = (char) (encMessage.charAt(7) - 15);
		char ninth = (char) (encMessage.charAt(8) - 17);
		char tenth = (char) (encMessage.charAt(9) - 19);
		
		System.out.println("Your decoded message is: " + (char)first + (char)second + (char)third + 
				(char)fourth + (char)fifth + (char)sixth + (char)seventh + (char)eighth + 
				(char)ninth + (char)tenth);
		
		decScan.close();
		
		
		
	}

}
