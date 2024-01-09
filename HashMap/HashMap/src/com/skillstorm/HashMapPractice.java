package com.skillstorm;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("accuracy", "freedom from mistake or error");
        dictionary.put("accuracy", "adapted for extremely accurate measurement or operation");
        dictionary.put("consistency",
                "conformity in the application of something, typically that which is necessary for the sake of logic, accuracy, or fairness.");

        System.out.println();
        System.out.println("Consistency before adding duplicate: " + dictionary.get("consistency"));
        System.out.println();

        dictionary.put("consistency",
                "agreement or harmony of parts or features to one another or a whole");

        System.out.println("Consistency after using put() to add duplicate: " + dictionary.get("consistency"));
        System.out.println();

        dictionary.putIfAbsent("consistency", "harmony of conduct or practice with profession");

        System.out.println("Consistency after adding duplicate with putifabsent(): " + dictionary.get("consistency"));

        HashMap<Integer, String> codes = new HashMap<>();

        codes.put(133, "happy");
        codes.put(156, "angry");

        codes.put(null, null);

        codes.put(null, "nothing");
        codes.replace(null, "not specified");
        codes.replace(5, "unknown"); // can't replace a key that doesn't exist

        System.out.println(codes);
        System.out.println(codes.keySet());

        /*
         * SUMMARY
         * .put() - create or overwrite if it doesn't exist
         * .putIfAbsent() - create (does NOT overwrite)
         * .replace() - overwrites (does NOT create)
         * 
         * Retrieval options
         * .get() - get one value
         * .keySet() get all of the keys
         * .values() - gets a collection of all the values
         * 
         */

        Map<Integer, Integer> nums = new HashMap<>();

        nums.put(1, 111);
        nums.put(2, 222);
        nums.replace(2, 333); // key 2 gets replaced
        nums.put(null, 000); // can add null values and keys
        nums.replace(3, 333); // won't work because key 3 does not exist and replace won't create it
        nums.put(1, 999); // this will work, 1's value gets replaced

        System.out.println("nums entry set: " + nums.entrySet());

        for (Object def : dictionary.entrySet()) {
            System.out.println(def);
        }

        System.out.println(nums);

    }

}
