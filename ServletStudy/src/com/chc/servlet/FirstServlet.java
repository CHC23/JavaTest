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
		System.out.println("构造方法先调用");   //构造方法首先调用
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
		//由config获取xml文件中的数据
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
