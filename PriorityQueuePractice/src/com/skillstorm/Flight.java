package com.skillstorm;

import java.util.Objects;
import java.util.PriorityQueue;

public class Flight {

    PriorityQueue<Passenger> passengers;

    public Flight() {
        this.passengers = new PriorityQueue<>(new PassengerComparator());
    }

    // public Flight(PriorityQueue<Passenger> passengers) {
    // this.passengers = passengers;
    // }

    public void joinLine(Passenger p) {
        passengers.add(p);
    }

    public void board() {
        System.out.println("Boarding:");
        // for loop and while loop do the same thing--remove and print each passenger
        // one by one using the poll() method
        // for (int i = passengers.size(); i > 0; i--) {
        // System.out.println(" " + passengers.poll());
        // }
        while (!passengers.isEmpty()) {
            System.out.println("removing passengers in while loop");
            System.out.println(" " + passengers.poll());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Flight other = (Flight) obj;
        if (passengers == null) {
            if (other.passengers != null)
                return false;
        } else if (!passengers.equals(other.passengers))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return passengers.toString();
    }

}
