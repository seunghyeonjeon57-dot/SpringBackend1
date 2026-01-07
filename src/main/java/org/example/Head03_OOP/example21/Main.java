package org.example.Head03_OOP.example21;

public class Main {
    public static void main(String[] args) {
        for(PaymentMethod paymentMethod:PaymentMethod.values()){
            System.out.println(paymentMethod.getDisplayName());
        }



    }
}
