package servlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jspone")
public class jspone extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String name=req.getParameter("name");
	 req.setAttribute("u_name", name);
	 RequestDispatcher rd=req.getRequestDispatcher("jsphome.jsp");
	 rd.include(req, resp);
}
}
