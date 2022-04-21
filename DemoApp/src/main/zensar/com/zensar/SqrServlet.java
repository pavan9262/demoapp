package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqrServlet
 */

@WebServlet("/sqr")
public class SqrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int k=0;
		Cookie[] cookie=req.getCookies();
		for(Cookie c:cookie) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		/*HttpSession session=req.getSession();
		int k=(Integer) session.getAttribute("k");*/
		//int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		
		PrintWriter writer=resp.getWriter();
		writer.println("result is : "+ k);
		
		System.out.println("sqr called");
		
	}
}
