package servlet.servlets;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_MVC {
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
		return c;
	}
public int SaveStudent(StudentMVC s) throws ClassNotFoundException, SQLException {
	 
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("Insert into studentmvc values(?,?,?)");
	pst.setInt(1, s.getId());
	pst.setString(2,s.getName());
	pst.setLong(3, s.getContact());
	int result=pst.executeUpdate();
	 
	return result;
}
public StudentMVC findByID(int id) throws Exception {
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("select * from studentmvc where id=?");
	pst.setInt(1, id);
	 ResultSet rs=pst.executeQuery();
	 rs.next();
	 StudentMVC s=new StudentMVC();
	 s.setId(rs.getInt(1));
	 s.setName(rs.getString(2));
	 s.setContact(rs.getLong(3));
	 return s;
}
public int deleteByID(int id) throws Exception {
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("delete from studentmvc where id=?");
	pst.setInt(1,id);
	int result=pst.executeUpdate();
	return result;
	 
	 }
public List<StudentMVC> findAll() throws Exception {
	 
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("select * from studentmvc ");
	ResultSet rs=pst.executeQuery();
	List<StudentMVC> stu=new ArrayList<StudentMVC>();
	while(rs.next()) {
		 StudentMVC s=new StudentMVC();
		 s.setId(rs.getInt(1));
		 s.setName(rs.getString(2));
		 s.setContact(rs.getLong(3));
		 stu.add(s);
	}
	return stu;
}
}
