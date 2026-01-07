package org.example.Head03_OOP.example19;

public class Main {
    public static void main(String[] args) {
        Planet[] planet = new Planet[]{
                Planet.MERCURY,
                Planet.EARTH,
                Planet.VENUS
        };
        for(Planet p:planet){
            System.out.println(p.toString());
        }
    }
}
