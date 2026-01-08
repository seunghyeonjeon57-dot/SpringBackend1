package org.example.Head03_OOP.example26;

import java.util.Arrays;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Apple","sd","Cherry");
        names.forEach(System.out::println);

        names.stream()//filter는 if라고 생각..?아닐수도 이건 더 알아보는걸로.
                .filter(name->name.length() >=5)
                .forEach(System.out::println);

        names.stream()//형 변환??
                .map(String::toUpperCase)
                .forEach(upp-> System.out.println("대문자로: " + upp));

    }
}
