package org.example.Head03_OOP.example12;

public class NotificationService {
    private final NotificationSender sender;
    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }
    public void notify(String message) {
        sender.send(message);
    }
}
