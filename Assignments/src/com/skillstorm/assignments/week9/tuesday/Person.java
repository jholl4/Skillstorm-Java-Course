package com.skillstorm.assignments.week9.tuesday;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class Person {

    private String name;
    private final LocalDate DOB;

    public Person(String name) {
        this.name = name;
        DOB = LocalDate.now();
    }

    public Person(String name, LocalDate dOB) {
        this.name = name;
        DOB = dOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    @Override
    public String toString() {
        return name + " born " + DOB.getMonth().getDisplayName(TextStyle.SHORT,
                Locale.ENGLISH) + " "
                + DOB.getDayOfMonth() + ", "
                + DOB.getYear() + " is "
                + Period.between(DOB, LocalDate.now()).getYears() + " years old";
    }

}