package org.example.Head03_OOP.example28;

import org.example.Head03_OOP.example29.Shape;

public class Rectangle implements  Shape {
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
}
