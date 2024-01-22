public class MoreFibonacci {

    /*
     * We want to store all of the known fibonacci numbers
     * - referred to as "memoization"
     * - can think of it as caching
     * 
     * - cache these operations so that we only do each one once
     */

    private static Long[] fibs = new Long[1000];

    // static block is used to execute code as soon as a file is loaded
    // initializing static values in this case
    static {
        fibs[0] = (long) 0;
        fibs[1] = (long) 1;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    /**
     * Fibonacci method using memoization to prevent repetitive calls of the method
     * on the same fibonacci number
     * 
     * @param n
     * @return
     */
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long fibMinus1;
        long fibMinus2;

        if (fibs[n - 1] != null) {
            // we already have the fibonacci number and can use it
            fibMinus1 = fibs[n - 1];
        } else {
            // calculating the fibonacci number if we don't already have it
            fibMinus1 = fibonacci(n - 1);
            // here is where we memoize it
            fibs[n - 1] = fibMinus1;
        }

        if (fibs[n - 2] != null) {
            // we already have the fibonacci number and can use it
            fibMinus2 = fibs[n - 2];
        } else {
            // calculating the fibonacci number if we don't already have it
            fibMinus2 = fibonacci(n - 2);
            // here is where we memoize it
            fibs[n - 2] = fibMinus2;
        }
        long answer = fibMinus1 + fibMinus2;
        fibs[n] = answer;
        return answer;
    }

    /**
     * Not using memoization in this case will result in much longer processing time
     * with
     * larger numbers, due to repetitive calls of the calculation on the same
     * numbers
     * 
     * @param n
     * @return
     */
    public static long fibonacciNoMemo(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciNoMemo(n - 1) + fibonacciNoMemo(n - 2);
    }

    // public static String spellMyName(String name){
    // return "";
    // }

}
