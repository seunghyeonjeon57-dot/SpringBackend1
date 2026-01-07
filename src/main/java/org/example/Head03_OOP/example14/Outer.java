package org.example.Head03_OOP.example14;

public class Outer {
    private int instanceValue =200;

    public class Inner{
        public void printInstanceValue(){
            System.out.println("Outer instanceValue:" + instanceValue);
        }
    }
}
