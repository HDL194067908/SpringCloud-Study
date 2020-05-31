package com.cloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.entity.Dept;
import com.cloud.serviceFallbackFactory.DeptClientServiceFallbackFactory;

//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@RequestMapping(value = "/dept")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	
	@RequestMapping(value = "/get/{deptno}",method = RequestMethod.GET)
	public Dept get(@PathVariable("deptno") long deptno);
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public List<Dept> list();
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public boolean add(Dept dept);
}
