package com.skillstorm.stackpractice;

public class StackTest {

    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack<>();

        stack1.push(32);
        stack1.push(54);
        stack1.push(11);
        stack1.push(67);
        stack1.push(99);

        System.out.println(stack1);

        System.out.println("Popping " + stack1.pop());
        System.out.println("Popping " + stack1.pop());

        System.out.println(stack1);
    }

}
