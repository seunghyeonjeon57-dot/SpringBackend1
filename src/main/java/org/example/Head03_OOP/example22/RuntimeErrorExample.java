package org.example.Head03_OOP.example22;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        int[] scores = {90,80,70};
        try{
            System.out.println(scores[3]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("잘못된 인덱스 번호입니다.");}
    }
}
