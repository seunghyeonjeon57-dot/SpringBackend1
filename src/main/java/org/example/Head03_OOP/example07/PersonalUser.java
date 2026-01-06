package org.example.Head03_OOP.example07;

public class PersonalUser extends User{
    private String email;
    public PersonalUser(String Id,String name,String email){
        super(Id,name);
        this.email = email;
    }
    @Override
    public void printUserInfo(){
        super.printUserInfo();
        System.out.println("이메일: " + email);
    }
}
