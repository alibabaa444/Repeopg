package org.example;


class Course {
    private String courseName;
    int grade;

    public Course(String courseName, int grade) {
        this.courseName = courseName;
        if (isValidGrade(grade)) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade: " + grade);
        }
    }

    private boolean isValidGrade(int grade) {
        return grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12;
    }

    public String toString() {
        return courseName + ": " + grade;
    }
}
