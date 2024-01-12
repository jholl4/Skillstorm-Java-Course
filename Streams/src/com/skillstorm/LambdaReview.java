package com.skillstorm;

// Functional interface must have ONLY one ABSTRACT method
// And functionalinterface annotation
@FunctionalInterface
interface Action {

    abstract void act(int num);

}

public class LambdaReview {

    public static void performActionNumber100(Action action) {
        action.act(100);
    }

    /*
     * In order to use Lambdas in Java, a functional interface is required
     * 
     * Lambdas forego the requirement of creating a class that satisfies the
     * interface
     * because these functional interfaces only have one method to implement, we
     * only have
     * to define a function instead
     * 
     */

    public static void main(String[] args) {
        // setting the actionImplementation to a function that represents the act method
        Action actionImplementation = (num) -> {
            System.out.println("The number provided is: " + num);
        };

        performActionNumber100(actionImplementation);

        Action numberDoubler = (num) -> System.out.println("The number doubled is: " + (num * 2));

        performActionNumber100(numberDoubler);

        actionImplementation.act(500);

        performActionNumber100((num -> {
            System.out.println("The original number is: " + num);
            System.out.println("The number divided by 10 is: " + (num / 10));
        }));
    }

}
