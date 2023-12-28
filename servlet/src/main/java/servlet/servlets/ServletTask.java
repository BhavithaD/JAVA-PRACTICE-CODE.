package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletTask implements Servlet {

	public static void main(String[] args)  {
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
//	 String n1=req.getParameter("num1");
//	 String n2=req.getParameter("num2");
		
	 int n1=Integer.parseInt(req.getParameter("num1"));
	 int n2=Integer.parseInt(req.getParameter("num2"));
	 
	 PrintWriter pw=res.getWriter();
	 pw.println("Sum of 2 Numbers--> "+(n1+n2));
	 pw.println("Product of 2 Numbers--> "+(n1*n2));
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
