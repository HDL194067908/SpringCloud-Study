package com.cloud.serviceFallbackFactory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cloud.entity.Dept;
import com.cloud.service.DeptClientService;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				
				return null;
			}
			
			@Override
			public Dept get(long deptno) {
				Dept dept=new Dept();
				dept.setDeptno(deptno);
				dept.setDname("该ID："+deptno+"没有没有对应的信息,null--@HystrixCommand");
				dept.setDb_source("no this database in MySQL");
				return dept;
			}
			
			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}
