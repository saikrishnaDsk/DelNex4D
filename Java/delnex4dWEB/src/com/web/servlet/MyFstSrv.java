package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyFstSrv")

public class MyFstSrv extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("HELLO ");

		response.setContentType("text/html");

		String data= request.getParameter("uname");
		out.print(data);


		// RequestDispatcher rd= request.getRequestDispatcher("SecondSrv");
		//
		// rd.forward(request, response);


		  HttpSession session=request.getSession();
		session.setAttribute("abc",data);
		session.setMaxInactiveInterval(5);
		out.print("<form action='SecondSrv'>");
		// out.print("<input type='hidden' value='"+data+"' name='uname'>");
		out.print("<input type='submit' value='next'>");
		out.print("</form>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out=response.getWriter();
	out.print("this is post req ");


	String[] countries=req.getParameterValues("country");

	for(String country:countries)
	out.println(country);


	}
}