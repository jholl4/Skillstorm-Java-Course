package com.skillstorm.groupwork;

import java.util.ArrayList;
import java.util.List;

public class CoffeeFactory {

    List<Coffee> coffees;

    public CoffeeFactory(List<Coffee> coffees) {
        this.coffees = new ArrayList<>(coffees);
    }

    public Coffee orderCoffee(String coffeeType, String roastType) throws CoffeeException {
        System.out.println("So, you would like a " + coffeeType + " with " + roastType + " beans?");
        for (Coffee coffee : coffees) {
            if (coffeeType.equalsIgnoreCase(coffee.getCoffeeType())
                    && roastType.equalsIgnoreCase(coffee.getRoastType())) {
                return new Coffee(coffeeType, roastType);
            }
        }
        throw new CoffeeException("Sorry, we don't serve that here!");

    }

}
