package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MVC4")
public class MvcServlet4 extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DAO_MVC dao=new DAO_MVC();
	PrintWriter pw=resp.getWriter();
	try {
		pw.println(dao.findAll());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
//		@Override
//		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			 int id=Integer.parseInt(req.getParameter("id"));
////			 String name=req.getParameter("name");
////			 long contact=Long.parseLong(req.getParameter("contact"));
//			 StudentMVC s=new StudentMVC();
//			 s.setId(id);
////			 s.setName(name);
////			 s.setContact(contact);
//			 DAO_MVC dao=new DAO_MVC();
//			 try {
////				dao.SaveStudent(s);
////				dao.findByID(id);
//				
//				PrintWriter pw=resp.getWriter();
//				pw.println(dao.deleteByID(id)+" ");
//				dao.findAll();
//	 		
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} 

