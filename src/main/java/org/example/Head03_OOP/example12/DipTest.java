package org.example.Head03_OOP.example12;

public class DipTest {
    public static void main(String[] args) {

        NotificationSender[] notificationSenders =new NotificationSender[]{
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };
        for(NotificationSender sender1:notificationSenders){
            NotificationService notificationService =new NotificationService(sender1);
            notificationService.notify("Hello,World");
        }
    }
}
