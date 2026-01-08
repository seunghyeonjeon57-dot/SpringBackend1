package org.example.Head03_OOP.example26;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {
    public void printString(String s){
        System.out.println("String: "+ s);
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();
        List<String> list = Arrays.asList("Apple","Banana", "Cherry");

        list.forEach(System.out::println);
    }
}
