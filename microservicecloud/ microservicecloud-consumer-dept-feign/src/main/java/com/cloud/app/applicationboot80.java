package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cloud"})
//@ComponentScan("com.cloud")
public class applicationboot80 {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot80.class, args);
	}

}
