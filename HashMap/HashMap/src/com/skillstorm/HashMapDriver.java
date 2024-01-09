package com.skillstorm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapDriver {

    public static void main(String[] args) {
        HashMap<Integer, String> numMap = new HashMap<>();

        // adding to the hashmap using the put() method
        numMap.put(1, "one");
        numMap.put(2, "two");
        numMap.put(3, "three");

        // adds key 4 with a value that already exists in the hashmap
        numMap.put(4, "three");
        numMap.put(4, "two");

        System.out.println(numMap);

        System.out.println(numMap.containsValue("three"));

        /*
         * we want to write a hashmap that is going to "map" hashtags to our posts
         * 
         * this maps a string (hashtag) to a list of associated posts
         * 
         * only with the key do we use the hashcode and equals
         * 
         * for the object we just retrieve the data using the key
         */

        HashMap<String, LinkedList<Post>> hashTags = new HashMap<>();
        Post exploringTheNetherlands = new Post("Exploring the Netherlands", "Come see the Netherlands!",
                "Caroline Ahumada");
        Post sightseeingInJapan = new Post("Sightseeing in Japan", "Japan is such an incredible place!", "Sam Park");
        Post caveDivingInFlorida = new Post("Cave Diving in Florida", "The underwater perspective is amazing!",
                "Rod Palmer");

        hashTags.put("#travel",
                new LinkedList<>(Arrays.asList(exploringTheNetherlands, sightseeingInJapan, caveDivingInFlorida)));
        hashTags.put("#japan", new LinkedList<>(Arrays.asList(sightseeingInJapan)));

        System.out.println(hashTags);

        System.out.println("Displaying all of the #travel posts:");
        LinkedList<Post> posts = hashTags.get("#travel");
        for (Post post : posts) {
            System.out.println(post);
        }

        hashTags.putIfAbsent("#florida", null);

        System.out.println(hashTags.get("#florida"));

        if (hashTags.containsKey("#japan")) {
            System.out.println("Contains posts about japan");
        } else {
            System.out.println("No posts found about japan");
        }

    }

}
