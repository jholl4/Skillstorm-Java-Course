package com.skillstorm.composite;

public class TestComponents {

    public static void main(String[] args) {
        Component root = new Branch(3);

        Branch b1 = new Branch(7);
        Branch b2 = new Branch(2);
        Branch b3 = new Branch(0);

        Leaf lf1 = new Leaf(1);
        Leaf lf2 = new Leaf(11);
        Leaf lf3 = new Leaf(10);

    }

}
