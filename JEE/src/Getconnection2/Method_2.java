package Getconnection2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Method_2 {
public static void main(String[] args) throws SQLException, IOException {
	Driver driver =new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	FileInputStream fis=new  FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\java_programs\\.metadata\\JEE\\src\\DML\\Method_2.properties");
	Properties p=new Properties();
	p.load(fis);
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata", p);
	
	Scanner s=new Scanner(System.in);
	
	//DML query and Dynamic Query
	PreparedStatement pst=c.prepareStatement("insert into student values (?,?,?,?)");
	
		
		System.out.println("Enter Student id--> ");
		int id=s.nextInt();
		
		System.out.println("Enter Student Name--> ");
		String name=s.next();
		
		System.out.println("Enter Student Email--> ");
		String email=s.next();
		 	
		System.out.println("Enter Student Contact--> ");
		long contact=s.nextLong();	
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, email);
		pst.setLong(4, contact);
		
		System.out.println(pst.executeUpdate()+" rows affected");
		
	//DQL query and Dynamic Query
	PreparedStatement p2=c.prepareStatement("delete from student where id>?");
		System.out.println("Enter the ID num from where you have to delete--> ");
		int id2=s.nextInt();
		p2.setInt(1, id2);
		System.out.println(p2.executeUpdate());
		
		c.close();
		s.close();
}
}
