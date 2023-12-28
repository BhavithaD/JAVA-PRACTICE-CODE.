package tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Delete_emp_r {
public static void main(String[] args) throws SQLException, IOException {
	
	Driver driver =new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	FileInputStream fis=new  FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\java_programs\\.metadata\\JEE\\src\\DML\\Method_2.properties");
	Properties p=new Properties();
	p.load(fis);
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", p);
	
	Scanner s=new Scanner(System.in);
	PreparedStatement pst=c.prepareStatement("delete from employee where id=?");
	System.out.println("Enter the ID num from where you have to delete--> ");
	int id=s.nextInt();
	pst.setInt(1, id);
	System.out.println(pst.executeUpdate()+" rows deleted");
	
	c.close();
	s.close();

}
	}
