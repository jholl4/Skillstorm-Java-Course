package com.skillstorm;

import java.util.ArrayList;
import java.util.List;

public class ListOfListExample {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> innerList1 = new ArrayList<>();
        List<Integer> innerList2 = new ArrayList<>();

        innerList1.add(1);
        innerList1.add(4);
        innerList1.add(6);
        innerList1.add(9);
        innerList2.add(3);
        innerList2.add(5);
        innerList2.add(9);
        innerList2.add(1);

        listOfLists.add(innerList1);
        listOfLists.add(innerList2);

        System.out.println(listOfLists);
    }

}
