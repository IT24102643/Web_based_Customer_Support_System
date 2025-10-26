package com.example.web_based_customer_support_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class WebBasedCustomerSupportSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebBasedCustomerSupportSystemApplication.class, args);
    }

}
