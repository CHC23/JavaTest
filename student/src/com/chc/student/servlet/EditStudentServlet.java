package com.chc.student.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chc.student.service.StudentDaoService;
import com.chc.student.service.StuedntDaoServiceImpl;
import com.chc.student.student.Student;

/*
 * �༭ѧ����Ϣ��servlet
 */
@WebServlet("/EditStudentServlet")
public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		
		try {
			//��ȡ������
			int id=Integer.parseInt(request.getParameter("id"));
			StudentDaoService service=new StuedntDaoServiceImpl();
			Student student=service.editStudent(id);
//			System.out.println(student.getSname());
			//��ʾ��ҳ��
			request.setAttribute("student", student);
			
			//response.sendRedirect(request.getContextPath()+"/editStudent.jsp");
			request.getRequestDispatcher("editStudent.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//�޸������Ϣ�������ݿ�
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
