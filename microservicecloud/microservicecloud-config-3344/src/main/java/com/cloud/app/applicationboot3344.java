package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableConfigServer
public class applicationboot3344 {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot3344.class, args);
	}

}
