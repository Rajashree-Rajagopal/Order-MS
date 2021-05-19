package com.infy.OrderMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OrderMsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMsConfigServerApplication.class, args);
	}

}
