package com.skillstorm;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPractice {

    /*
     * every thread has its own stack
     * - so things like methods and instance variables, each thread will have its
     * own copy
     * 
     * volatile - synchronization across threads won't block the other threads from
     * manipulating the variable
     * 
     * static - means that there is only one reference in memory
     * 
     * atomic values - "all at once" and "all or none"
     * 
     * AtomicInteger, AtomicDouble etc.
     * - wrapper class that creates a threadsafe version of a primitive type
     * 
     * all methods are atomic by default
     * 
     * synchronized keyword can be used with a method to make it thread safe
     */

    /*
     * Some issues that can happen with locks
     * DEADLOCK
     * --------
     * - When two or more threads are waiting for each other to release a resource
     * 
     * - Real-world example:
     * - When you think your friend is going to call, but your friend is also
     * waiting for you to call, so no one calls and nothing happens
     * 
     * - How to prevent and resolve dealocks
     * - Avoid nested locks:
     * - Ensure that you only lock one resource at a time or acquire locks in a
     * specific order
     * - Use lock timeouts:
     * - Set a timeout for acquiring locks and release them if the timeout expires
     * 
     * LIVELOCK
     * ---------
     * - When two or more threads are stuck in an alternating loop of transferring
     * states from one another instead of waiting infinitely
     * 
     * - Real-world example:
     * - You and a friend agree to visit a movie theater, but you go to theater A
     * and your friend goes to theater B. Both of you move to the opposite theater
     * to look for the other, taking different paths, and can't find each other,
     * because you swapped places. This hapens in a continuous cycle and you never
     * find each other.
     * 
     * How to prevent and resolve livelocks:
     * - Wait for resources
     * - Prioritize resources or threads
     */

    private static volatile int count = 0;
    private static AtomicInteger atomicCount = new AtomicInteger(0);

    // synchronized could be added below - makes a resource or method thread safe
    public static void increment() {
        count++;
        atomicCount.incrementAndGet();
    }

    public static void main(String[] args) {
        CustomThread t1 = new CustomThread(10000000);
        CustomThread t2 = new CustomThread(10000000);

        t1.start();
        t2.start();

        System.out.println("Current count is " + count);
        System.out.println("Current atomicCount is " + atomicCount);

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Current count after sleep is " + count);
        System.out.println("Current atomicCount after sleep is " + atomicCount);

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Total count after join() is " + count);
        System.out.println("Total atomicCount after join() is " + atomicCount);
    }

}

class CustomThread extends Thread {
    private int loopAmount;

    public CustomThread(int loopAmount) {
        this.loopAmount = loopAmount;
    }

    public void run() {
        for (int i = 0; i < loopAmount; i++) {
            // increments coutn and atomicCount
            ThreadPractice.increment();
        }
    }
}