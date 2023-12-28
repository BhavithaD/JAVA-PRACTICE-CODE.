package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/two")
public class GServlet2 extends GenericServlet{

	public static void main(String[] args) {
	

	 
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 String name=(String)req.getAttribute("name");
	int age=(int) req.getAttribute("age");
	String msg=(String)req.getAttribute("msg");
	 
	 PrintWriter pw=res.getWriter();
	 pw.println("Name --> "+name);
	 pw.println("Age --> "+age);
	 pw.println("Message to Verify --> "+msg);
	}

}
