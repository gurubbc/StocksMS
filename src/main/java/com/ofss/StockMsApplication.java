package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMsApplication.class, args);
		System.out.println("Stocks Microservice started...");
	}

}
