package org.example.Head03_OOP.example26;

import java.util.Arrays;
import java.util.List;

public class ForEachVsForExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("==== Using for loop ====");
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)%2 !=0){
                continue;
            }
            System.out.println("Even number: " + numbers.get(i));
        }
        System.out.println("==== Using for loop ====");
        for(Integer num :numbers){
            if(num%2 !=0){
                continue;
            }
            System.out.println("Even number: " + num);
        }

        System.out.println("===Using Stream Filter + forEach ===");
        numbers.stream()
                .filter(n ->n%2 ==0)
                .forEach(n-> System.out.println("Even number: " + n));
    }
}
