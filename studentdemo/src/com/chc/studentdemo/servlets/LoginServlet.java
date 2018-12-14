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
		
		//�����������
		String number=request.getParameter("number");
		String password=request.getParameter("password");
		
		//��ȡsession
		HttpSession session=request.getSession(); 
		
		if(number==null||"".equals(number.trim())) {
			session.setAttribute("message","ѧ���������");
			//��Ϊ�ջ���δͨ�������룬ʹ������ת��,������ˢ��ʱ��ռ����Դ�� ���ʹ���ض���,
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		
		
		if(password==null||"".equals(password.trim())) {
			session.setAttribute("message","�����������");
			//��Ϊ�ջ���δͨ�������룬ʹ������ת����ռ����Դ ���ʹ���ض���,
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//����Service����
		IStudentService service=new StudentServiceImpl();
		
		//�û���֤
		Student student=service.checkStudent(number,password);
		
		//��֤ʧ�ܣ���ת��¼ҳ���µ�¼
		if(student==null) {
			session.setAttribute("message", "ѧ�Ż������������");
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			return;
		}
		//��֤ͨ������ת��ҳ
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		
	}

}
