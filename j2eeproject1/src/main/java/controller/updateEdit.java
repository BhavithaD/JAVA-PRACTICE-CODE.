package controller;

import java.io.IOException;
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
@SuppressWarnings("serial")
@WebServlet("/updateedit")
@MultipartConfig(maxFileSize = 5*1024*1024)
public class updateEdit extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("name");
	int id=Integer.parseInt(req.getParameter("id"));
	String brand=req.getParameter("brand");
	double price=Double.parseDouble(req.getParameter("price"));
	String discount=req.getParameter("discount");
	Part image=req.getPart("image");
	
	 product_dto dto=new product_dto();
	 dto.setP_id(id);
	 dto.setP_name(name);
	 dto.setP_brand(brand);
	 dto.setP_price(price);
	 dto.setP_discount(discount);
	 if(image.getSize()>1) 
	 {
		 dto.setP_image(image.getInputStream().readAllBytes());
	 }
	 else
	 {
		 product_dao dao=new product_dao();
		try {
			product_dto dto1 = dao.findByID(Integer.parseInt(req.getParameter("id")));
			dto.setP_image(dto1.getP_image());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	 }
	try {
		product_dao dao1 = new product_dao();
		int res = dao1.updateProduct(dto);
		req.setAttribute("products", dao1.findAll());
		RequestDispatcher dispatcher = req.getRequestDispatcher("Home_ProductSeller.jsp");
		dispatcher.include(req, resp);
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}
		}
	 
