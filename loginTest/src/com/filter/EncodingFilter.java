package com.filter;

//EncodingFilter用来解决中文字符集乱码，它需要实现Filter接口，并重写doFilter函数

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{
	public EncodingFilter(){
		System.out.println("过滤器构造");
	}

	@Override
	public void destroy() {
		System.out.println("过滤器销毁");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");					//设置编码为utf-8
		response.setContentType("text/html;charset=utf-8");		//
		chain.doFilter(request,response);						//把请求传回过滤链
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("过滤器初始化");
		
	}
}
