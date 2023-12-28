package tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class image {
public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	FileInputStream f=new FileInputStream("C:\\Users\\Admin\\Desktop\\BhavithaD.png");
	PreparedStatement p=c.prepareStatement("insert into image values(?,?)");
	p.setInt(1, 300);
	p.setBlob(2, f);
	
	System.out.println(p.executeUpdate());
	
	c.close();
	
	
}
} 