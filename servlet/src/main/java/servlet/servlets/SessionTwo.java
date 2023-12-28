package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session2")
public class SessionTwo extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		String mail=(String)session.getAttribute("mail");
		String pass=(String)session.getAttribute("pass");
		
		if (!mail.isBlank() && !pass.isBlank()) {
//			PrintWriter pw = resp.getWriter();
//			pw.println("Login Success");
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp ");
			 rd.include(req, resp);
		} else {
//			PrintWriter pw = resp.getWriter();
//			pw.println("Login Failed");
			RequestDispatcher rd=req.getRequestDispatcher("Session.html");
			 rd.include(req, resp);

		
	}
	}
}

