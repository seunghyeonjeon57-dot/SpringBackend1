package org.example.Head03_OOP.example09;

public class PaymentService {
    public void processPayment(UserAccount account,double amount){
        account.withdraw(amount);
        System.out.println("결제 완료. 잔약: " + account.getBalance());
    }
    public void processRefund(UserAccount account,double amount){
        account.deposit(amount);
        System.out.println("환불 완료. 잔액: " + account.getBalance());

    }
}
