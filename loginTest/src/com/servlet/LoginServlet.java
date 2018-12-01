package com.servlet;
//ʵ�ֶ��û���¼�Ĳ���

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;

public class LoginServlet extends HttpServlet{
	//�̳�HttpServlet  ����дdoGet  doPost����
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		doPost(request,response);	//����Ϣʹ��doPost����ִ��   ��Ӧjspҳ���е�form���е�method

	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		
		//�õ�jsp�������Ĳ���
		String name=request.getParameter("name");	
		String pwd=request.getParameter("pwd");
		
		UserDao ud=new UserDaoImplement();
		
		if(ud.login(name, pwd)) {
			request.setAttribute("msg","��½�ɹ�"+name);		//��request���з�����Ϣ
			request.getRequestDispatcher("/loginSuccess.jsp").forward(request,response);	//ת������½�ɹ�ҳ��
		}else {
			response.sendRedirect("/index.jsp");			//���¶�����ҳ
		}
		
	}
}
