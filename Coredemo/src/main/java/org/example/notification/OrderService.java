package org.example.notification;


public class OrderService {
    //OrderService is dependent on EmailService
    NotificationService notification;

    public OrderService(){

    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("Your Order is placed!!");
        notification.notify_user();
    }
}
