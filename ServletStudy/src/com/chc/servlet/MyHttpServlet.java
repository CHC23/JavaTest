package com.chc.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends GenericServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			HttpServletRequest hrequest=(HttpServletRequest)request;
			HttpServletResponse hresponse=(HttpServletResponse)response;
			this.service(hrequest, hresponse);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void service(HttpServletRequest hrequest,HttpServletResponse hresponse) throws ServletException, IOException{
		String method=hrequest.getMethod();
		if(method.equalsIgnoreCase("GET")) {
			doGet(hrequest,hresponse);
		}else if(method.equalsIgnoreCase("POST")) {
			doPost(hrequest,hresponse);
		}
	}

	protected void doPost(HttpServletRequest hrequest,HttpServletResponse hresponse) throws ServletException, IOException{
		
	}

	protected void doGet(HttpServletRequest hrequest,HttpServletResponse hresponse) throws ServletException, IOException{
		
	}

}
