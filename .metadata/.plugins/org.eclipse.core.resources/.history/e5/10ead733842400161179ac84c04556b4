package com.yuut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String repassword = req.getParameter("repassword");
		int age =Integer.valueOf(req.getParameter("age")) ;
		
		PrintWriter out = resp.getWriter();
		
		if(password.equals(repassword)){
			if(age > 18){
				out.println("Congratulation! Regist successful!");
			}
			else{
				out.println("the age is below 18");
			}
		}
		else{
			out.println("the repassword is not equals password");
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req,resp);
		
	}
}
