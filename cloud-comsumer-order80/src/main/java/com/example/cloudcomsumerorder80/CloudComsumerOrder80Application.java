package com.example.cloudcomsumerorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudComsumerOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudComsumerOrder80Application.class, args);
	}

}
