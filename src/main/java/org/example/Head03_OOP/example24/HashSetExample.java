package org.example.Head03_OOP.example24;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("France");
        countries.add("Korea");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("Korea");

        System.out.println("나라 이름: " + countries);
        System.out.println("Coutins 'Korea' ?: "+ countries.contains("Korea") );

        countries.remove("Germany");
        System.out.println("After remove : " + countries );

        System.out.println("Set Size : " + countries.size());
        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
