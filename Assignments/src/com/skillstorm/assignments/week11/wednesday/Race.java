package com.skillstorm.assignments.week11.wednesday;

public class Race {

    public static void main(String[] args) {
        Runner sonic = new Runner("Sonic", 500);
        Runner knuckles = new Runner("Knuckles", 1000);

        Thread sonicThread = new Thread(sonic);
        Thread knucklesThread = new Thread(knuckles);

        knucklesThread.start();
        sonicThread.start();

        try {
            sonicThread.join();
            knucklesThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("AND THE WINNER IS..." + Runner.getWinner().getName() + "!!!");
    }

}
