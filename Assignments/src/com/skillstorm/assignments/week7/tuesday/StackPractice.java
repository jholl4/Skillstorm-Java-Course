package com.skillstorm.assignments.week7.tuesday;

import java.util.LinkedList;
import java.util.Stack;

public class StackPractice {

    // I was wondering why the starting code started with a LinkedList, and would
    // have coded this a bit
    // differently if I had known. I'm using that knowledge in the second method.
    public static String reverse(String str) {
        LinkedList<Character> chars = new LinkedList<>();
        Stack<Character> charStack = new Stack<>();
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        for (Character c : chars) {
            charStack.push(c);
        }
        for (int i = 0; i < chars.size(); i++) {
            reverseString += charStack.pop();
        }
        return reverseString;
    }

    public static boolean isBalanced(String expression) {
        LinkedList<Character> parenthesis = new LinkedList<>();
        // YOUR CODE HERE (Hint: Use a loop and the stack methods push and pop)
        for (int i = 0; i < expression.length(); i++) {
            Character c = expression.charAt(i);
            // if opening parenthesis, push to stack
            if (c == '(') {
                // push opening parenthesis onto the stack
                parenthesis.push(c);
            } else if (c == ')') {
                if (parenthesis.isEmpty()) {
                    return false;
                }
                // if c is a ')' we pop the opening parenthesis from the stack because it had a
                // matching
                // closing parenthesis
                parenthesis.pop();
            }
            // if the stack is empty after iterating through the expression characters, this
            // will return true,
            // indicating that we had an even/balanced amount of opening and closing
            // parenthesis
        }
        return parenthesis.isEmpty();

    }

    public static void main(String[] args) {
        String unbalanced = "((()))))))";
        String unbalanced2 = "((())";
        String balanced = "(((((())))))";

        System.out.println("Reversing apple: " + reverse("apple"));
        System.out.println("Reversing pie: " + reverse("pie"));
        System.out.println("Testing unbalanced parenthesis string; should return false: " + isBalanced(unbalanced));
        System.out.println("Testing unbalanced2 parenthesis string; should return false: " + isBalanced(unbalanced2));
        System.out.println("Testing balanced parenthesis string; should return true: " + isBalanced(balanced));
    }

}
