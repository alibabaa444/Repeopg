package org.example;
import java.util.Scanner;

public class Dialog {
    private int currentYear;

    public Dialog(int currentYear) {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth (YYYY):");
        int yearOfBirth = scanner.nextInt();

        if (isValidYear(yearOfBirth)) {
            int yearsToRetirement = getYearsToRetirement(yearOfBirth);
            System.out.println("You have " + yearsToRetirement + " years until retirement.");
        } else {
            System.out.println("Invalid input.");
        }
    }

    private boolean isValidYear(int year) {
        return year >= 0 && year <= currentYear && String.valueOf(year).length() == 4;
    }

    public int getYearsToRetirement(int yearOfBirth) {
        int retirementYear = yearOfBirth + 67;
        return retirementYear - currentYear;
    }
}
