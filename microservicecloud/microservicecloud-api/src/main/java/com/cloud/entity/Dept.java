package com.cloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//lombok插件未安装
//@AllArgsConstructor  //全参构造函数
//@NoArgsConstructor   //无参构造函数
//@Accessors(chain = true)   //链式风格访问  dept.set().set().set();
//@Data   //为属性创建get/set
public class Dept implements Serializable{  //Dept:类表映射   Serializable:序列化接口
  private long   deptno; //主键
  private String dname; //部门名称
  private String db_source;  //来自哪个数据库
public long getDeptno() {
	return deptno;
}
public void setDeptno(long deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDb_source() {
	return db_source;
}
public void setDb_source(String db_source) {
	this.db_source = db_source;
}
public Dept(long deptno, String dname, String db_source) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.db_source = db_source;
}
public Dept() {
	super();
}
@Override
public String toString() {
	return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source=" + db_source + "]";
}
  

  
}
