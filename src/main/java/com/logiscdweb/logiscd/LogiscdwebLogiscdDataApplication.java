package com.logiscdweb.logiscd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LogiscdwebLogiscdDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogiscdwebLogiscdDataApplication.class, args);
	}

}
