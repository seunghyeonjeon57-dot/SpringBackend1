package org.example.Head03_OOP.example26;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String,Integer> scores = new HashMap<>();
        scores.put("Kim",90);
        scores.put("Lee",85);
        scores.put("Park",92);

        scores.entrySet().stream()
                .map(e->e.getKey().toUpperCase() + ": " + e.getValue())
                .forEach(System.out::println);

        Function<Map.Entry<String,Integer>,String> entryToString =
                new Function<Map.Entry<String,Integer>,String>(){
            @Override
            public String apply(Map.Entry<String,Integer> e) {
                return e.getKey().toLowerCase()+ ": " + e.getValue();
            }

                };
        scores.entrySet().stream()
                .map(entryToString)
                .forEach(System.out::println);
    }
}
