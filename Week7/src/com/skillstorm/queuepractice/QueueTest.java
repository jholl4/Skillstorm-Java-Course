package com.skillstorm.queuepractice;

public class QueueTest {

    public static void main(String[] args) {
        MyQueue<City> cityQueue = new MyQueue<>();
        System.out.println(cityQueue.size() + " " + cityQueue);

        cityQueue.add(new City("Pittsburgh", 302_000));
        cityQueue.add(new City("Seattle", 737_000));
        cityQueue.add(new City("Little Rock", 202_000));

        System.out.println(cityQueue.size() + " " + cityQueue);

        System.out.println("Peeking " + cityQueue.peek());

        System.out.println("Removing " + cityQueue.poll());

        System.out.println("Removing " + cityQueue.peek());
    }

}
