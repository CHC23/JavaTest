package com.chc.studentdemo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chc.studentdemo.beans.Student;
import com.chc.studentdemo.service.IStudentService;
import com.chc.studentdemo.service.StudentServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//接受请求参数
		String number=request.getParameter("number");
		String password=request.getParameter("password");
		
		//获取session
		HttpSession session=request.getSession(); 
		
		if(number==null||"".equals(number.trim())) {
			session.setAttribute("message","学号输入错误");
			//表单为空或者未通过表单进入，使用请求转发,当恶意刷新时会占用资源， 因此使用重定向,
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		
		if(password==null||"".equals(password.trim())) {
			session.setAttribute("message","密码输入错误");
			//表单为空或者未通过表单进入，使用请求转发会占用资源 因此使用重定向,
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//创建Service对象
		IStudentService service=new StudentServiceImpl();
		
		//用户验证
		Student student=service.checkStudent(number,password);
		
		//验证失败，跳转登录页重新登录
		if(student==null) {
			session.setAttribute("message", "学号或密码输入错误");
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//验证通过，跳转主页
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		
	}

}
