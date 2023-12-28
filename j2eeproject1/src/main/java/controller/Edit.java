package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.product_dao;
import dto.product_dto;
@WebServlet("/editproduct")
public class Edit extends HttpServlet{
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id=Integer.parseInt(req.getParameter("id"));
		product_dao dao=new product_dao();
		try {
			 HttpSession session=req.getSession();
			 String email=(String)session.getAttribute("email");
			 if(email!=null) {
			product_dto dto=dao.findByID(id);
			req.setAttribute( "editpro", dto);
			RequestDispatcher rd=req.getRequestDispatcher("edit_ProductSeller.jsp");
			 rd.include(req, resp);}
			 else {
				 req.setAttribute( "loginmessage", "Login Required");
					RequestDispatcher rd=req.getRequestDispatcher("Login_ProductSeller.jsp");
					rd.include(req, resp);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
