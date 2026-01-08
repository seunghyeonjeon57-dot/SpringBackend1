package org.example.Head03_OOP.example26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterNumbersExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        numbers.stream()
                .filter(num->num%2 ==0)
                .forEach(num-> System.out.println("Even number: " + num));

        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value){
                return value % 2==0;
            }
        };
        Stream<Integer> stream = numbers.stream();
        Stream<Integer> evenStream = stream.filter(isEven);

        evenStream.forEach(num-> System.out.println("Even number: " + num));
    }
}
