package org.example.Head03_OOP.example17;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask task = new  AbstractTask() {
            public void execute() {
                System.out.println("구현부");
            }
            @Override
            public void start(){
                System.out.println("안녕하세요");
            }
        };
        task.start();
        task.execute();
    }
}
