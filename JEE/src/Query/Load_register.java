package Query;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Load_register {
public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	FileInputStream f=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\java_programs\\.metadata\\JEE\\src\\DML\\Method_2.properties");
	Properties p=new Properties();
	p.load(f);
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata",p);
	
	PreparedStatement pst=c.prepareStatement("select * from student");
	
	ResultSet rs=pst.executeQuery();

	while(rs.next())
	{
		
		System.out.println(rs.getString(2)+" "+rs.getString(4));
	}
	c.close();
}
}
