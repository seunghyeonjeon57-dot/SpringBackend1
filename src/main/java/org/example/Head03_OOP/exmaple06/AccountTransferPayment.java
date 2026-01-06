package org.example.Head03_OOP.exmaple06;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
    public void cancel(double amount){
        System.out.println("계좌이체로 " + amount + "원 결제 취소하였습니다.");
    }
}
