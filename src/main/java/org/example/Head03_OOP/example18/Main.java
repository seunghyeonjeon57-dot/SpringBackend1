package org.example.Head03_OOP.example18;

public class Main {
    public static void main(String[] args) {
        for(Level level : Level.values()){
            System.out.println(level + "ordinal=" + level.ordinal());
        }
        Level today=Level.MEDIUM;
        System.out.println("name(): " + today.name());
    }
}
