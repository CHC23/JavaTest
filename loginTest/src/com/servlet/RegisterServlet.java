//ʵ��ע�����
package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.dao.*;


@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		
		//��ȥjspҳ�洫�����Ĳ���
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String sex=request.getParameter("sex");
		String home=request.getParameter("home");
		String info=request.getParameter("info");
		
		//ʵ����һ�������������
		User user=new User();
		user.setName(name);
		user.setPwd(pwd);
		user.setSex(sex);
		user.setHome(home);
		user.setInfo(info);
		
		UserDao ud=new UserDaoImplement();
		if(ud.register(user)) {
			request.setAttribute("username", name);
			request.getRequestDispatcher("/login.jsp").forward(request,response);	//ת������¼ҳ��
		}else {
			response.sendRedirect("index.jsp");					//���¶�����ҳ		
		}
	}
	
}
