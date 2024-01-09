package com.skillstorm;

import java.util.HashSet;

public class HashSetDriver {

    public static void main(String[] args) {
        Movie starWars = new Movie("Star Wars", "George Lucas");
        Movie bladeRunner = new Movie("Blade Runner", "Ridley Scott");
        Movie theFifthElement = new Movie("The Fifth Element", "Luc Besson");

        HashSet<Movie> movieCollection = new HashSet<>();
        movieCollection.add(starWars);
        movieCollection.add(bladeRunner);
        movieCollection.add(theFifthElement);

        System.out.println(movieCollection);
        System.out.println("Star Wars hashcode: " + starWars.hashCode());
        System.out.println("Blade Runner hashcode: " + bladeRunner.hashCode());
        System.out.println("The Fifth Element hashcode: " + theFifthElement.hashCode());

        /*
         * Data Structure is just a term used to define some structure that holds data
         * 
         * Each data structure holds their data in their own unique way
         * 
         * Stacks - LIFO (add to the top, remove from the top)
         * 
         * Queues - FIFO (Add to the back, remove from the front)
         * 
         * Lists - Keep data orderly in a list-like format
         * 
         * Sets - Prevent duplicates
         * 
         * Maps - Store key-value pairs
         * 
         * HashSet is an unordered collection
         * - NO duplicates since it is a set
         * - use hashcodes to determine their order
         * - super-quick, almost constant lookup times
         * 
         * HashMap is like HashSet but with key/value pairs
         * 
         */
    }

}
