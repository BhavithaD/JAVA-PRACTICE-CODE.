package Query;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamic_Query {
public static void main(String[] args) throws SQLException {
	Driver driver =new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	//DML Operation
	PreparedStatement p=c.prepareStatement("insert into student values (?,?,?,?)");
	
Scanner s=new Scanner(System.in);
	
	System.out.println("Enter Student id--> ");
	int id=s.nextInt();
	
	System.out.println("Enter Student Name--> ");
	String name=s.next();
	
	System.out.println("Enter Student Email--> ");
	String email=s.next();
	 	
	System.out.println("Enter Student Contact--> ");
	long contact=s.nextLong();	
	p.setInt(1, id);
	p.setString(2, name);
	p.setString(3, email);
	p.setLong(4, contact);
	
	System.out.println(p.executeUpdate());
	
	//DQL Operation
	PreparedStatement p1=c.prepareStatement("select name,email from student where id>=?");
	
	System.out.println("Enter the id--> ");
	int id1=s.nextInt();
	
	p1.setInt(1, id1);
	
	ResultSet rs=p1.executeQuery();
	
	while(rs.next())
	{
		
		System.out.println(rs.getString(1)+" "+rs.getString(2));
	}
	
	//DML Operation
	PreparedStatement p2=c.prepareStatement("delete from student where id>?");
	int id2=s.nextInt();
	p2.setInt(1, id2);
	System.out.println(p2.executeUpdate());
	
	
	c.close();
	s.close();
}
}