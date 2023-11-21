package com.skillstorm;

import java.util.Scanner;


public class WeatherCheck {
 
    public static void main(String[] args) {
         System.out.println("Welcome to the program for deciding if you");
         System.out.println("Should Play Tennis Today\n");
 
         Scanner scanner = new Scanner(System.in);
         System.out.println("Let's look at the weather conditions.\n");
 
         if (isWeatherGood(scanner)) {
             System.out.println("Yes! Today is a great day to play tennis.");
         } else {
             System.out.println("No, today is not good tennis weather. Maybe go bowling.");
        }
 
        scanner.close();

    }
 
     public static boolean isWeatherGood(Scanner scanner) {
         // Ask the user if it's sunny, overcast or rainy
    	 System.out.print("Enter weather conditions (sunny, overcast or rainy) >");
    	 String conditions = scanner.nextLine();
    	 
    	 // If Overcast, return true, weather is good
    	 if (conditions.equalsIgnoreCase("overcast")) {
    		 return true;
    	 }
    	 
    	 // If sunny, ask if the humidity is high or normal
    	 if (conditions.equalsIgnoreCase("sunny")) {
    		 System.out.println("Is humidity high or normal? >");
    		 String humidity = scanner.nextLine();
    		 if (humidity.equalsIgnoreCase("normal")) {
    			 return true;
    		 }
    	 }
    	 
    	 if(conditions.equalsIgnoreCase("rainy")) {
    		 System.out.print("Is the wind strong or weak? >");
    		 String wind = scanner.nextLine();
    		 if (wind.equalsIgnoreCase("weak")) {
    			 return true;
    		 }
    	 }
    	     	 
    	 
         return false;
     }

}