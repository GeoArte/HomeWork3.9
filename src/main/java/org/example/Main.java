package org.example;

import People.Driver;
import Transport.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Driver driver1 = context.getBean("Иван", Driver.class);
        Driver driver2 = context.getBean("Василий", Driver.class);
        Driver driver3 = context.getBean("Джон", Driver.class);
        driver1.drive();
        driver2.drive();
        driver3.drive();
    }
}