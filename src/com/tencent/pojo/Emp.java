package com.tencent.pojo;

import java.util.Date;

/**
 * 映射Emp表的实体类
 */
public class Emp {

	/**雇员编号*/
	private int empno;
	/**雇员姓名*/
	private String ename;
	/**职位*/
	private String job;
	/**上级经理*/
	private int mgr;
	/**入职日期*/
	private Date hiredate;
	/**薪水*/
	private double salary;
	/**奖金*/
	private double comm;
	/**部门*/
	private Dept dept;

	/**构造函数*/
	public Emp() {
		super();
	}
	public Emp(int empno, String ename, String job, int mgr, Date hiredate, double salary, double comm, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.salary = salary;
		this.comm = comm;
		this.dept = dept;
	}
	/**访问器*/
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", salary=" + salary + ", comm=" + comm + ", dept=" + dept + "]";
	}
}
