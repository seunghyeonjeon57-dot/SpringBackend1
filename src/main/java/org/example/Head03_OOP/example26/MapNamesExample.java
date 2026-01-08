package org.example.Head03_OOP.example26;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie");

        names.stream()
                .map(s->s.length())
                .forEach(length-> System.out.println("Name length: " + length));

        Function<String,String> upper = new Function<String,String>(){
            @Override
            public String apply(String s){
                return s.toUpperCase();
            }
        };
        names.stream()
                .map(upper)
                .forEach(upp-> System.out.println("Upper case: " + upp));
        }
    }

