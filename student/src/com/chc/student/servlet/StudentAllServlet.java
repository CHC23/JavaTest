package com.chc.student.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chc.student.service.StudentDaoService;
import com.chc.student.service.StuedntDaoServiceImpl;
import com.chc.student.student.Student;

/**
 * 查询所有学生信息，
 */
@WebServlet("/StudentAllServlet")
public class StudentAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			StudentDaoService service=new StuedntDaoServiceImpl();
			List<Student> list=service.selectAll();
//			for(int i=0;i<list.size();i++) {
//				Student student=list.get(i);
//				System.out.println(student.getSname());
//			}
			//数据存入域
			request.setAttribute("allStudent",list);
			
			request.getRequestDispatcher("show.jsp").forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
