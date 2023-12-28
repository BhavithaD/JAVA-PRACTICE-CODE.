package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfig2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		 String db=config.getInitParameter("emp_name");
		 PrintWriter pw=res.getWriter();
		 pw.println("Employee name is (ServletConfig 2)  --> "+db);
		
	}

}
