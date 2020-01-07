package com.myserv.srv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.FeedDao;
import com.myserv.model.FeedBack;

@WebServlet("/FeedSrv")
public class FeedSrv extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		FeedBack fd = new FeedBack();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		fd.setName(name);
		fd.setEmail(email);
		fd.setMessage(message);
		
		FeedDao fdao = new FeedDao();
		PrintWriter out=response.getWriter();
		String f = fdao.saveFeed(fd);
		
		if(f=="Records Inserted") {
			out.write("FeedBack Successfully Sent");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

}
