package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(
        scanBasePackages = {
                "com.mycompany.app",
                "com.mycompany.amqp",
        }
)
@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.mycompany.clients"
)
public class CustomerApplication {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(CustomerApplication.class, args);
    }
}