package com.infy.OrderMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OrderMsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMsDiscoveryServerApplication.class, args);
	}

}
