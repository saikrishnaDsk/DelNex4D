package com.myser.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myjdbc.dao.UserDao;
import com.myjdbc.model.User;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		String data1= request.getParameter("email");
		String data2= request.getParameter("password");
		
		

		UserDao dao = new UserDao();
		
		User user = dao.getUserByid(data1,data2);
		
		if(user !=null) {
			out.write("LOGIN SUCCESSFUL");
		}
		else
			out.write("USER LOGIN FAILED");
		
	}
}
