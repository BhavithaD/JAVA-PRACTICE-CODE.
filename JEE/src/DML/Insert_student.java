package DML;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_student {
public static void main(String[] args) throws SQLException {
	Driver driver=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","root");
	Statement s1=conn.createStatement();
     
//    String q1="insert into student values(2,'def','def@gmail.com',6784932987)";
//    int result1=s1.executeUpdate(q1);
//    System.out.println(result1);
//    
//    String q2="insert into student values(3,'ghi','ghi@gmail.com',7684932987)";
//    int result2=s1.executeUpdate(q2);
//    System.out.println(result2);
//    
 String q3="insert into student values(4,'jkl','jkl@gmail.com',8984932987)";
    int result3=s1.executeUpdate(q3);
    System.out.println(result3);
    
    String q4="insert into student values(5,'mno','mno@gmail.com',9584932987)";
    int result4=s1.executeUpdate(q4);
    System.out.println(result4);
    
    conn.close();
}
}
