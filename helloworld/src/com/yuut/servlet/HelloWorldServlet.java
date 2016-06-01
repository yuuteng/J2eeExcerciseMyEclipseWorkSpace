package com.yuut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{
	@SuppressWarnings("deprecation")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//页面类型
		resp.setContentType("text/html");
		//输出流
		PrintWriter out = resp.getWriter();
		
		String teststr = "123456789";
		System.out.println(teststr.length());
		
		out.println("<html><head><title>Hello yuut</title></head>");
		out.println("<body><h1>Hello yuut , time now is :" + teststr.indexOf("5") + "</body></html>");
		
		//缓存清空
		out.flush();
		
	}
}
