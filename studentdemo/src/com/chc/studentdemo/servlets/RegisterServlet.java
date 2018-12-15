package com.chc.studentdemo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chc.studentdemo.beans.Student;
import com.chc.studentdemo.service.IStudentService;
import com.chc.studentdemo.service.StudentServiceImpl;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		//获取表单参数
		String number=request.getParameter("number");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String ageStr=request.getParameter("age");
		String scoreStr=request.getParameter("score");
		String sex=request.getParameter("sex");
		
		Integer age = Integer.valueOf(ageStr);
		Double score = Double.valueOf(scoreStr);
		
		if(number==null||"".equals(number.trim())) {
			//session.setAttribute("message","学号输入错误");
			//表单为空或者未通过表单进入，使用请求转发,当恶意刷新时会占用资源， 因此使用重定向,
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//创建student对象
		Student student=new Student(number,password,name,age,score,sex);
		student.setNumber(number);
		student.setPassword(password);
		student.setName(name);
		student.setAge(age);
		student.setScore(score);
		student.setSex(sex);
		
		//创建service对象
		IStudentService service=new StudentServiceImpl();
		
		//调用service对象的saveStudent()将对象写入数据库
		Integer id=service.saveStudent(student);
		//写入失败跳转注册页，重新注册,当数据库中的id为空时，数据没有写入数据库
		if(id==null) {
			response.sendRedirect(request.getContextPath() + "/register.jsp");
		}
		//写入成功后跳转登录页
		response.sendRedirect(request.getContextPath() + "/login.jsp");
	}


}
