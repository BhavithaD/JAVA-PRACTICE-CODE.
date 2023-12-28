package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/yearcal")
public class YearCal extends HttpServlet {
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String name=req.getParameter("name");
	 int year=Integer.parseInt(req.getParameter("year"));
	 int month=Integer.parseInt(req.getParameter("month"));
	 int day=Integer.parseInt(req.getParameter("day"));
	 
	   LocalDate dob=LocalDate.of(year, month, day);
	   LocalDate cur=LocalDate.now();
	   Period ans=Period.between(dob, cur);
	   PrintWriter pw=resp.getWriter();
	 pw.println("Hello "+name+" you are "+ans.getYears()+" years "+ans.getMonths()+" month "+ans.getDays()+" days old");
	}

}
