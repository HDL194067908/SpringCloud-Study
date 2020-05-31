package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableEurekaClient
public class applicationboot80 {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot80.class, args);
	}

}
