package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet1
 */
@WebServlet("/add")
public class AddServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		
		int k= i+j;
		PrintWriter writer=res.getWriter();
		writer.print("<html><body bgcolor='cyan'>");
		writer.println("result is : "+ k);
		writer.print("</body></html>");
		
		
		/*Cookie cookie=new Cookie("k", k+"");
		
		res.addCookie(cookie);*/
		
		//HttpSession session=req.getSession();
	
		//session.setAttribute("k", k);
		
		//res.sendRedirect("sqr");
		
		//req.setAttribute("k", k);
		
		//RequestDispatcher rd=req.getRequestDispatcher("sqr");
		
		//.forward(req, res);
		
		//PrintWriter writer=res.getWriter();
		//writer.println("result is : "+ k);

	}

}
