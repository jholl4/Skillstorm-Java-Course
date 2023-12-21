package day4;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExamples {

    /*
     * LISTS
     * - are indexed and ordered
     * - part of the collections API - any class will inherit from the list class
     * - ONLY WORK WITH OBJECTS
     * 
     * LINKED-LISTS
     * - non-consecutive memory locations
     * - each node contains at least one pointer to the next node
     * - don't have indexes
     * - insertion to the front is constant time O(1)
     * - anywhere else will be O(n)
     * - capacity will always equal size
     * - java linkedlist are always doubly linked
     */

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apples");
        fruits.add("Durians");
        fruits.add("Snake Fruit");
        fruits.add("Star Fruit");
        fruits.add("Kiwano");

        fruits.add(1, "Pears");
        fruits.addLast("Dragon Fruit");
        fruits.addLast("Dragon Fruit");

        System.out.println(fruits);

        /*
         * REMOVE ELEMENTS FROM THE LIST
         */

        // removes the first occurence of the argument object
        fruits.remove("Dragon Fruit");

        // remove all occurences shared with collection in argument
        fruits.removeAll(Arrays.asList("Pears", "Star Fruit"));

        System.out.println(fruits);

        // remove element at specified index
        fruits.remove(2);

        System.out.println(fruits);

        /*
         * ADD ELEMENTS TO LIST
         */

        fruits.add(2, "Oranges");
        fruits.addFirst("Oranges");

        System.out.println(fruits);

    }

}
