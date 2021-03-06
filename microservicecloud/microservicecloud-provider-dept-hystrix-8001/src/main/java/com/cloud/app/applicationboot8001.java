package com.cloud.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.cloud"})
@MapperScan("com.cloud.dao")
@EnableEurekaClient  //本服务自动注册到Eureka
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //对hystrixR熔断机制的支持
public class applicationboot8001 {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot8001.class, args);
	}

}
