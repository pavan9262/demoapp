package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServlet
 */
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int a=10/0;
		String userName = req.getParameter("txtUser");
		String password = req.getParameter("txtPassword");

		PrintWriter writer = resp.getWriter();

		Connection con = null;
		PreparedStatement pstm = null;
		;
		;
		ResultSet rs = null;
		writer.println("<html>");
		writer.println("<body>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch22", "root", "P@van@942");
			pstm = con.prepareStatement("select * from login where username=? and password=?");
			pstm.setString(1, userName);
			pstm.setString(2, password);
			rs = pstm.executeQuery();

			RequestDispatcher dispatcher = null;
			if (rs.next()) {
				dispatcher = req.getRequestDispatcher("success.html");
				dispatcher.forward(req, resp);
				//dispatcher.include(req, resp);
				//resp.sendRedirect("http://www.youtube.com");
				
			} else {
				System.out.println("username or password is incorrect...");
				//dispatcher = req.getRequestDispatcher("error.html");
				dispatcher = req.getRequestDispatcher("login.html");
				//dispatcher.forward(req, resp);
				//dispatcher.include(req, resp);

				
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		writer.println("</html>");
		writer.println("</body>");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("txtUser");
		String password = req.getParameter("txtPassword");

		PrintWriter writer = resp.getWriter();

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		writer.println("<html>");
		writer.println("<body>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch22", "root", "P@van@942");
			pstm = con.prepareStatement("select * from login where username=? and password=?");
			pstm.setString(1, userName);
			pstm.setString(2, password);
			rs = pstm.executeQuery();

			if (rs.next()) {
				writer.println("<h2>Authentication Success</h2>");
			} else {
				writer.println("<h2>Sorry, Authentication Failed</h2>");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		writer.println("</html>");
		writer.println("</body>");

		/*
		 * if(userName.equals("Zensar")&& password.equals("Zensar@123")) {
		 * writer.println("<h2> Authentication successfull !!! </h2>"); }else {
		 * writer.println("<h2> Please enter valid details !!! </h2>"); }
		 * 
		 * resp.getWriter().println("<h2> Login successfull !!! </h2>");
		 */
	}

}
