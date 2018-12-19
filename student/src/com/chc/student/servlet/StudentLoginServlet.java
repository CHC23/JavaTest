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

@WebServlet("/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			//��ȡ������
			String number=request.getParameter("number");
			String password=request.getParameter("password");
//			System.out.println(number+":"+password);
			//�û���֤,�����������ݿ��е�ƥ��,ƥ��ʧ�����ض����¼ҳ��
			StudentDaoService service=new StuedntDaoServiceImpl();
			
			Student student=service.checkLogin(number,password);
			if(student==null) {
				response.sendRedirect(request.getContextPath()+"/index.jsp");
//				System.out.println("gg");
				return;
			}
			//ƥ��ɹ������
			
			response.sendRedirect(request.getContextPath()+"/StudentAllServlet");
			return;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
