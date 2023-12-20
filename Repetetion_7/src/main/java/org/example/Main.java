package org.example;

public class Main {
    public static void main(String[] args) {
        Diploma diploma = new Diploma("Abdel Kader");

        Course course1 = new Course("Fysik", 7);
        Course course2 = new Course("Matematik", 12);
        Course course3 = new Course("Fysik", 4);

        diploma.addCourse(course1);
        diploma.addCourse(course2);
        diploma.addCourse(course3);

        System.out.println(diploma);
        System.out.println("Karaktersnit: " + diploma.calculateAverageGrade());
    }
}