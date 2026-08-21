package org.example.notification;

public class EmailService implements NotificationService{
    @Override
    public void notify_user(){
        System.out.println("Email sent to the user!");
    }
}
