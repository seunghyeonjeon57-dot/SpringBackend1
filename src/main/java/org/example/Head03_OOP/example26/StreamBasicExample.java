package org.example.Head03_OOP.example26;

import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom","Jerry","Kim","Tommy");

        names.stream() //stream을 시작함//파이프라인을 시작함
                .filter(name->name.startsWith("T"))
                .map(String::toUpperCase)//::stream사용법 //toUppercase:대문자
                .forEach(System.out::println);
    }
}
