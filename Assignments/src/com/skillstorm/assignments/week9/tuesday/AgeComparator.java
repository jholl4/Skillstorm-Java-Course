package com.skillstorm.assignments.week9.tuesday;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int age1 = Period.between(o1.getDOB(), LocalDate.now()).getDays();
        int age2 = Period.between(o2.getDOB(), LocalDate.now()).getDays();
        return age1 - age2;
    }

}
