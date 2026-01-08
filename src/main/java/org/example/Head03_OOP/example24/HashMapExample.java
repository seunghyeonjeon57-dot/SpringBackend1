package org.example.Head03_OOP.example24;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> scores = new HashMap<>();

        scores.put("Kim" , 90);
        scores.put("Lee" , 80);
        scores.put("Park",95);
        System.out.println("After put: " + scores);

        scores.put("Lee" , 88);
        System.out.println("After updating: " + scores);

        int parkScore = scores.get("Park");
        System.out.println("Park's score: " + parkScore);

        System.out.println("Contains 'Kim' ? " + scores.containsKey("Kim") );

        scores.remove("Kim");
        System.out.println("After remove 'Kim " + scores);

        System.out.println("All Keys: " + scores.keySet());
    }
}
