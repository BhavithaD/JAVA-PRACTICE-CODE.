package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.product_dao;
import dto.product_dto;

 
@WebServlet("/addproduct")
@MultipartConfig(maxFileSize = 1024*1024*6)
public class Addproduct extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id")) ;
	String name=req.getParameter("name");
	String brand=req.getParameter("brand");
	Double price=Double.parseDouble(req.getParameter("price"));
	String discount=req.getParameter("discount");
	Part image=req.getPart("image");
	
	 product_dto dto=new product_dto();
	 dto.setP_id(id);
	 dto.setP_name(name);
	 dto.setP_brand(brand);
	 dto.setP_price(price);
	 dto.setP_discount(discount);
	 dto.setP_image(image.getInputStream().readAllBytes());
	 
	 product_dao dao=new product_dao();
	 try {
		int res=dao.saveProduct(dto);
		if(res==1) {
			req.setAttribute( "products", dao.findAll());
	 RequestDispatcher rd=req.getRequestDispatcher("Home_ProductSeller.jsp");
	 rd.include(req, resp);
		}
		else {
			req.setAttribute("message", "Product not Saved");
			 RequestDispatcher rd=req.getRequestDispatcher("addProducts_ProductSeller.jsp");
			 rd.include(req, resp);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
