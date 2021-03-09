package com.shoppingapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingAppDiscoveryServiceApplication.class, args);
	}

}
