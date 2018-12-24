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

/**
 * �����µ�ѧ����Ϣ�����ݿ�
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		try {
			//��ȡ������
				int id=Integer.parseInt(request.getParameter("id"));
				String sname=request.getParameter("sname");
				String number=request.getParameter("number");
				String sex=request.getParameter("sex");
				String sage=request.getParameter("age");
				String phone=request.getParameter("phone");
				String sclass=request.getParameter("sclass");
				String info=request.getParameter("info");
				Integer age = Integer.valueOf(sage);
				
				
				//�������
				Student student=new Student(id,sname,number,sex,phone,age,sclass,info);
				StudentDaoService service=new StuedntDaoServiceImpl();
				service.updateStudent(student);
				
				//����ɹ��� �ض���show.jsp
				response.sendRedirect(request.getContextPath()+"/StudentShowPagesServlet?currentPage=1");
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
