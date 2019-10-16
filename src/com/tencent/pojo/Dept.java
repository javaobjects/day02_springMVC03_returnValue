package com.tencent.pojo;
/**
 * 映射Dept表的实体类
 */
public class Dept {

	/**部门编号*/
	private int deptno;
	/**部门名称*/
	private String dname;
	/**部门所在地址*/
	private String location;
	
	/**构造函数*/
	public Dept() {
		super();
	}
	public Dept(int deptno, String dname, String location) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.location = location;
	}
	/**访问器*/
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", location=" + location + "]";
	}
}
