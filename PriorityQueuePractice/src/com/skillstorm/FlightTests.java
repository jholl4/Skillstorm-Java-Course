package com.skillstorm;

public class FlightTests {

    public static void main(String[] args) {

        Flight flight1 = new Flight();

        flight1.joinLine(new Passenger("Rod", 1));
        flight1.joinLine(new Passenger("Sam", 1));
        flight1.joinLine(new Passenger("Shawn", 2));
        flight1.joinLine(new Passenger("Sean", 3));
        flight1.joinLine(new Passenger("Nasser", 4));
        flight1.joinLine(new Passenger("Matt", 4));

        flight1.board();

        System.out.println(flight1.passengers);

    }

}
