package com.skillstorm;

import java.util.Random;

public class InsertionSort {

    /*
     * Insertions Sort
     * - sorting algorithm that is split into a sorted and unsorted list where
     * elements from the unsorted list are inserted into the sorted list in the
     * correct position
     * - similar to sorting a deck of cards
     * 
     * - time complexity is O(n^2)
     * - best case is O(n) (if array is already sorted)
     * - best not to use with large data sets
     * 
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];
        // iterate through the array to fill it with random numbers between 0 and 1000
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before insertion sort: ");
        printArray(numbers);
        insertionSort(numbers);
        System.out.println("After insertion sort: ");
        printArray(numbers);

    }

    public static void insertionSort(int[] inputArray) {
        // no need to start at the first index, consider it already sorted
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;
            // will walk back to the beginning of the array and only stop if we've hit the
            // beginning of the array or if we run into a value that is less than or equal
            // to the current value
            while (j >= 0 && inputArray[j] > currentValue) {
                // for each element that we run into that is greater than the current value, we
                // shift it to the right
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
