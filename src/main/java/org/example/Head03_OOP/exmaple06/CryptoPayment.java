package org.example.Head03_OOP.exmaple06;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("가상 화페로 " + amount + "원 결제했습니다.");
    }
    public void cancel(double amount){
        System.out.println("가상 화폐로 " + amount + "원 결제취소하였습니다.");
    }
}
