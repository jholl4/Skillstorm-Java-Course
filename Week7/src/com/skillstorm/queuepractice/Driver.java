package com.skillstorm.queuepractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        State florida = new State("Florida");
        City jacksonville = new City("Jacksonville", 949_000, florida);
        City miami = new City("Miami", 449_000, florida);
        City tallahassee = new City("Tallahassee", 197_000, florida);

        ArrayList<City> floridaCities = new ArrayList<>(Arrays.asList(jacksonville, miami, tallahassee));
        florida.setCapital(tallahassee);
        florida.setCities(floridaCities);

        System.out.println(florida);

        /*
         * This is known as method chaining
         * - I get an object from an object, and with that object, I get the property
         * off
         * of it all at once
         * 
         * Pros:
         * - Don't have to waste space creating local variables
         * - More concise syntax, can do it in one line
         * 
         * Cons:
         * - Becomes redundant/less accessible if you have to use it more than once
         */

    }

}
