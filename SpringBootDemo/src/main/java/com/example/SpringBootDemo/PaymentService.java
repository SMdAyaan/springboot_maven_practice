package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
//    @Value("${paymentService.type:RazorPay}")
//    private String type;
//    @Value("${paymentService.retryCount}")
//    private int retryCount;

    private PaymentProperties paymentProperties;
//    public PaymentService(@Value("${paymentService.type}")String type,
//                          @Value("${paymentService.retryCount}")int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }

    public PaymentService(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return paymentProperties.getType();
    }
    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public Boolean getEnabled() {
        return paymentProperties.getEnabled();
    }

    public int getTimeout() {
        return paymentProperties.getTimeout();
    }


}
