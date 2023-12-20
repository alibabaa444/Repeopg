package org.example;

public class Main {
    public static void main(String[] args) {
        PasswordValidater validator = new PasswordValidater("Password123",8,9,true);
        System.out.println(validator.isValid()); // Shoued return true or false based on criteria
    }
}
