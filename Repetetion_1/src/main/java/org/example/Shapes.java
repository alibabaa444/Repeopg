package org.example;

import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapeList;
    public Shapes() {
        shapeList = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }



    public double totalArea() {
        double total = 0.0;
        for (Shape shape : shapeList) {
            total += shape.calculateArea();
        }
        return total;
    }
}
