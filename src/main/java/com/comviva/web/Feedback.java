package com.comviva.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Feedback() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
//		response.sendRedirect("login.html");
		request.getRequestDispatcher("index.html").include(request, response);
		request.getRequestDispatcher("feedback.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}


}
