package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.entity.Dept;
import com.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService service;
	
	@Autowired
	private DiscoveryClient client;
	
//	@RequestMapping(value = "/add",method = RequestMethod.POST)
//	public boolean add(Dept dept) {
//		return service.add(dept);
//	}
	
	@RequestMapping(value = "/get/{deptno}",method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("deptno")long deptno) {
		Dept dept=service.get(deptno);
		if(dept==null) {
			throw new RuntimeException("该ID："+deptno+"没有没有对应的信息");
		}
		return dept;
	}
	public Dept processHystrix_Get(@PathVariable("deptno") long deptno){
		Dept dept=new Dept();
		dept.setDeptno(deptno);
		dept.setDname("该ID："+deptno+"没有没有对应的信息,null--@HystrixCommand");
		dept.setDb_source("no this database in MySQL");
		return dept;
	}
	
//	@RequestMapping(value = "/list",method = RequestMethod.GET)
//	public List<Dept> list() {
//		return service.list();
//	}
//	
//	@RequestMapping("/discovery")
//	public Object discovery() {
//		List<String> list=client.getServices();
//		List<ServiceInstance> serverlist=client.getInstances("MICROSERVICECLOUD-DEPT");
//		for (ServiceInstance element : serverlist) {
//			System.out.println(element.getServiceId()+" "+element.getHost()+" "+element.getPort()+" "+element.getUri());
//		}
//		return this.client;
//	}
	
}
