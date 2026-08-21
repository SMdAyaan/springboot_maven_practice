package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(){
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       /*CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(2));

        context.close();*/
    }
}
