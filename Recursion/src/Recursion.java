public class Recursion {

    public static void main(String[] args) {
        sayHey(3);
    }

    private static void sayHey(int count) {
        System.out.println("HEY");

        // This is the base case
        if (count <= 1) {
            return;
        }

        // This is our exit strategy, based on our base case
        // Allows the method to work toward the base case
        sayHey(count - 1);
    }

    /*
     * Recursion
     * - To make a method call of the same method within itself
     * 
     * - can lead to StackOverflowError
     * 
     * - we can prevent this by implementing a base case
     * 
     * - base case is our exit strategy (end of a road block) that lets us know when
     * we've reached the end of the solution
     * 
     * - Anything we can do recursively, we can also do iteratively
     * - use while loops to achieve the same goal
     * 
     * StackOverflowError
     * - if your call stack grows too much it will overflow
     */

}
