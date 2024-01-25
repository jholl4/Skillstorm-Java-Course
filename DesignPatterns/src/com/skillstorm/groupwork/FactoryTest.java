package com.skillstorm.groupwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryTest {

    public static void main(String[] args) {
        List<Coffee> menu = new ArrayList<>(
                Arrays.asList(
                        new Coffee("Capuccino", "medium"),
                        new Coffee("Espresso", "dark"),
                        new Coffee("Americano", "light")));

        CoffeeFactory starbucks = new CoffeeFactory(menu);

        try {
            Coffee order1 = starbucks.orderCoffee("espresso", "dark");
            Coffee order2 = starbucks.orderCoffee("Americano", "dark");
        } catch (CoffeeException e) {
            System.out.println(e.getMessage());
        }
    }

}
