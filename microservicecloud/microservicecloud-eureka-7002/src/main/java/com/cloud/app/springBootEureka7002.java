package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableEurekaServer
public class springBootEureka7002 {

	public static void main(String[] args) {
		SpringApplication.run(springBootEureka7002.class, args);
	}

}
