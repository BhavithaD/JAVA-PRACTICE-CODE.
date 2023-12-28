package servlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie1")
public class CookieOne extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 String mail=req.getParameter("mail");
 String pass=req.getParameter("pass");
 
 Cookie c1=new Cookie("u_mail", mail);
 Cookie c2=new Cookie("u_pass",pass);
 
resp.addCookie(c1);
resp.addCookie(c2);

RequestDispatcher rd=req.getRequestDispatcher("cookie2");
rd.include(req, resp);
}
}
