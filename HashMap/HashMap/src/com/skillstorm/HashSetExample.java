package com.skillstorm;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);

        System.out.println(nums);

        Set<String> cookies = new HashSet<>();
        cookies.add("choccy chip");
        cookies.add("oatmeal scotchie");
        cookies.add("ginger snap");

        System.out.println(cookies);

        System.out.println(cookies.size());

        cookies.remove("ginger snap");
        System.out.println("can we remove ginger snap a second time?" + cookies.remove("ginger snap"));

        System.out.println("is the set empty? " + cookies.isEmpty());
        System.out.println();
        System.out.println("Clearing cookies set...");
        System.out.println();

        cookies.clear();

        System.out.println("is the set empty? " + cookies.isEmpty());

    }

}
