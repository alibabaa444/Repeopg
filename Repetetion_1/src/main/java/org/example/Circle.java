package org.example;

public class Circle implements Shape {

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return (Math.PI * (radius*radius));
    }
}

