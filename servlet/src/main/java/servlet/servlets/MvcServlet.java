package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MVC1")
public class MvcServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 int id=Integer.parseInt(req.getParameter("id"));
	 String name=req.getParameter("name");
	 long contact=Long.parseLong(req.getParameter("contact"));
	 StudentMVC s=new StudentMVC();
	 s.setId(id);
	 s.setName(name);
	 s.setContact(contact);
	 DAO_MVC dao=new DAO_MVC();
	 try {
//		dao.SaveStudent(s);
		PrintWriter pw=resp.getWriter();
		pw.println(dao.SaveStudent(s)+" student data Inserted");
//		dao.findByID(id);
//		dao.deleteByID(id);
//		dao.findAll();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
