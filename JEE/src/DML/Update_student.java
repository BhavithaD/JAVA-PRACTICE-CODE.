package DML;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_student {
	public static void main(String[] args) throws SQLException {
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
		Statement s1=conn.createStatement();
		String q1="update student set email='pqr@gmail.com' where id=5";
	    int result1=s1.executeUpdate(q1);
	    System.out.println(result1);
	    conn.close();
	}
	
}
