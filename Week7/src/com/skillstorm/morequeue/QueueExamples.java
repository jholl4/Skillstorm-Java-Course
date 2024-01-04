package com.skillstorm.morequeue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();
        customers.add("Bobby");
        customers.add("Sally");
        customers.add("Jimmy");

        customers.offer("Stacy"); // pretty much the same as add, this is preferred because it returns a boolean
                                  // instead of throwing an exception

        System.out.println(customers);

        int i = 1234567890;
        float f = i;
        System.out.println("f: " + f);
        System.out.println("i: " + i);
        System.out.println(i - (int) f);

    }

}
