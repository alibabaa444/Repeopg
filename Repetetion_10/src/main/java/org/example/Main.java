package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5);
        calc.subtract(2);
        calc.multiply(3);
        calc.divide(6);
        calc.add(new double[]{3, 7});
        calc.printResult();

        calc.clear();
        calc.add(10);
        calc.power(3);
        calc.printResult();

        calc.squareRoot();
        calc.printResult();
    }
}
