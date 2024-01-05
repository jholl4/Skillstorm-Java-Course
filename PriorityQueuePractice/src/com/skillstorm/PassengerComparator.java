package com.skillstorm;

import java.util.Comparator;

public class PassengerComparator implements Comparator<Passenger> {

    // Returns a negative number if o1.group < o2.group
    // Returns 0 if o1 and o2 are in the same group
    // Returns a positive number if o1.group > o2.group

    public int compare(Passenger o1, Passenger o2) {
        return o1.group - o2.group;
    }

}
