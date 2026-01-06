package org.example.Head03_OOP.example12;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sns 전송:" + message);
    }

}
