package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.product_dao;
@WebServlet("/deleteproduct")
public class DeleteProduct extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		product_dao dao=new product_dao();
	 try {
		 HttpSession session=req.getSession();
		 String email=(String)session.getAttribute("email");
		 if(email!=null) {
		dao.deleteProduct(id);
		req.setAttribute( "products", dao.findAll());
		req.setAttribute( "deletemessage", "Deleted SuccessFully");
		RequestDispatcher rd=req.getRequestDispatcher("Home_ProductSeller.jsp");
		rd.include(req, resp);}
		 else {
			 req.setAttribute( "loginmessage", "Login Required");
				RequestDispatcher rd=req.getRequestDispatcher("Login_ProductSeller.jsp");
				rd.include(req, resp);
		 }
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
