package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
//@ComponentScan("com.cloud")
public class applicationbootclient {

	public static void main(String[] args) {
		SpringApplication.run(applicationbootclient.class, args);
	}

}
