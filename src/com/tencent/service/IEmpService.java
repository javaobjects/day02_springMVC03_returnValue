package com.tencent.service;

import java.util.List;

import com.tencent.pojo.Emp;

/**
 * 业务逻辑层--接口
 */
public interface IEmpService {

	/**
	 * 查询所有雇员信息
	 * @return 雇员list集合
	 */
	public List<Emp> selectEmps();
	
}
