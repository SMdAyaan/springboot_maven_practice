package com.example.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.security.KeyStore;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//		OrderService order = context.getBean(OrderService.class);
//		order.placeOrder();
		PaymentService paymentService = context.getBean(PaymentService.class);

		System.out.println(paymentService.getType());
		System.out.println(paymentService.getRetryCount());



		}

//		@Bean
//		public JsonParser getJsonParserBean(){
//		return new BasicJsonParser();
		}

