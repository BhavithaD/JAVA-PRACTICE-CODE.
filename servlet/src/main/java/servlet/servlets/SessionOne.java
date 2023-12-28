package servlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session1")
public class SessionOne extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 String email=req.getParameter("mail");
 String password=req.getParameter("pass");
 
 HttpSession session =req.getSession();
 session.setAttribute( "mail",email);
 session.setAttribute("pass",password);
 
 RequestDispatcher rd=req.getRequestDispatcher("session2");
 rd.include(req, resp);
}
}
