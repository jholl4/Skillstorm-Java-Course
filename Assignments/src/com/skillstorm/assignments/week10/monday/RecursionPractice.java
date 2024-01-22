package com.skillstorm.assignments.week10.monday;

public class RecursionPractice {

    public static void main(String[] args) {

        System.out.println("Problem 1: sum of evens between 3(inclusive) and 8(exclusive): " + sumEvens(3, 8));
        System.out.println("Problem 1: sum of evens between 5(inclusive) and 23(exclusive): " + sumEvens(5, 23));
        System.out.println("Problem 1: sum of evens between 3(inclusive) and 15(exclusive): " + sumEvens(3, 15));

        System.out.println(containsLarger(new int[] { 70, 3, 7, 13, 56 }, 65, 2) + " should be false");
        System.out.println(containsLarger(new int[] { 70, 3, 7, 13, 56 }, 65, 0) + " should be true");
        System.out.println(containsLarger(new int[] { 70, 3, 7, 13, 56 }, 2, 1) + " should be true");

    }

    /*
     * PROBLEM 1
     * Sum the even numbers between start (inclusive) and end (exclusive). (Throw an
     * error if the user hands in a value end < start)
     */

    public static int sumEvens(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("End must be larger than or equal to start");
        }

        // base case--if we've reached the end of the number range
        if (start == end) {
            return 0;
        }

        // if start is odd, recursively return/add next number in the sequence
        if (start % 2 != 0) {
            return sumEvens(start + 1, end);
        }

        // if start is even, but is the second-to-last in the range, just return/add
        // start
        if (start == end - 1) {
            return start;
        }

        // if start is even and not the second to last in the range, recursively skip
        // ahead to return/add the next even number
        return start + sumEvens(start + 2, end);

    }

    /*
     * PROBLEM 2
     * Recursively determine if an int[] array contains any values larger than n.
     * starting the search at the specified index (inclusive)
     */

    public static boolean containsLarger(int[] nums, int n, int fromIndex) {

        // base case--end of array
        if (fromIndex == nums.length - 1) {
            return nums[fromIndex] > n;
        }

        // return true if current number is larger
        if (nums[fromIndex] > n) {
            return true;
        }

        // if current number is not larger, recursively check the next number in the
        // array
        return containsLarger(nums, n, fromIndex + 1);
    }

}
