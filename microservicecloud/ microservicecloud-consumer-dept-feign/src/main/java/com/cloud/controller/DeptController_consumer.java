package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.entity.Dept;
import com.cloud.service.DeptClientService;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_consumer {
	
	@Autowired
	private DeptClientService service;
	
	@RequestMapping("/get/{deptno}")
	public Dept get(@PathVariable("deptno")long deptno) {
		return service.get(deptno);
	}
	@RequestMapping("/list")
	public List<Dept> list() {
		return service.list();
	}
	@RequestMapping("/add")
	public Object add(Dept dept) {
		return service.add(dept);
	}
}
