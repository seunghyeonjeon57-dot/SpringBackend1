package org.example.Head03_OOP.example13;

public class Other {
    private static int staticValue=100;
    private int instanceValue =50;

    public static class StaticNested{
        public void printValues(){
            System.out.println("Other.staticValue:" + staticValue);
        }
    }
}
