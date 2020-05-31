package com.cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cloud.entity.Dept;

public interface DeptDao {
	@Insert("insert into dept(dname,db_source) values(#{dname},DATABASE())")
	boolean addDept(Dept dept);
	
	@Select("select * from dept where deptno=#{deptno}")
	Dept findByid(Long deptno);
	
	@Select("select * from dept")
	List<Dept> findAll();
}
