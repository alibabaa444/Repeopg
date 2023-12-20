package org.example;

public class Main {
    public static void main(String[] args) {
        // Opretter et Square-objekt og et Circle-objekt
        Square square = new Square(5, 5);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle();

        // Udskriver arealet af Square og Circle separat
        double sq = square.calculateArea();
        double c = circle.calculateArea();
        System.out.println("Arealet af square er: " + sq);
        System.out.println("Arealet af circle er: " + c);

        // Opretter en instans af Shapes-klassen
        Shapes shapes = new Shapes();

        // Tilføjer Square- og Circle-objekterne til Shapes
        shapes.addShape(square);
        shapes.addShape(circle);
        shapes.addShape(triangle);

        // Beregner det samlede areal af alle figurer i Shapes
        double totalArea = shapes.totalArea();
        System.out.println("Det samlede areal af alle former er: " + totalArea);
    }
}
