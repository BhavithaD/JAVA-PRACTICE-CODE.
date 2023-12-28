package DML;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_student {
public static void main(String[] args) throws SQLException {
	Driver driver=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
	Statement s1=conn.createStatement();
     
    String q2="delete from student where id>9";
    int result2=s1.executeUpdate(q2);
    System.out.println(result2);
    conn.close();
}
}
