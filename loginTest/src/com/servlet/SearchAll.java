package com.servlet;
//返回数据库中所有用户信息

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.UserDaoImplement;
import com.entity.User;

public class SearchAll extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserDao ud=new UserDaoImplement();
		List<User> userall=ud.getUserAll();
		request.setAttribute("userall", userall);
		request.getRequestDispatcher("/showall.jsp").forward(request,response);
	}
	
}
