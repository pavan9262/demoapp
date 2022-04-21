package com.java;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class LifeCycleServlet
 */
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		@Override
			public void init(ServletConfig config) throws ServletException {
			
			super.init(config);
			
			System.out.println("Iam inside init method");
			}
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.service(req, res);
			System.out.println("Iam inside service method");

		}
		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			super.destroy();
			System.out.println("Iam inside destroy method");

		}
}
