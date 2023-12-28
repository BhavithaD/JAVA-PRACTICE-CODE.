package DML;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) throws SQLException, IOException {
	Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	
	//insert 2 rows using prepared statement(getConnection(String url);)1 parameter
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	
	Scanner sc=new Scanner(System.in);
	PreparedStatement pst=c.prepareStatement("insert into student values(?,?,?,?)");
	
	System.out.println("Enter how many records ");
	int entry=sc.nextInt();
	for(int i=1;i<=entry;i++) 
	{
		System.out.println("Enter Student id--> ");
		int id1=sc.nextInt();
		
		System.out.println("Enter Student Name--> ");
		String name1=sc.next();
		
		System.out.println("Enter Student Email--> ");
		String email1=sc.next();
		 	
		System.out.println("Enter Student Contact--> ");
		long contact1=sc.nextLong();	
		
		pst.setInt(1, id1);
		pst.setString(2, name1);
		pst.setString(3, email1);
		pst.setLong(4, contact1);
		
		System.out.println(pst.executeUpdate()+" rows affected");
	}	
	c.close();
	System.out.println("--------------------------------------------");
	
	//delete 1 row using statement(getConnection(String url,properties object);) 2 parameter
	FileInputStream fis=new  FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\java_programs\\.metadata\\JEE\\src\\DML\\Method_2.properties");
	Properties p=new Properties();
	p.load(fis);
	Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata", p);
	Statement st=c1.createStatement();
	 
	String s1="delete from student where id=10";
	
	System.out.println(st.executeUpdate(s1)+" rows deleted");
	
	c1.close();
	sc.close();	
	
}
}
