package com.skillstorm;

import java.util.Random;

public class SelectionSort {
    /*
     * Selection Sort
     * - sorting algorithm that works by repeatedly selecting the smallest element
     * from an unsorted list and giving it to a sorted list
     * 
     * - time complexity is O(n^2)
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];
        // iterate through the array to fill it with random numbers between 0 and 1000
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before selection sort: ");
        BubbleSort.printArray(numbers);

        selectionSort(numbers);

        System.out.println("After selection sort: ");
        BubbleSort.printArray(numbers);

    }

    public static void selectionSort(int[] numbers) {
        // iterate through array up to second to last element
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;

            // loop from current index of outer loop (min) to the end of the array, looking
            // for smaller values than the current value in the outer loop
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                swap(numbers, i, indexOfMin);
            }
        }
    }

    public static void swap(int[] numbers, int index, int indexOfMin) {
        int temp = numbers[index];
        numbers[index] = numbers[indexOfMin];
        numbers[indexOfMin] = temp;
    }

}
