package org.example.Head03_OOP.example24;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        //요소 추가
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("banana");
        System.out.println("After add: " + fruits);

        //인덱스를 통해 접근
        String firstFruit = fruits.get(1);
        System.out.println("First Fruit: " + firstFruit);

        //요소 삭제
        fruits.remove(1);
        System.out.println("after remove index: 1" + fruits);

        //개수 확인
        System.out.println("List size: " + fruits.size() );

        //전체제거
        fruits.clear();
        System.out.println("After clear: " + fruits);
    }
}
