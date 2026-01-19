package org.example.Head03_OOP.example28;

import org.example.Head03_OOP.example29.Shape;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){this.radius = radius;}
    public double getArea(){return Math.PI*radius*radius;}
}
