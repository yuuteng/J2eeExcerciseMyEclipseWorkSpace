<%@page import="javax.swing.JButton"%>
<%@page import="javax.swing.JFrame"%>
<%@page import="java.awt.Frame"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'result.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		out.println("username: " + username + "<br>");
		out.println("password: " + password + "<br>");
		System.out.println("666666");

		//JFrame frame = new JFrame ("title");
		//frame.getContentPane().add(new JButton("button"));
		//frame.setVisible(true);
	%>
  </body>
</html>
