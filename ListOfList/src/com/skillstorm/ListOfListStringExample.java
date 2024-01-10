package com.skillstorm;

import java.util.ArrayList;
import java.util.List;

public class ListOfListStringExample {

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
        List<String> innerList1 = new ArrayList<String>();
        List<String> innerList2 = new ArrayList<String>();
        innerList1.add("Josh");
        innerList1.add("Sam");
        innerList1.add("Nasser");
        innerList1.add("Carlos");
        innerList2.add("Rod");
        innerList2.add("Shawn");
        innerList2.add("Matt");
        listOfLists.add(innerList1);
        listOfLists.add(innerList2);

        System.out.println(listOfLists.get(0).get(1));
    }

}
