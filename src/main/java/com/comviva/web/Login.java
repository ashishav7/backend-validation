package com.comviva.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
//		response.sendRedirect("login.html");
		request.getRequestDispatcher("index.html").include(request, response);
		request.getRequestDispatcher("login.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userEmail = request.getParameter("useremail");
		String userPassword = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		if(userEmail.trim().equals("") || userPassword.trim().equals("")) {
			out.print("<h1 style= 'color:red'> Login Failed *Required Fields are missing!");
		}
		else {
			if(userEmail.equals("admin@gmail.com") && userPassword.equals("admin@123")) {
				out.print("<h1 style= 'color:Green'> Login Sucessfull ");
			}
			else {
				out.print("<h1 style= 'color:red'> Login Failed *Authentication Failed!");
			}
		}
		out.print("</body></html>");
	}

}
