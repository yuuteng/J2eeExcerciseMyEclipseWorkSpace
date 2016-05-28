package com.yuut.servlet;
/**
 * 双色球开奖
 * 总共1-33 个不重复带数字的 红球;1-16个蓝球
 * 开奖:6个红球+1蓝球
 * */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class DoubleColorBallServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Set 集合, hashset 不重复 无序
		Set<Integer> redBallSet = new HashSet<Integer>();
		Random random = new Random();
		
		while (redBallSet.size()<6) {
			//random.nextInt(33)  产生 0-32随机数;+1后 1-33
			int randomValue = random.nextInt(33) + 1;
			redBallSet.add(randomValue);
		}
		
		int blueValue = random.nextInt(16) + 1;
		String result = "Red Ball is : ";
		//foreach 遍历 集合set 中 所有元素
		for (Integer i : redBallSet) {
			result +=i +  " ";
		}
		result +="<br> Blue Ball is : " + blueValue ;
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>" + result + "</body></html>");
	}

}
