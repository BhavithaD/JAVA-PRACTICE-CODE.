package DQL;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
public static void main(String[] args) throws SQLException {
	Driver driver =new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
	
	Statement st=c.createStatement();
	ResultSet r=st.executeQuery("select * from student");
	
	System.out.println("select * from student");
	while(r.next()) {
		int id=r.getInt(1);
		String name=r.getString(2);
		String email=r.getString(3);
		long contact =r.getLong(4);
		
		System.out.println(id+" "+name+" "+email+" "+contact+" ");
	}
	System.out.println("----------------------------");
	
	Statement st1=c.createStatement();
	ResultSet r1=st1.executeQuery("select id,name from student");
	
	System.out.println("select id,name from student");
	while(r1.next()) {
		int id1=r1.getInt(1);
		String name1=r1.getString(2);
 
		
		System.out.println(id1+" "+name1+" ");
	}
	
	System.out.println("----------------------------");
	ResultSet rs1=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root").createStatement().executeQuery("select email,contact from student");
	
	System.out.println("select email,contact from student");
	while(rs1.next()) {
		 
		String email=rs1.getString(1);
		long contact=rs1.getLong(2);
 
		
		System.out.println(email+" "+contact+" ");
	}
System.out.println("----------------------------");
	
	Statement st2=c.createStatement();
	ResultSet r2=st2.executeQuery("select email,id,contact from student");
	
	System.out.println("select email,id,contact from student");
	
	while(r2.next()) {
		
		int id1=r2.getInt("id");
		String email1=r2.getString("email");		
		long contact1=r2.getLong("contact");
 
		
		System.out.println(id1+" "+email1+" "+contact1);
	}
	
	c.close();
	
}

}
