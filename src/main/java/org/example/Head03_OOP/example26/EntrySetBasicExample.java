package org.example.Head03_OOP.example26;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String,Integer> capitals = new HashMap<>();
        capitals.put("Korea",23);
        capitals.put("Japan",34);
        capitals.put("France",412);

        for(Map.Entry<String,Integer> entry: capitals.entrySet()){
            System.out.println("Country: " + entry.getKey() + ", capital: " + entry.getValue());
        }


    }
}
