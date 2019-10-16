package com.tencent.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tencent.dao.IEmpDao;
import com.tencent.pojo.Dept;
import com.tencent.pojo.Emp;
/**
 * 数据访问层-接口实现类
 */
@Repository("empDao")//相当于 IEmpDao empDao = new EmpDaoImpl();
public class EmpDaoImpl implements IEmpDao {

	private static List<Emp> empList = new ArrayList<Emp>();
	
	static{
		empList.add(new Emp(1111, "张三", "需求工程师", 9999, new Date(), 8000, 500, new Dept(10, "需求部", "东软大厦125C")));
		empList.add(new Emp(2222, "李四", "前端工程师", 9999, new Date(), 8000, 500, new Dept(20, "前端部", "东软大厦125C")));
		empList.add(new Emp(3333, "王五", "开发工程师", 9999, new Date(), 8000, 500, new Dept(30, "开发部", "东软大厦125C")));
		empList.add(new Emp(4444, "赵六", "测试工程师", 9999, new Date(), 8000, 500, new Dept(40, "测试部", "东软大厦125C")));
		empList.add(new Emp(5555, "田七", "实施工程师", 9999, new Date(), 8000, 500, new Dept(50, "实施部", "东软大厦125C")));
	}
	
	@Override
	public List<Emp> selectEmps() {
		return empList;
	}
}
