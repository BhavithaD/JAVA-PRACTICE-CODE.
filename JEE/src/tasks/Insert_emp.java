package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_emp {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	 
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
	
	Scanner s=new Scanner(System.in);
	PreparedStatement pst=c.prepareStatement("insert into employee values(?,?,?,?,?)");
	System.out.println("Enter NO of Enteries to be inserted ==> ");
	int entry=s.nextInt();
	for(int i=1;i<=entry;i++) {
		System.out.println("Enter Employee id--> ");
		int id=s.nextInt();
		pst.setInt(1, id);
		
		System.out.println("Enter Employee Name--> ");
		String name=s.next();
		pst.setString(2, name);
		
		System.out.println("Enter Employee Gender--> ");
		String gender=s.next();
		pst.setString(3,gender);
		
		System.out.println("Enter Employee Email--> ");
		String email=s.next();
		pst.setString(4, email);

		 	
		System.out.println("Enter Employee salary--> ");
		double salary=s.nextDouble();
		pst.setDouble(5, salary);
		
		System.out.println(pst.execute());
		int rs=pst.getUpdateCount(); 
		System.out.println(rs+" rows affected");
		
		
	}
	
	c.close();
	s.close();
		
	
}
}
