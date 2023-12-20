package org.example;
import java.util.ArrayList;
import java.util.List;

class Diploma {
    private String studentName;
    private List<Course> courses;

    public Diploma(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String toString() {
        StringBuilder result = new StringBuilder(studentName + "\n");
        for (Course course : courses) {
            result.append(course).append("\n");
        }
        return result.toString();
    }

    public double calculateAverageGrade() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Course course : courses) {
            sum += course.grade;
        }
        return (double) sum / courses.size();
    }
}