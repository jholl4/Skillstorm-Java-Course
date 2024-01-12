package com.skillstorm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> desserts = Arrays.asList("chocolate chip cookies", "double chocolate brownies",
                "strawberry ice cream", "chocolate ice cream", "flan", "tres leches cake", "tiramisu");
        List<String> chocolateDesserts = desserts.stream()
                .filter(dessert -> dessert.toLowerCase().contains("chocolate")).collect(Collectors.toList());
        System.out.println(chocolateDesserts);

        List<Integer> nums = Arrays.asList(4, 8, 3, 8, 23);
        Integer sum = nums.stream().peek(System.out::println).reduce(0, (x, y) -> {
            System.out.println("x = " + x + ", y = " + y);
            return x + y;
        });
        System.out.println(sum);



        List<House> houses = Arrays.asList(new House("Orange", 2150), new House("Blue", 2300),
                new House("Brown", 2000));
        int largest = houses.stream().peek(System.out::println).map(house -> house.sqrft).peek(System.out::println)
                .reduce(0, (x, y) -> {
                    System.out.println("comparing " + x + " and " + y);
                    return Math.max(x, y);
                });
        System.out.println("Largest house is " + largest + " square feet");

    }
}

class House {
    String color;
    int sqrft;

    public House() {
    }

    public House(String color, int sqrft) {
        this.color = color;
        this.sqrft = sqrft;
    }

    @Override
    public String toString() {
        return color + " " + sqrft + "sq ft house";
    }
}
