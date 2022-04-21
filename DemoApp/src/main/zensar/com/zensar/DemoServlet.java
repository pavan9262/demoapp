package com.zensar;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    		List<Student> studs=Arrays.asList(new Student(1,"pavan"),new Student(2,"kal"),new Student(3,"Nel"));
    		
    		String name="pavan";
    		req.setAttribute("students", studs);
    		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
    		rd.forward(req, resp);
    	}

}
