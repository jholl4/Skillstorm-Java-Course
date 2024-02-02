package com.skillstorm;

public class MultiThreadingMain {

    public static void main(String[] args) {
        // MultiThreadingIntro myThread = new MultiThreadingIntro();
        // MultiThreadingIntro myThread2 = new MultiThreadingIntro();

        for (int i = 0; i < 5; i++) {
            MultiThreadingIntro myThread3 = new MultiThreadingIntro(i);
            myThread3.start();
        }

        // myThread.start();
        // myThread2.start();
        // myThread.run();
        // myThread2.run();
    }

}
