package org.example.notification;



public class SmsService implements NotificationService {
    @Override
    public void notify_user() {
        System.out.println("SMS sent to the user!");

    }
}
