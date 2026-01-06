package org.example.Head03_OOP.example07;

public class BusinessUser extends User {
    private String company;

    public BusinessUser(String userId,String name,String company) {
        super(userId,name);
        this.company = company;

    }
    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("회사이름:  " + company);
    }
}
