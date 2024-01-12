package com.skillstorm.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
// import java.util.Scanner;

public class Driver {

    // public static void findNumberGivenCriteria(FindBiggest fb) {
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Please enter a number: ");
    // Integer num1 = scan.nextInt();
    // scan.nextLine();
    // System.out.println("Please enter a number: ");
    // Integer num2 = scan.nextInt();
    // scan.nextLine();
    // System.out.println("Please enter a number: ");
    // Integer num3 = scan.nextInt();
    // scan.nextLine();

    // System.out.println((num1, num2, num3) -> (new FindBiggest<T>().compare(num1,
    // // num2, num3)));
    // // System.out.println(fb.compare(num1, num2, num3));

    // scan.close();

    // }

    public static void main(String[] args) {
        // FindBiggestInteger fbi = new FindBiggestInteger();
        // findNumberGivenCriteria((num1, num2, num3) -> {
        // if (num1 < num2) {
        // if (num1 < num3) {
        // return num1;
        // } else {
        // return num3;
        // }
        // } else {
        // if (num2 < num3) {
        // return num2;
        // } else {
        // return num3;
        // }
        // }
        // });

        // FindBiggest<Integer> sum = (num1, num2, num3) -> num1 + num2 + num3;

        // findNumberGivenCriteria(sum);

        // create a linkedlist of strings and use the collections.sort method to sort
        // the strings in ascending order using a lambda function (compare method or
        // custom comparator)
        // based on length

        LinkedList<String> words = new LinkedList<>(Arrays.asList("This", "is", "a", "sentence", "of", "words"));

        Collections.sort(words, (word1, word2) -> {
            if (word1 == null) {
                if (word2 == null) {
                    return 0;
                }
                return -1;
            } else if (word2 == null) {
                return 1;
            } else {
                return word1.length() - word2.length();
            }
        });

        System.out.println();
        System.out.println("words, sorted by a lambda by length:");
        System.out.println();
        System.out.println(words);
    }

}
