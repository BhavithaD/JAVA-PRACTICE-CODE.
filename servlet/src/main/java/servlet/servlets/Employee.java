package servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/database")
public class Employee extends GenericServlet { 

	 
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String mail=req.getParameter("mail");
		int id=Integer.parseInt(req.getParameter("id"));
		 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/emptwo?user=root&password=root"); 
			PreparedStatement pst=c.prepareStatement("insert into testdb values(?,?,?)");
			
			pst.setString(1, name);
			pst.setString(2, mail);
			pst.setInt(3,id );
			
			PrintWriter pw=res.getWriter();
//			pw.println("Name:- "+name+"Mail:- "+mail+"ID:- "+id);
			pw.println(pst.executeUpdate()+" rows affected");
			
//            PreparedStatement pst1=c.prepareStatement("delete from testdb where name=?");			
//			pst.setString(1, name);	 
//			pw.println(pst1.executeUpdate()+" rows affected");
			c.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
	}
}