package Query;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	
	Statement s=c.createStatement();
	
	boolean b=s.execute("update student set email='yza@gmail.com' where id=9");//DML query returns false 
	System.out.println(b);
	
	int rows=s.getUpdateCount();
	System.out.println(rows+" rows affected");
	System.out.println("--------------------------------------------------");
	boolean b1=s.execute("select * from student");//DQL query returns true
	System.out.println(b1);
	
	ResultSet rs=s.getResultSet(); 
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4));
		
	}
	c.close();
	s.close();
	
}
}
