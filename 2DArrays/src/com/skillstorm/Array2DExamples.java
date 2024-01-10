package com.skillstorm;

public class Array2DExamples {

    /*
     * 2D Arrays
     * - array of arrays
     * - they have rows and columns
     * - rows are horizontal elements
     * - columns are vertical elements
     * 
     * int[row][col] = new int[][]
     * 
     * 
     */

    public static void main(String[] args) {
        int[][] nums = new int[2][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[0][0] = 1;
        nums[0][1] = 3;
        nums[0][2] = 5;
        nums[1][0] = 1;
        nums[1][1] = 2;
        nums[1][2] = 2;
        nums[1][3] = 3;

        System.out.println(countElements(nums));
        int[][] nums2 = { { 1, 2, 2 }, { 2, 3, 1 } };

        System.out.println("how many elements in the nums2" + countElements(nums2));

        System.out.println("sum of nums2 3d array: " + sum(nums2));

        System.out.println("average of nums 3d array elements: " + average(nums));

        System.out.println("Testing max value method: " + maxValue(nums));

        System.out.println("Testing min value method: " + minValue(nums));

        String[][] friendGroups = { { "Josh", "Carlos" }, { "Sam", null, "Nasser" }, { "Sean", "Hunter" } };
        System.out.println(friendGroups[0][0]);

        System.out.println("Concatenating friendGroups 2D array: " + concatenate(friendGroups));
    }

    public static int countElements(int[][] nums) {
        int count = 0;
        // iterates through the rows
        for (int i = 0; i < nums.length; i++) {
            // iterates through the cols
            for (int j = 0; j < nums[i].length; j++) {
                count++;
            }
        }
        return count;
    }

    /**
     * returns the sum of all numbers in a 3d array
     * 
     * @param nums
     * @return
     */
    public static int sum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                // retrieves value of current row(i) and column(j) coordinates
                int value = nums[i][j];
                sum += value;
            }
        }
        return sum;
    }

    public static double average(int[][] nums) {
        return (double) sum(nums) / countElements(nums);
    }

    public static int maxValue(int[][] nums) {
        int max = Integer.MIN_VALUE;
        // iterate through rows
        for (int i = 0; i < nums.length; i++) {
            // iterate through cols
            for (int j = 0; j < nums[i].length; j++) {
                max = Math.max(max, nums[i][j]);
            }
        }
        return max;
    }

    public static int minValue(int[][] nums) {
        int min = Integer.MAX_VALUE;
        // iterate through rows
        for (int i = 0; i < nums.length; i++) {
            // iterate through cols
            for (int j = 0; j < nums[i].length; j++) {
                min = Math.min(min, nums[i][j]);
            }
        }
        return min;
    }

    public static String concatenate(String[][] strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length; j++) {
                if (strs[i][j] != null && strs[i][j].trim() != "") {
                    result += strs[i][j] + " ";
                }
            }
        }
        return result.trim();
    }

}
