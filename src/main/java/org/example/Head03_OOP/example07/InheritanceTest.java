package org.example.Head03_OOP.example07;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001" , "Alice", "alice@exmaple.com");
        User u1 = new BusinessUser("U0002" , "bib", "samsong");
        u.printUserInfo();
        u1.printUserInfo();
    }
}
