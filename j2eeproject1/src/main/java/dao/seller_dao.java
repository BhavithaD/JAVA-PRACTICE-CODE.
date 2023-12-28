package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.seller_dto;
 

public class seller_dao {
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject1?user=root&password=root");
		return c;
	}
	
public int SaveSeller(seller_dto s) throws ClassNotFoundException, SQLException {
	 
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("Insert into sellerdb values(?,?,?,?,?)");
	pst.setInt(1, s.getS_id());
	pst.setString(2,s.getS_name());
	pst.setString(3, s.getS_email());
	pst.setLong(4, s.getS_contact());
	pst.setString(5, s.getS_password());
	int result=pst.executeUpdate();
	 c.close();
	return result;
}


public seller_dto findByEmail(String email) throws Exception {
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("select * from sellerdb where S_email=?");
	pst.setString(1, email);
	 ResultSet rs=pst.executeQuery();	
	 if(rs.next()) {
	  seller_dto s=new seller_dto();
	 
	 s.setS_id(rs.getInt(1));
	 s.setS_name(rs.getString(2));
	 s.setS_email(rs.getString(3));
	 s.setS_contact(rs.getLong(4));
	 s.setS_password(rs.getString(5));
	 c.close();
	 return s;
	 }
	 return null;
}
//public seller_dto findByPassword(String password) throws Exception {
//	Connection c=createConnection();
//	PreparedStatement pst=c.prepareStatement("select * from sellerdb where S_password=?");
//	pst.setString(1,password);
//	 ResultSet rs=pst.executeQuery();	
//	if(rs.next()) {
//		seller_dto s=new seller_dto(); 
//		 
//		 s.setS_id(rs.getInt(1));
//		 s.setS_name(rs.getString(2));
//		 s.setS_email(rs.getString(3));
//		 s.setS_contact(rs.getLong(4));
//		 s.setS_password(rs.getString(5));
//		 c.close();
//		 return s;
//	  }
//	   return null;
//}
}
