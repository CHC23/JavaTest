package com.servlet;
//实现对用户登录的操作

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;

public class LoginServlet extends HttpServlet{
	//继承HttpServlet  并重写doGet  doPost方法
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doPost(request,response);	//将信息使用doPost方法执行   对应jsp页面中的form表单中的method

	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		
		//得到jsp传过来的参数
		String name=request.getParameter("name");	
		String pwd=request.getParameter("pwd");
		
		UserDao ud=new UserDaoImplement();
		
		if(ud.login(name, pwd)) {
			request.setAttribute("msg","登陆成功"+name);		//向request域中放置信息
			request.getRequestDispatcher("/loginSuccess.jsp").forward(request,response);	//转发到登陆成功页面
		}else {
			response.sendRedirect("/index.jsp");			//重新定向到首页
		}
		
	}
}
