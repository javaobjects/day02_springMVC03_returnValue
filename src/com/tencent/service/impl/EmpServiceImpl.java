package com.tencent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tencent.dao.IEmpDao;
import com.tencent.pojo.Emp;
import com.tencent.service.IEmpService;

/**
 * 业务逻辑层-接口实现类
 */
@Service("empService")//相当于IEmpService empService = new EmpServiceImpl();
public class EmpServiceImpl implements IEmpService {

	//@Autowired @Qualifier("empDao") //默认根据类型匹配，通常结合@Qualifier指定引用名称使用
	@Resource(name="empDao") //默认根据名称匹配
	private IEmpDao empDao;
	
	@Override
	public List<Emp> selectEmps() {
		List<Emp> empList = empDao.selectEmps();
		
		return empList;
	}
}
