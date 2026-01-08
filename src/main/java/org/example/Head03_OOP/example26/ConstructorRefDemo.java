package org.example.Head03_OOP.example26;


interface PersonFactory{
    Person create(String name, int age);
}

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age= age;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory2=Person::new;

        Person p=factory2.create("Kim",25);
        System.out.println("Created Person -> name" + p.name + ", age" + p.age);
    }
}
