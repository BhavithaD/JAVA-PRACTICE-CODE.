package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.seller_dao;
import dto.seller_dto;
@WebServlet("/signup")
public class SignUp extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 int id=Integer.parseInt(req.getParameter("id"));
 String name=req.getParameter("name");
 String email=req.getParameter("email");
 long contact =Long.parseLong(req.getParameter("contact"));
 String password=req.getParameter("password");
 
 seller_dto s=new seller_dto();
	 s.setS_id(id);
	 s.setS_name(name);
	 s.setS_email(email);
	 s.setS_contact(contact);
	 s.setS_password(password);
	 
seller_dao dao=new seller_dao();

 try {
	int res=dao.SaveSeller(s);
	if(res==1) {
		req.setAttribute("message", "signup successful");
		RequestDispatcher rd=req.getRequestDispatcher("index_ProductSeller.jsp");
		rd.include(req, resp);
	}
	else {
		req.setAttribute("message", "signup failed");
		RequestDispatcher rd=req.getRequestDispatcher("index_ProductSeller.jsp");
		rd.include(req, resp);
	}
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
