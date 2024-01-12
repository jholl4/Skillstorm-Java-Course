package com.skillstorm;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Lambda {

    /*
     * LAMBDA
     * - In Java 8, the ability to use a lambda function was added
     * - They were added to support the growing coding paradigm, known as
     * "Functional Programming"
     * - Lambdas provides a means to pass a "function" to another function
     * 
     * Lambdas are often referred as:
     * 1. Lambdas
     * 2. Anonymous Functions
     * 3. Arrow Functions
     * 
     * Functional Programming
     * 1. Functions are first-class citizens
     * - I can pass functions to other functions
     * - I can return functions
     * - In Java, I can NOT pass functions to functions or return functions
     * 2. Believe in the concept known as "pure functions"
     * - This means, that no function should have any "side effects"
     * - By side effects, it means by any behaviour that isn't part of the
     * function's primary purpose
     * - mutating the values of a parameter
     * - calculating some other value
     * - Each function should have one purpose and stick to that
     * 
     * Functional Programming in Java is completely opt-in...Java is OOP at its core
     */

    public static void main(String[] args) {

        /*
         * Lambdas function syntax rules
         * 
         * General structure for a lambda
         * - no argument
         * () -> System.out.println("Hello World");
         * 
         * () - the parenthesis are where my arguments (or lack thereof) for the
         * function go
         * there is no data type for them
         * -> Arrow symbolizes the start of our function body
         * All else - the code that you want the function to run. The function ends at
         * the first semicolon
         * 
         * The way that functions are written
         * - I can only have one line in the function
         * 
         * () -> 1
         * 
         * Non-lambda equivalent:
         * public static int someFunction() {
         * return 1;
         * }
         * 
         * (city1, city2) -> {
         * return city1.getPopulation() - city2.getPopulation();
         * }
         * 
         * If you have one argument you can omit ()
         * This function will take a parameter called num and return num
         * num -> num;
         * num -> { return num; }
         * (num) -> num;
         * 
         * non-lambda equivalent
         * public static int someFunction(int num){
         * return num;
         * }
         * 
         * (num1, num2) -> {return num1 + num2}
         * 
         * Lambdas with {}, if you're trying to return, MUST type return explicitly
         * () -> { 1 } will not work without the return keyword
         * 
         * If not using {} lambda must be done in one line of code
         * () -> System.out.println(); System.out.println(num2);
         * 
         */

        LinkedList<City> cities = new LinkedList<>();
        cities.add(new City("Seattle", 34552));
        cities.add(new City("Tacoma", 45237));
        cities.add(new City("Kennewick", 12397));
        cities.add(new City("Richland", 657321));

        System.out.println("Cities, unsorted: " + cities);

        // Collections.sort(cities, new CityPopulationComparator().reversed());

        // System.out.println("Cities, sorted using our comparator: " + cities);

        // Use lambdas to sort our list of cities
        // Using lambdas, I can define the actual compare method by itself and pass that
        // into the collections.sort()

        Collections.sort(cities, (city1, city2) -> city1.getName().compareTo(city2.getName()));

        Comparator<City> cityNameReverseComparator = (city1, city2) -> {
            if (city1 == null) {
                if (city2 == null) {
                    return 0;
                }
                return 1;
            }
            if (city1.getName() == null) {
                if (city2.getName() == null) {
                    return 0;
                }
                return 1;
            }
            return city2.getName().compareTo(city1.getName());
        };
        // sorts the list according to the order in the specified comparator
        cities.sort(cityNameReverseComparator);
        System.out.println("Reversed sorted list of city names: " + cities);

    }

}
