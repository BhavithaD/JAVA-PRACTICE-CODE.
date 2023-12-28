package servlet.servlets;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/one")
public class GServlet1 extends GenericServlet{
 public static void main(String[] args) {
	
}

@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 String name=req.getParameter("name");
 int age=Integer.parseInt(req.getParameter("age"));
 String msg=req.getParameter("msg");
 
 req.setAttribute("name", name);
 req.setAttribute( "age", age);
 req.setAttribute("msg", msg);
 
 RequestDispatcher rd=req.getRequestDispatcher("two");
 rd.include(req, res);
	
}

}
