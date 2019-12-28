package com.himanshu.TestDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// setup connection variables
				String user = "springstudent";
				String pass = "springstudent";
				
				String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
				String driver = "com.mysql.cj.jdbc.Driver";
		
//		get connection to database
		try {
			
//			get PrintWriter object
			PrintWriter out = response.getWriter();
			
//			print connection url
			out.println("Connection to database: " +jdbcUrl);
			
//			get the class for driver
			Class.forName(driver);
			
//			get the connection
			Connection myConnection = DriverManager.getConnection(jdbcUrl,user,pass);
			
//			print success message
			out.println("Connected to the server database");
			
			myConnection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
//			throw new ServletException(e);
		}
		
	}

}
