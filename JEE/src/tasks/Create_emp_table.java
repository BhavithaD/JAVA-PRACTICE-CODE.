package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
 
import java.sql.SQLException;
import java.sql.Statement;

public class Create_emp_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
		
		Statement s=c.createStatement();
		
		boolean b=s.execute("CREATE TABLE employee (\r\n"
				+ "  `id` INT NOT NULL,\r\n"
				+ "  `name` VARCHAR(45) NOT NULL,\r\n"
				+ "  `gender` CHAR NOT NULL,\r\n"
				+ "  `email` VARCHAR(45) NOT NULL,\r\n"
				+ "  `salary` DOUBLE NOT NULL,\r\n"
				+ "  PRIMARY KEY (`id`));");//DML query returns false 
		System.out.println(b);
		System.out.println("Created");
		 
		c.close();
		s.close();
		
	}
}
