package batch_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_Statement {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	
	Statement st=c.createStatement();
	
	st.addBatch("insert into student values(40,'pqr','pqr@gmail.com',7654321890)");
	st.addBatch("insert into student values(60,'prs','prs@gmail.com',6454321067)");
	st.addBatch("delete from student where id=60");
	st.addBatch("update student set email='uvw@gmail.com' where id=20 ");
	st.addBatch("delete from student where id>=40");
	
	int[] arr=st.executeBatch();
	
	for(int a=0;a<arr.length;a++) {
		System.out.print(arr[a]+" ");
			}
	System.out.println();
	System.out.println("---------------------------------------");
 
}
}
