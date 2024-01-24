package com.skillstorm;

import java.util.Random;

public class BubbleSort {

   /*
    * Bubble Sort
    * - simple sorting algorithm that is going to compare adjacent elements of an
    * array and swaps them if the element on the right is smaller than the element
    * on the left
    * 
    * - time complexity is O(n^2) - slow, not good
    * - not efficient for large data sets
    */

   public static void main(String[] args) {
      Random rand = new Random();
      int[] numbers = new int[10];
      // iterate through the array to fill it with random numbers between 0 and 1000
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(1000);
      }

      System.out.println("Before bubble sort: ");
      printArray(numbers);

      boolean swappedSomething = true;

      while (swappedSomething) {
         swappedSomething = false;

         for (int i = 0; i < numbers.length - 1; i++) { // iterated through the array up to the second to last element
            if (numbers[i] > numbers[i + 1]) { // checking if left value is larger
               swappedSomething = true;
               int temp = numbers[i]; // storing left value in temp variable
               numbers[i] = numbers[i + 1]; // reassigning left value to what right value holds
               numbers[i + 1] = temp; // reassigning right value to the temp stored value from the left
            }
         }
      }

      System.out.println("After the bubble sort: ");
      printArray(numbers);
   }

   public static void printArray(int[] numbers) {
      for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i]);
      }
   }

}
