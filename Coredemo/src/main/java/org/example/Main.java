package org.example;

import org.example.notification.NotificationService;
import org.example.notification.OrderService;
import org.example.notification.SmsService;


public class Main {
    static void main(String[] args) {
        NotificationService notification = new SmsService();
        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}
