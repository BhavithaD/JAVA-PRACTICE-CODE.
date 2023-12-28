package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SevletContext1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 
		ServletContext context=getServletContext();
		String name=context.getInitParameter("db_name");
		
		PrintWriter pw=res.getWriter();
		pw.println("ServletContext 1 database is "+name);
	}

}
