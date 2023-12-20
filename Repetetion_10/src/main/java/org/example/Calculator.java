package org.example;

public class Calculator {
    private double result;

    public double getResult() {
        return result;
    }

    public void add(double x) {
        result += x;
    }

    public void subtract(double x) {
        result -= x;
    }

    public void clear() {
        result = 0;
    }

    public void add(double[] numbers) {
        for (double num : numbers) {
            result += num;
        }
    }

    public void multiply(double x) {
        result *= x;
    }

    public void divide(double x) {
        if (x != 0) {
            result /= x;
        } else {
            System.out.println("Kan ikke dividere med nul!");
        }
    }

    public double squareRoot() {
        return Math.sqrt(result);
    }

    public double power(double x) {
        return Math.pow(result, x);
    }

    public void printResult() {
        System.out.println("Resultat: " + result);
    }
}
