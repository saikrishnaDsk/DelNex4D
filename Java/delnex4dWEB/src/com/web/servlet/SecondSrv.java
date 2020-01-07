package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondSrv")

public class SecondSrv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		out.print("HELLO from second srv");

		// String data= request.getParameter("uname");
		// out.print(data);

		try {
		HttpSession session= request.getSession();
		String data=session.getAttribute("abc").toString();
		out.print(data);
		}
		catch(Exception e) {
			out.print("SESSION TIME OUT");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
