package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableHystrixDashboard
public class applicationboot9001 {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot9001.class, args);
	}

}
