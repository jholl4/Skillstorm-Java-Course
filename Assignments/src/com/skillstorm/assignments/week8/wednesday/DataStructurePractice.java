package com.skillstorm.assignments.week8.wednesday;

import java.util.HashMap;

public class DataStructurePractice {

    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog.";
        String sentence2 = "Testing 1 2 3 4 ... testing 1 2 3 4";
        System.out.println();
        System.out.println("Letter counts for sentence 1: " + countLetters(sentence1));
        System.out.println();
        System.out.println("Letter counts for sentence 2: " + countLetters(sentence2));

    }

    public static HashMap<Character, Integer> countLetters(String str) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charMap.containsKey(c) && Character.isLetter(c)) {
                charMap.put(c, (charMap.get(c) + 1));
            } else if (Character.isLetter(c)) {
                charMap.put(c, 1);
            }
        }
        return charMap;
    }

}
