package com.chc.servlet;

import java.io.IOException;

//import javax.servlet.Servlet;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends MyHttpServlet{

	private static final long serialVersionUID = 1L;

//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		String user1=request.getParameter("username");
//		String pwd1=request.getParameter("pasowrd");
//		
////		String user2=context.getInitParameter("password");
////		String pwd2=context.getInitParameter("username");
//		//判断http请求的数据是否和web.xml中的数据相同
//		
//		if(user1.equals(getServletConfig().getServletContext().getInitParameter("username")) 
//				&& pwd1.equals(getServletConfig().getServletContext().getInitParameter("password"))){
//			response.getWriter().println("success");
//		}else {
//			response.getWriter().println("failed");
//		}
		
		
//	}
	
	@Override
	protected void doGet(HttpServletRequest hrequest, HttpServletResponse hresponse) throws ServletException, IOException{
		String user1=hrequest.getParameter("username");
		String pwd1=hrequest.getParameter("password");
		
		String user2=getServletConfig().getServletContext().getInitParameter("username");
		
//		System.out.println(user2);
		hresponse.setContentType("text/html;charset=UTF-8");			//中文乱码问题
		if(user1.equals(getServletConfig().getServletContext().getInitParameter("username")) 
				&& pwd1.equals(getServletConfig().getServletContext().getInitParameter("password"))){
			
			hresponse.getWriter().println("欢迎");
		}else {
			hresponse.getWriter().println("登录失败");
		}
	}

}
