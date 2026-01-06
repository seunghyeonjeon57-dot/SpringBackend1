package org.example.Head03_OOP.exmaple06;

import java.util.Scanner;

public class Topic03ExampleMain {
    public static void main(String[] args) {

        Order o1 = new Order(new CreditCardPayment());
        o1.process(50000);
        o1.cancel(20000);

        Order o2 = new Order(new AccountTransferPayment());
        o2.process(30000);
        o2.cancel(20000);

        Order o3 = new Order(new CreditCardPayment());
        o3.process(20000);
        o3.cancel(20000);
    }
}
