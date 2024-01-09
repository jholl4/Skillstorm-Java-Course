package com.skillstorm.groupwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GradeTest {

    public static void main(String[] args) {

        Student student1 = new Student("Josh", "Holland");
        Student student2 = new Student("Bailey", "Holland");
        Student student3 = new Student("Flynn", "Holland");

        HashMap<Student, List<Double>> mapOfStudents = new HashMap<>();

        List<Double> gradeList1 = new LinkedList<>();
        List<Double> gradeList2 = new LinkedList<>();
        List<Double> gradeList3 = new LinkedList<>();
        gradeList1.addAll(Arrays.asList(100.0, 67.0, 55.0));
        gradeList2.addAll(Arrays.asList(90.0, 57.0, 75.0));
        gradeList3.addAll(Arrays.asList(80.0, 97.0, 95.0));

        mapOfStudents.put(student1, gradeList1);
        mapOfStudents.put(student2, gradeList2);
        mapOfStudents.put(student3, gradeList3);

        GradeBook bookOfGrades = new GradeBook(mapOfStudents);

        bookOfGrades.findTopStudent();
        System.out.printf("Class average is: %.2f", bookOfGrades.calculateClassAverage());

    }

}
