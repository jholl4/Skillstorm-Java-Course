package com.skillstorm.assignments.week11.wednesday;

public class Runner implements Runnable {

    private static int finishLine = 10;
    private static Runner winner;
    private String name; // name of the runner
    private int distance; // distance covered by the runner
    private int speed = 500;

    public Runner() {
    }

    public Runner(String name) {
        this.name = name;
    }

    public Runner(String name, int speed) {
        this(name);
        this.speed = speed;
    }

    @Override
    public synchronized void run() {
        while (distance < finishLine) {
            try {
                Thread.sleep(speed);
                distance++;
                System.out.println(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (distance == finishLine && winner == null) {
                winner = this;
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public static int getFinishLine() {
        return finishLine;
    }

    public static void setFinishLine(int finishLine) {
        Runner.finishLine = finishLine;
    }

    public static Runner getWinner() {
        if (winner != null) {
            return winner;
        }
        return null;
        // return winner;
    }

    public static void setWinner(Runner winner) {
        Runner.winner = winner;
    }

    @Override
    public String toString() {
        return "Runner " + name + " has run " + distance + " miles!";
    }

}
