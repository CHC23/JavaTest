package com.chc.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet implements Servlet{
	
	private ServletConfig config;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}

	@Override
	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

}
