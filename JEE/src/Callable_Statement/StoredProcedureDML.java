package Callable_Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedureDML {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	
	CallableStatement cst=c.prepareCall("call studentdata.insert(?,?,?,?)");
	
	cst.setInt(1, 50);
	cst.setString(2, "xxy");
	cst.setString(3, "xxy@gmail.com");
	cst.setLong(4, 8909045367l);
	
    System.out.println(cst.execute()+" --> Because it is a DML Query");
    
     System.out.println(cst.getUpdateCount()+" rows inserted");
     System.out.println("-------------------------------------------");
     
     CallableStatement cst1=c.prepareCall("call studentdata.delete(?)");
     
     cst1.setInt(1, 40);
     
     System.out.println(cst1.execute()+" --> Because it is a DML Query");
     
     System.out.println(cst1.getUpdateCount()+" rows Deleted");
System.out.println("-------------------------------------------");
     
     CallableStatement cst2=c.prepareCall("call studentdata.update(?,?)");
     
     cst2.setString(1, "abc@gmail.com");
     cst2.setInt(2, 30);
     
     System.out.println(cst2.execute()+" --> Because it is a DML Query");
     
     System.out.println(cst2.getUpdateCount()+" rows Updated");
     
     c.close();
     
	
}
}
