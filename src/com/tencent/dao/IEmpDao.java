package com.tencent.dao;

import java.util.List;

import com.tencent.pojo.Emp;

/**
 * 数据访问层--接口
 */
public interface IEmpDao {

	/**
	 * 查询所有雇员信息
	 * @return 雇员list集合
	 */
	public List<Emp> selectEmps();
	
}
