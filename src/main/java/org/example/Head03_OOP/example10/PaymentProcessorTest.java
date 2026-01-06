package org.example.Head03_OOP.example10;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment[] payments = new Payment[]{
                new AccountTransferPayment(),
                new CreditCardPayment(),
                new MobilePayment()
        };
        double[] paymentAmounts = new double[]{
                300,400,500
        };

        int index=0;
        for (Payment payment : payments) {
            paymentProcessor.pay(payment,paymentAmounts[index++]);
        }


    }
}
