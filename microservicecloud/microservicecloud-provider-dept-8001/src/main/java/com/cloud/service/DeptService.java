package com.cloud.service;

import java.util.List;

import com.cloud.entity.Dept;

public interface DeptService {
	boolean add(Dept dept);
	
	Dept get(Long deptno);
	
	List<Dept> list();

}
