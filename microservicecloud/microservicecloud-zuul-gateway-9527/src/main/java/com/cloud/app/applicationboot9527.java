package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication(scanBasePackages = {"com.cloud"})
@EnableZuulProxy
public class applicationboot9527 {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot9527.class, args);
	}

}
