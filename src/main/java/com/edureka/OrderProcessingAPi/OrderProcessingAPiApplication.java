package com.edureka.OrderProcessingAPi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.edureka.OrderProcessingAPi.client")
@SpringBootApplication
public class OrderProcessingAPiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessingAPiApplication.class, args);
	}

}
