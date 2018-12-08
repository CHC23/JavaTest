package com.chc.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	public FirstServlet(){
		System.out.println("���췽���ȵ���");   //���췽�����ȵ���
	}
	@Override
	public void destroy() {
		System.out.println("destory");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		//��config��ȡxml�ļ��е�����
		Enumeration<String> enumeration=config.getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			String name=(String) enumeration.nextElement();
			String value=config.getInitParameter(name);
			System.out.println("param-name:"+name+"===param-value:"+value);
		}
		
//		System.out.println(config.getServletName());
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");
	}

}
