package com.skillstorm.groupwork;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class GradeBook {

    private HashMap<Student, List<Double>> grades = new HashMap<>();

    public GradeBook() {
    }

    public GradeBook(HashMap<Student, List<Double>> grades) {
        this.grades = grades;
    }

    public static Double calculateGrade(List<Double> grades) {
        // needed to add this null check because the topStudent variable in
        // findTopStudent() was throwing a nullpointerexception
        if (grades == null) {
            return 0.0;
        }
        double overallGrade = 0;
        int gradeCounter = 0;
        for (Double grade : grades) {
            overallGrade += grade;
            gradeCounter++;
        }
        overallGrade = overallGrade / gradeCounter;
        return overallGrade;
    }

    public Student findTopStudent() {
        if (grades == null)
            return null;
        Student topStudent = null;
        for (Entry<Student, List<Double>> studentPair : grades.entrySet()) {
            if (calculateGrade(studentPair.getValue()) > calculateGrade(grades.get(topStudent))) {
                topStudent = studentPair.getKey();
            }
        }
        System.out.printf("Top student is %s: %s%n", topStudent.getFirstName(), grades.get(topStudent));
        return topStudent;
    }

    public Double calculateClassAverage() {
        Double classAverage = 0.0;
        int studentCounter = 0;
        for (Entry<Student, List<Double>> studentPair : grades.entrySet()) {
            classAverage += calculateGrade(studentPair.getValue());
            studentCounter++;
        }
        classAverage = classAverage / studentCounter;
        return classAverage;
    }

    public HashMap<Student, List<Double>> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Student, List<Double>> grades) {
        this.grades = grades;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((grades == null) ? 0 : grades.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GradeBook other = (GradeBook) obj;
        if (grades == null) {
            if (other.grades != null)
                return false;
        } else if (!grades.equals(other.grades))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GradeBook [grades=" + grades + "]";
    }

}
