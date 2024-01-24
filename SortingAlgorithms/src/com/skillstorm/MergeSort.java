package com.skillstorm;

import java.util.Random;

public class MergeSort {

    /*
     * Merge Sort
     * 
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[1_0000_000];
        // iterate through the array to fill it with random numbers between 0 and 1000
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        // System.out.println("Before merge sort: ");
        // printArray(numbers);

        long sortStartTime = System.currentTimeMillis();
        mergeSort(numbers);
        long sortEndTime = System.currentTimeMillis();

        // System.out.println("After merge sort: ");
        // printArray(numbers);
        System.out.println("Sorting took " + (sortEndTime - sortStartTime) + "ms");

    }

    public static void mergeSort(int[] inputArray) {
        // base case is when the array has a length of 1
        if (inputArray.length < 2) {
            return;
        }

        // middle index used to divide the array in half
        int middleIndex = inputArray.length / 2;

        // creating two new arrays for left and right of input array
        int leftHalf[] = new int[middleIndex];
        int rightHalf[] = new int[inputArray.length - middleIndex];

        // copying values into the left array
        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        // copying values into the right array
        for (int i = middleIndex; i < inputArray.length; i++) {
            rightHalf[i - middleIndex] = inputArray[i];
        }

        // recursively call mergesort on both left and right arrays
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);

    }

    public static void merge(int[] mergeArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        // Make iterators for left and right arrays, and for the new merged array
        int leftIterator = 0;
        int rightIterator = 0;
        int mergeIterator = 0;

        // This will run until both left and right arrays have been traversed
        while (leftIterator < leftSize && rightIterator < rightSize) {
            if (leftArray[leftIterator] <= rightArray[rightIterator]) {
                mergeArray[mergeIterator] = leftArray[leftIterator];
                leftIterator++;
            } else {
                mergeArray[mergeIterator] = rightArray[rightIterator];
                rightIterator++;
            }
            mergeIterator++;
        }

        while (leftIterator < leftSize) {
            mergeArray[mergeIterator] = leftArray[leftIterator];
            leftIterator++;
        }
        while (rightIterator < rightSize) {
            mergeArray[mergeIterator] = rightArray[rightIterator];
            rightIterator++;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
