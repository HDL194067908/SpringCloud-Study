package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableEurekaServer
public class springBootEureka7001 {

	public static void main(String[] args) {
		SpringApplication.run(springBootEureka7001.class, args);
	}

}
