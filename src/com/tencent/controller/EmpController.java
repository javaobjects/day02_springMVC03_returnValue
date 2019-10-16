package com.tencent.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tencent.pojo.Emp;
import com.tencent.service.IEmpService;

/**
 * 
* <p>Title: EmpController</p>  
* <p>
*	Description: 
*   控制器：处理器请求，响应结果
* </p> 
* @author xianxian 
* @date 2019年10月16日
 */
@Controller
@RequestMapping("/emp")//修饰类，访问路径 http://localhost:8088/day01_springMVC02_requestMapping/emp/get
public class EmpController {

	//@Autowired @Qualifier("empService") //默认根据类型匹配，通常结合@Qualifier指定引用名称使用
	@Resource(name = "empService")
	private IEmpService empService;
	
	
	/**
	 * 
	 * <p>Title: getEmps</p>  
	 * <p>
	 *	Description: 
	 *  1. 返回ModelAndView
	 * </p> 
	 * @return
	 */
	@RequestMapping(value = "/get",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView getEmps() {
		ModelAndView mav = new ModelAndView();
		
		//1. 调用service方法，查询所有雇员信息
		List<Emp> empList = empService.selectEmps();
		
		//2. 保存到作用域，相当于request.setAttribute("empList",empList);
		mav.addObject("empList",empList);
		
		//3. 指定跳转的路径，相当于request.getRequestDispatcher("/empQuery.jsp").forward(request,response);
		//mav.setViewName("/empQuery.jsp");
		mav.setViewName("empQuery");//前缀/+empQuery + 后缀.jsp = /empQuery.jsp
		
		return mav;
		
	}
	
	
	/**
	 * 
	 * <p>Title: getEmps3</p>  
	 * <p>
	 *	Description: 
	 *  2.返回String: 返回跳转页面的路径
	 * </p> 
	 * @param request
	 * @return
	 */
	@RequestMapping("/get2")
	public String getEmps2(HttpServletRequest request)
	{
		//1.调用service方法，查询所有雇员信息
		List<Emp> empList = empService.selectEmps();
		
		//2.保存到作用域，相当于request.setAttribute("empList", empList);
		request.setAttribute("empList", empList);
		
		//3.指定跳转的路径，相当于request.getRequestDispatcher("/empQuery.jsp").forward(request,response);
		return "empQuery";// 前缀 / + empQuery + 后缀.jsp = /empQuery.jsp
	}
	
	/**
	 * 
	 * <p>Title: getEmps3</p>  
	 * <p>
	 *	Description: 
	 *  2.1 返回String: 返回跳转页面的路径，使用转发forward:
	 *  
	 * </p> 
	 * @param request
	 * @return
	 */
	@RequestMapping("/get3")
	public String getEmps3(HttpServletRequest request)
	{
		//1.调用service方法，查询所有雇员信息
		List<Emp> empList = empService.selectEmps();
		
		//2.保存到作用域，相当于request.setAttribute("empList", empList);
		request.setAttribute("empList", empList);
		
		//3.指定跳转的路径，相当于request.getRequestDispatcher("/empQuery.jsp").forward(request,response);
		return "forward:/empQuery.jsp";// 不会拼接前后缀
	}
	
	
	/**
	 * 
	 * <p>Title: getEmps4</p>  
	 * <p>
	 *	Description: 
	 *  2.2 返回String: 返回跳转页面的路径，使用重定向redirect:
	 *  
	 * </p> 
	 * @param request
	 * @return
	 */
	@RequestMapping("/get4")
	public String getEmps4(HttpServletRequest request)
	{
		//1.调用service方法，查询所有雇员信息
		List<Emp> empList = empService.selectEmps();
		
		//2.保存到作用域，相当于session.setAttribute("empList", empList);
		request.getSession().setAttribute("empList", empList);
		
		//3.指定跳转的路径，相当于response.sendRedirect(request.getContextPath + "/empQuery.jsp");
		return "redirect:/empQuery.jsp";// 不会拼接前后缀
	}
	
	
	/**
	 * 
	 * <p>Title: getEmps5</p>  
	 * <p>
	 *	Description: 
	 *  3. 返回void: 无返回值
	 *  
	 * </p> 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping("/get5")
	public void getEmps5(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//1.调用service方法，查询所有雇员信息
		List<Emp> empList = empService.selectEmps();
		
		//2.保存到作用域，相当于session.setAttribute("empList", empList);
		request.setAttribute("empList", empList);
		
		//3.指定跳转的路径，相当于request.getRequestDispatcher("/empQuery.jsp").forward(request,response);
		request.getRequestDispatcher("/empQuery.jsp").forward(request,response);
	}
	
}
