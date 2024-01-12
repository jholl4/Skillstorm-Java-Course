package com.skillstorm.functionalinterface;

/*
 * Every interface with a single abstract method is known as a Functional Interface
 * Instances of functional interfaces can be created with lambda expressions
 */

@FunctionalInterface // Will generate an error if the functional interface doesn't satisfy the
                     // condition it should
public interface FindBiggest<T> {

    public abstract T compare(T item1, T item2, T item3);

}
