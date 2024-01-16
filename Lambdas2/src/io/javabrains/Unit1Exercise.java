package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));

        // Step 1: sort list by last name
        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        people.stream().forEach(person -> System.out.println(person));
        System.out.println("********************************");

        // Step 3: Create a method that prints all people that have last name beginning
        // with C
        people.stream().filter(person -> person.getLastName().startsWith("C"))
                .forEach(person -> System.out.println(person));

        // Have the methods accept behavior instead of hard coding them.
        // For example, pass in behavior to find if a person's last name begins with 'C'
    }

}
