package com.skillstorm.assignments.week9.tuesday;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        System.out.println("*******************************************");
        System.out.println("Testing Person:");
        System.out.println("*******************************************");

        Person sarah = new Person("Sarah", LocalDate.of(2000, 12, 31));
        Person jack = new Person("Jack", LocalDate.of(2000, 11, 15));

        List<Person> personList = Arrays.asList(sarah, jack);

        System.out.println(sarah);

        System.out.println("*******************************************");
        System.out.println("Testing Appointment alert:");
        System.out.println("*******************************************");

        Appointment birthday = new Appointment(ZonedDateTime.of(2024, 3, 20, 8, 30, 0, 0, ZoneId.systemDefault()),
                Duration.ofMinutes(60));

        birthday.alert();

        System.out.println("*******************************************");
        System.out.println("Testing Age Comparator:");
        System.out.println("*******************************************");
        System.out.println("personList: " + personList);
        Collections.sort(personList, new AgeComparator());
        System.out.println("Sorted personList: " + personList);
    }

}
