package com.skillstorm;

public class MultiThreadingIntro extends Thread {

    int threadNumber;
    /*
     * Threads
     * - sequence of executed instructions
     * 
     * How to create a thread?
     * - extending the Thread class
     * - implementing a Runnable interface
     */

    public MultiThreadingIntro(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " from " + threadNumber);
        }
    }
}
