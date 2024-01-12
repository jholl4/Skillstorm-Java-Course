package com.skillstorm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

        /*
         * Streams
         * - A way to process collection of objects
         * - Not a datastructure, takes in input from collections and arrays
         * - don't change the original data
         * - lazily executed, they're not going to be evaluated until result is needed
         * - stream operations can be chained together to create a pipeline
         * 
         * Different stream functions (think of streams from a list)
         * All of the following functions do NOT mutate the original data set
         * 
         * forEach - takes a stream and performs a lambda expression on each element of
         * the stream. Does NOT return a new stream
         * 
         * map - takes a stream and performs a lambda expression on each element of the
         * stream, but returns a value that is used
         * to construct the new stream
         * 
         * filter - takes a stream and performs a lambda expression on each element of
         * the stream. That lambda will return
         * a true/false where false represents that element should NOT be added to the
         * new stream and true will add data to
         * the new stream
         * 
         * reduce - takes a stream and performs a lambda expression on each element of
         * the stream. It adds the return to
         * an accumulated value
         * - think of a snowball running down a hill, that accumulated value and gets
         * bigger and bigger with each iteration
         * 
         * 
         */

        public static void main(String[] args) {
                LinkedList<String> fruits = new LinkedList<>(
                                Arrays.asList("Apple", "Durian", "Pineapple", "Strawberry", "Mango", "Peach", "Coconut",
                                                "Tomato",
                                                "Blueberry", "Kiwi", "Banana"));

                System.out.println(fruits);

                Stream<String> fruitStream = fruits.stream();

                // iterating through a stream to print out each element in our stream
                fruitStream.forEach(fruit -> System.out.println(fruit));

                // will create a new stream of apples, where each apple corresponds to the fruit
                // in the first stream
                // uses the map operation to transform each element in the stream to an apple
                fruits.stream().map(fruit -> "Apple").forEach(fruit -> System.out.println(fruit));

                // I want to map over all of my fruits and capitalize them
                // collect is a function that collects all the data in the stream and does
                // something with it
                // Collectors.toList() provides a lambda function for transforming our stream
                // back to a list
                List<String> capitalizedFruits = fruits.stream().map(fruit -> fruit.toUpperCase())
                                .collect(Collectors.toList());

                System.out.println(capitalizedFruits);

                // int[] nums = { 1, 4, 6, 2, 8 };

                // example of map functionality, map operation would create a new array, this
                // one doesn't
                // for (int i = 0; i < nums.length; i++) {
                // int num = nums[i];
                // nums[i] = num * 2;
                // }

                // example of forEach functionality
                // for(int num : nums){
                // System.out.println(num);
                // }

                // Filter example
                List<String> fruitsThatBeginWithP = fruits.stream()
                                .filter(fruit -> fruit.toLowerCase().charAt(0) == 'p')
                                .collect(Collectors.toList());
                System.out.println(fruitsThatBeginWithP);

                // new list using stream to find all elements that contain berry
                List<String> berries = fruits.stream().filter(fruit -> fruit.toLowerCase().contains("berry"))
                                .collect(Collectors.toList());

                List<String> berriesToApples = fruits.stream().filter(fruit -> fruit.toLowerCase().contains("berry"))
                                .map(fruit -> "Apple").collect(Collectors.toList());
                System.out.println("berries to apples list: " + berriesToApples);
                System.out.println(berries);

                // reduce example
                List<Integer> numbers = new LinkedList<>(Arrays.asList(2, 8, 4, 1, 8, 34, 87, 34));
                /*
                 * 1. takes our integer list and turns it into a stream of integers
                 * 2. we call the reduce operation on that stream
                 * 3. we first set the initial value of the accumulated value to be 0
                 * 4. we define our lambda to take that accumulator and the current number we
                 * are looking at and then return the new accumulator
                 * 5. finish looping through all the numbers, then return the end accumulated
                 * value
                 */

                int sumOfNumbers = numbers
                                .stream()
                                .reduce(0, (acc, number) -> acc + number);
                System.out.println(sumOfNumbers);

                // int maxOfNumbers = numbers
                // .stream()
                // .reduce(Integer.MIN_VALUE, (max, number) -> {
                // int newMax = Math.max(max, number);
                // return newMax;
                // });

                int maxOfNumbers = numbers.stream().reduce(Integer.MIN_VALUE, (max, number) -> Math.max(max, number));

                Optional<Integer> i = numbers.stream().reduce(Math::max);

                System.out.println(maxOfNumbers);
                System.out.println(i);

        }

}
