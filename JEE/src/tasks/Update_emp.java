package tasks;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_emp {
	public static void main(String[] args) throws SQLException {
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s1=conn.createStatement();
		String q1="update employee set salary=30000.0 where id=4";
	    int result1=s1.executeUpdate(q1);
	    System.out.println(result1+" row affected");
	    conn.close();
	}
}
