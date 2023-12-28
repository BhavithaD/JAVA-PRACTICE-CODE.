package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.product_dao;
import dao.seller_dao;
import dto.seller_dto;
@WebServlet("/login")
public class Login extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String email=req.getParameter("email");
	 String password=req.getParameter("password");
	 
	 
	 seller_dao dao=new seller_dao();
	 try {
		seller_dto dto=dao.findByEmail(email);
		product_dao dao1=new product_dao();
		if(dto!=null) 
		{
			if(dto.getS_password().equals(password))
			{
				HttpSession session=req.getSession();
				session.setAttribute( "email", email);
				req.setAttribute( "products", dao1.findAll());
				RequestDispatcher rd=req.getRequestDispatcher("Home_ProductSeller.jsp");
				rd.include(req, resp);
			}
			else 
			{
				req.setAttribute("loginmessage", "Wrong Password");
				RequestDispatcher rd=req.getRequestDispatcher("Login_ProductSeller.jsp");
				rd.include(req, resp);
			}
		}
		else
		{
			req.setAttribute("loginmessage", "Invalid Eamil");
			RequestDispatcher rd=req.getRequestDispatcher("Login_ProductSeller.jsp");
			rd.include(req, resp);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}























