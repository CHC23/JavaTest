package com.chc.student.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chc.student.service.StudentDaoService;
import com.chc.student.service.StuedntDaoServiceImpl;
import com.chc.student.student.Student;

@WebServlet("/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
//			int currentPage=Integer.parseInt(request.getParameter("currentPage"));	//设置登录后为第一页
			//获取表单数据
			String number=request.getParameter("number");
			String password=request.getParameter("password");
//			System.out.println(number+":"+password);
			//用户验证,表单数据与数据库中的匹配,匹配失败则重定向登录页面
			StudentDaoService service=new StuedntDaoServiceImpl();
			
			Student student=service.checkLogin(number,password);
			if(student==null) {
				response.sendRedirect(request.getContextPath()+"/index.jsp");
//				System.out.println("gg");
				return;
			}
			//匹配成功则把第一页传递给 "/StudentShowPagesServlet"
			
			request.getRequestDispatcher("StudentShowPagesServlet").forward(request,response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
