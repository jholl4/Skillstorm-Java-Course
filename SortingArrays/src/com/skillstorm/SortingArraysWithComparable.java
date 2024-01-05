package com.skillstorm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingArraysWithComparable {

    public static void main(String[] args) {

        Random generator = new Random();
        Cat cat1 = new Cat("Fudge", generator.nextInt(10) + 1);
        Cat cat2 = new Cat("Boots", generator.nextInt(10) + 1);
        Cat cat3 = new Cat("Mittens", generator.nextInt(10) + 1);
        Cat cat4 = new Cat("Squishy", generator.nextInt(10) + 1);
        Cat cat5 = new Cat("Lola", generator.nextInt(10) + 1);
        Cat cat6 = new Cat("Shadow", generator.nextInt(10) + 1);
        Cat cat7 = new Cat("Yuki", generator.nextInt(10) + 1);
        Cat cat8 = new Cat("Momi", generator.nextInt(10) + 1);
        Cat cat9 = new Cat("Yugi", generator.nextInt(10) + 1);

        Cat[] cats = new Cat[9];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;
        cats[5] = cat6;
        cats[6] = cat7;
        cats[7] = cat8;
        cats[8] = cat9;

        System.out.println("***********************");
        System.out.println("Cat array before sorting");
        System.out.println("***********************");
        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats, Collections.reverseOrder());

        System.out.println("***********************");
        System.out.println("Cat array after sorting in descending order by cuteness");
        System.out.println("***********************");
        System.out.println(Arrays.toString(cats));

    }

}

class Cat implements Comparable<Cat> {
    String name;
    int cutenessLevel;

    public Cat(String name, int cutenessLevel) {
        this.name = name;
        this.cutenessLevel = cutenessLevel;
    }

    @Override
    public int compareTo(Cat that) {
        return this.cutenessLevel - that.cutenessLevel; // larger cuteness returns positive number
    }

    @Override
    public String toString() {
        return name + " cuteness level: " + cutenessLevel;
    }

}