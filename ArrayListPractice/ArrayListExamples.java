import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

    /*
     * Review arrays
     * 
     * ARRAY
     * - A data structure that holds multiple values contiguously in memory
     * - Fixed size
     * - Elements are accessible using the index starting at zero
     * - Values must be homogenous (of the same data type)
     * - Stored on heap in sequential order
     */

    public static void main(String[] args) {

        String[] namesArray = new String[3]; // Array with 3 spots allocated but no real values
        String[] namesArray2 = { "Thor", "Thanos", "Loki" }; // Creates an array with 3 filled memory locations

        System.out.println(namesArray);
        System.out.println(namesArray2[0]);

        /*
         * 
         * ARRAY LISTS
         * - Dynamic array - grows as you add more data to it
         * - Values must be homogenous
         * - Can't store primitive data types
         * - Has useful methods to make life easier (add, remove, removeAll, etc.)
         * - Starting capacity is 10 unless you initialize it with a different size
         * - Capacity is the number of elements it CAN hold currently
         * - Size is the number of elements that it IS holding currently
         * - Every time you exceed the capacity of the array list, it will dynamically
         * increase in size by 50% rounded up
         * - They are indexed and ordered
         * - ONLY WORK WITH OBJECTS
         * - Can use wrapper classes to store primitive types
         * - Wrapper class wraps around the primitive data type and converts it to an
         * object
         * - int -> Integer
         * - double -> Double
         * - and so on
         * 
         * - Collections API in Java - inherits from the list class
         * - Must import java.util.ArrayList;
         * 
         * 
         */

        ArrayList<String> fruits = new ArrayList<>();

        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("string1", "string2", "string3")); // to instantiate
                                                                                                     // with elements
                                                                                                     // included

        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println(fruits.size());

        /*
         * To access an element in our list we use get()
         */

        String item1 = fruits.get(1); // returns the value at index 1
        System.out.println(item1);

        /*
         * To access the index of a certain element we use indexof()
         */

        System.out.println(fruits.indexOf("pineapple"));

        /*
         * To remove a certain element from a list use remove()
         */

        fruits.remove(2); // removes element from index location
        System.out.println(fruits);
        fruits.remove("mango"); // removes specified object from array list
        System.out.println(fruits);

        fruits.add("strawberry");
        System.out.println(fruits);
        fruits.set(0, "blueberry"); // replaces existing element with the argument element
        System.out.println(fruits);

        fruits.removeAll(fruits);
        System.out.println(fruits);
        System.out.println(fruits.size());

        /*
         * Review Questions
         * ----------------
         * 1. Will the following code compile?
         * ArraryList<int> numbers = new ArrayList<>(); NO
         * ArraryList<Integer> numbers = new ArrayList<>(); YES
         * 
         * 2. What class do ArrayLists inherit from?
         * List class
         * 
         * 3. What's the starting capacity of an ArrayList?
         * 10
         */

    }

}
