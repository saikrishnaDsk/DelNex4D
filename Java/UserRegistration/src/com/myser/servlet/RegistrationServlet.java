package com.myser.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myjdbc.dao.UserDao;
import com.myjdbc.model.User;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		String data= request.getParameter("username");
		String data1= request.getParameter("password");
		String data3= request.getParameter("email");
		String data4= request.getParameter("gender");
		
		User us = new User();
		us.setName(data);
		us.setPassword(data1);
		us.setEmail(data3);
		us.setGender(data4);
		
		UserDao dao = new UserDao();
		
		String str = dao.saveUser(us);
		
		if(str == "USER REGISTRATION SUCCESS") {
			out.write("REGISTRATION SUCCESSFUL");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
