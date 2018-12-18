package com.chc.student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chc.student.service.StudentDaoService;
import com.chc.student.service.StuedntDaoServiceImpl;
import com.chc.student.student.Student;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码格式
				request.setCharacterEncoding("utf-8");
				
				try {
				//获取表单数据
					String sname=request.getParameter("sname");
					String sex=request.getParameter("sex");
					String sage=request.getParameter("age");
					String phone=request.getParameter("phone");
					String hobby=request.getParameter("hobby");
					String info=request.getParameter("info");
					
					//数据入库
					Integer age = Integer.valueOf(sage);
					
					Student student=new Student(sname,sex,phone,age,hobby,info);
					StudentDaoService service=new StuedntDaoServiceImpl();
					service.insertStudent(student);
					
					//跳转
					
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
