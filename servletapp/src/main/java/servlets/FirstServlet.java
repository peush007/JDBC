package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet{
  
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inside init method");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Inside service method");
		PrintWriter wr = arg1.getWriter();
		
		wr.write("Hello from server");
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("kuch bhi");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}