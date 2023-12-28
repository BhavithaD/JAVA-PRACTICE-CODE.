package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfig1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 ServletConfig config=getServletConfig();
	 String db=config.getInitParameter("db_name");
	 PrintWriter pw=res.getWriter();
	 pw.println("DataBase name is (ServletConfig 1)  --> "+db);
		
	
	}
}
 