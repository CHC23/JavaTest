package com.chc.student.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chc.student.service.StudentDaoService;
import com.chc.student.service.StuedntDaoServiceImpl;
import com.chc.student.student.Page;

/**
 * 实现分页显示的servlet
 */
@WebServlet("/StudentShowPagesServlet")
public class StudentShowPagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		try {
			//接收分页参数
			int currentPage=Integer.parseInt(request.getParameter("currentPage"));	//当前页
			
//			System.out.println(currentPage);
			
			
			StudentDaoService service=new StuedntDaoServiceImpl();
			Page page=service.selectStudentCurrentPage(currentPage);
			
			request.setAttribute("page", page);
			
			request.getRequestDispatcher("showPaging.jsp").forward(request,response);		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
