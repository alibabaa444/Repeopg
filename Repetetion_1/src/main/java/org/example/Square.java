package org.example;

import java.util.ArrayList;

public class Square implements Shape {

    int height;
    int length;


    public Square(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(){
       return (height * length);

    }
}



