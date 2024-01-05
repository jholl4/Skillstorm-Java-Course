package com.skillstorm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingArraysWithComparator {

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

        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        catList.add(cat6);
        catList.add(cat7);
        catList.add(cat8);
        catList.add(cat9);

        System.out.println("***********************");
        System.out.println("Cat list before sorting");
        System.out.println("***********************");
        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats, new AlphabeticalCatComparator());
        Arrays.sort(cats, new AlphabeticalCatComparator().reversed());

        System.out.println("***********************");
        System.out.println("Cat list after sorting in alphabetical order");
        System.out.println("***********************");
        System.out.println(Arrays.toString(cats));

        System.out.println("***********************");
        System.out.println("Cat arrayList before sorting");
        System.out.println("***********************");
        System.out.println(catList);

        catList.sort(Comparator.reverseOrder());

        System.out.println("***********************");
        System.out.println("Cat arrayList after sorting in descending order by cuteness");
        System.out.println("***********************");
        System.out.println(catList);

    }

}

// Create a comparator that orders cats by name
// Step 1: implement comparator
// Step 2: override the method compare
class AlphabeticalCatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.name.compareTo(o2.name);
    }
}