package com.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	        ServletOutputStream out = resp.getOutputStream();
	        out.write("Hello KMIT".getBytes());
	        out.flush();
	        out.close();
	    }

}
