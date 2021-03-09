package com.shoppingapp.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingAppApiAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingAppApiAccountManagementApplication.class, args);
	}

}
