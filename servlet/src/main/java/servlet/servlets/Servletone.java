package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servletone implements Servlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		String name=req.getParameter("uname");
		 String  mail=req.getParameter("mail");
//		 System.out.println("Name ::- "+name);
//		 System.out.println("Email ::- "+mail);
		 
		 PrintWriter pw=res.getWriter();
		 pw.println("Dynamic page");
		 pw.println("Name ::- "+name);
		 pw.println("Email ::- "+mail);
		 
		 
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
