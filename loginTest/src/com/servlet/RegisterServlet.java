//实现注册操作
package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.dao.*;


@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		
		//过去jsp页面传过来的参数
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String sex=request.getParameter("sex");
		String home=request.getParameter("home");
		String info=request.getParameter("info");
		
		//实例化一个对象，添加属性
		User user=new User();
		user.setName(name);
		user.setPwd(pwd);
		user.setSex(sex);
		user.setHome(home);
		user.setInfo(info);
		
		UserDao ud=new UserDaoImplement();
		if(ud.register(user)) {
			request.setAttribute("username", name);
			request.getRequestDispatcher("/login.jsp").forward(request,response);	//转发到登录页面
		}else {
			response.sendRedirect("index.jsp");					//重新定向到首页		
		}
	}
	
}
