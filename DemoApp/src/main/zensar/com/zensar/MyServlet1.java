package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	@Override
    		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    			
    			int a=9/0;
    			
    			PrintWriter writer=resp.getWriter();
    			writer.println("Hi");
    			
    			ServletContext sc=req.getServletContext();
    			String str=sc.getInitParameter("name");
    			writer.print(str);
    			
    			/*ServletConfig con=getServletConfig();
    			String str=con.getInitParameter("name");
    			writer.print(str);*/
    		}
}
