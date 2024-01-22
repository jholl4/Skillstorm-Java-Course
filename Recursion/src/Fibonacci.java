public class Fibonacci {

    // Fibonacci sequence

    // a sequence of numbers that starts with 0 and 1, and each number after it is a
    // sum of the previous two numbers in the sequence

    // 0,1,1,2,3,5,8,13,21,34

    // f(n) = f(n+1) + f(n-2)

    // f(8) = f(7) + f(6)
    // f(7) = f(6) + f(5)

    public static void main(String[] args) {
        int n = -3;

        System.out.println("Number " + n + " in the fibonacci sequence is " + fibonacci(n));

    }

    private static long fibonacci(int n) {
        // base case
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
