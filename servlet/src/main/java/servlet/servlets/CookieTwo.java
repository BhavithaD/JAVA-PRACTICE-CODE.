package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class CookieTwo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();

		String email = null;
		String password = null;

		if (cookies.length > 0) {
			for (Cookie c : cookies) {
				if (c.getValue().equals("bavi@gmail.com")) {
					email = c.getValue();
				} else if (c.getValue().equals("bavi7")) {
					password = c.getValue();
				}

			}
		}
		if (email != null && password != null) {
			PrintWriter pw = resp.getWriter();
			pw.println("Login Success");
		} else {

			PrintWriter pw = resp.getWriter();
			pw.println("Login Failed");

		}
	}
}
