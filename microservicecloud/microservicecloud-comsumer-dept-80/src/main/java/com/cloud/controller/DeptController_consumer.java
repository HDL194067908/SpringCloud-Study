package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.entity.Dept;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_consumer {
	//private static String REST_URL_PREFIX="http://localhost:8001";
	private static String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
	@Autowired
	private RestTemplate restTemplate; //提供多种便捷访问远程http服务的方法 （REST请求地址，请求参数，响应被转换成的对象类型）
	
	@RequestMapping("/add")
	public Boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, boolean.class);
	}
	
	@RequestMapping("/get/{deptno}")
	public Dept get(@PathVariable("deptno")Long deptno) {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+deptno, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}

	@RequestMapping("/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
	}
	
}
