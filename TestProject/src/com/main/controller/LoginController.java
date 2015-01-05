package com.main.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.main.dao.LoginDao;
import com.main.dao.LoginDaoImpl;

public class LoginController extends HttpServlet{  		  	    
	  
	private static final long serialVersionUID = 1L;

	 protected void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
		 
		 HttpSession session = request.getSession(false);  
		 String name=request.getParameter("username") == null ? "" : request.getParameter("username");    
	     String password=request.getParameter("userpass") == null ? "" : request.getParameter("userpass");  
	        
	        if(session!=null)  
	        session.setAttribute("username", name); 
	        LoginDao dao = new LoginDaoImpl();
	        if(dao.validate(name, password)){
	        	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/dashboard.jsp");
		        dispatcher.forward(request, response);	            
	        }    
	        else{ 
	        	RequestDispatcher rd=request.getRequestDispatcher("login.html");    
	            rd.forward(request,response);   
	        }
	    }
	 
	 protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
	    }


}
