package MathRandom;

import java.util.Random;

/*
 * Math.random()
 * - generates a preudorandom number where 0.0 <= Math.random() < 1.0
 * - minimum 0.0
 * - maximum 0.9999 repeating, but never 1
 * 
 * Random class
 *  - 
 * 
 */

public class NumberGenerator {

    public static void main(String[] args) {
        double rand = Math.random();
        System.out.println(rand);
        System.out.println();

        /*
         * generate a random int between 0 and 10
         */

        int randomNum = (int) (Math.random() * 11); // casting it to int will remove the decimal value, essentially
                                                    // rounding down
        System.out.println(randomNum);

        /*
         * generate a range of random numbers from 1 to 10
         */

        int min = 1;
        int max = 10;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int randomNum1 = (int) (Math.random() * range + min);
            System.out.println(randomNum1);
        }

        /*
         * Examples using the Random class
         */

        System.out.println("-----------------Random Class Examples-----------------");

        Random random = new Random();

        int x = random.nextInt();
        float y = random.nextFloat();
        int z = random.nextInt(10); // random number from 0 to 9
        int v = random.nextInt(10) + 1;

        int numAmount = 10;
        int maximum = 21;
        int minimum = 15;
        int numRange = maximum - minimum;
        for (int i = 0; i < numAmount; i++) {
            int a = random.nextInt(numRange) + minimum;
            System.out.println("Printing number between 15 and 21: " + a);
        }

        System.out.println("nextInt() example: " + x); // generates all possible values for an int, positive or negative
        System.out.println("nextFloat() example: " + y); // generates a float between 0 and 1, but not 1
        System.out.println("nextInt() with bound example: " + z); // generates a random number from 0 to 9
        System.out.println("nextInt() with a bound of 10 with 1 added: " + v);

    }

}
