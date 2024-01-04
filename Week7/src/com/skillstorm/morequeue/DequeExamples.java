package com.skillstorm.morequeue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExamples {

    public static void main(String[] args) {
        Deque<String> line = new LinkedList<>();
        line.add("Sean");
        line.add("Caroline");

        System.out.println(line);

        line.offer("Steven"); // adds to back of queue and returns true on success or false on failure
        line.add("Shawn"); // adds to back of queue and throws exception if fail

        line.poll(); // removes the first element from the queue and returns its value
        line.pollLast();

        System.out.println(line);

    }

}
