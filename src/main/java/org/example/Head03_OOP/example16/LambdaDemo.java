package org.example.Head03_OOP.example16;

public class LambdaDemo {
    public static void main(String[] args) {
        MyCalculator addAnon = new MyCalculator(){
            @Override
            public int operate(int x, int y){
                return x + y;
            }
        };
        System.out.println(addAnon.operate(10,20));

        MyCalculator addAnon2 = (x,y) ->x*y;
        System.out.println("두수의 곱" + addAnon2.operate(10,20));
    }
}


