package dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import dto.product_dto;
 
public class product_dao {
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeproject1?user=root&password=root");
		return c;
	}
	
public int saveProduct(product_dto p) throws ClassNotFoundException, SQLException {
	 
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("Insert into productdb values(?,?,?,?,?,?)");
	 pst.setInt(1, p.getP_id());
	 pst.setString(2, p.getP_name());
	 pst.setString(3,p.getP_brand());
	 pst.setDouble(4, p.getP_price());
	 pst.setString(5,p.getP_discount());
	 Blob image=new SerialBlob(p.getP_image());
	 pst.setBlob(6, image);
	 int result= pst.executeUpdate();
	 c.close();
	 return result;
}

public int updateProduct(product_dto p) throws ClassNotFoundException, SQLException {
 
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("update productdb set p_name=?, p_brand=?, p_price=?, p_discount=?, p_image=? where p_id=?");
	 
	 pst.setString(1, p.getP_name());
	 pst.setString(2,p.getP_brand());
	 pst.setDouble(3, p.getP_price());
	 pst.setString(4,p.getP_discount());
	 Blob image=new SerialBlob(p.getP_image());
	 pst.setBlob(5, image);
	 pst.setInt(6, p.getP_id());
	 int res =  pst.executeUpdate();
	 c.close();
	 return res;

}
public int deleteProduct(int id) throws ClassNotFoundException, SQLException {

	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("delete from productdb where p_id=?");
	pst.setInt(1, id);
	int result=pst.executeUpdate();
	c.close();
	return result;
}
public product_dto findByID(int id) throws Exception {
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("select * from productdb where p_id=?");
	pst.setInt(1, id);
	 ResultSet rs=pst.executeQuery();
	 rs.next();
	 product_dto product=new product_dto();
	 product.setP_id(rs.getInt(1));
	 product.setP_name(rs.getString(2));
	 product.setP_brand(rs.getString(3));
	 product.setP_price(rs.getDouble(4));
	 product.setP_discount(rs.getString(5));
	 Blob blob=rs.getBlob(6);	  
	 byte[] blobasBytes=blob.getBytes(1,(int)blob.length());
	 product.setP_image(blobasBytes); 
	 return product;
}
public List<product_dto> findAll() throws ClassNotFoundException, SQLException{
	Connection c=createConnection();
	PreparedStatement pst=c.prepareStatement("select * from productdb");
	ResultSet rs=pst.executeQuery();
	List<product_dto> products=new ArrayList<>();
	while(rs.next()) {
		 product_dto product=new product_dto();
		 product.setP_id(rs.getInt(1));
		 product.setP_name(rs.getString(2));
		 product.setP_brand(rs.getString(3));
		 product.setP_price(rs.getDouble(4));
		 product.setP_discount(rs.getString(5));
		 Blob blob=rs.getBlob(6);	  
		 byte[] blobasBytes=blob.getBytes(1,(int)blob.length());
		 product.setP_image(blobasBytes); 
		 products.add(product);
	}
	return products;
}

//public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	product_dao dao = new product_dao();
//	product_dto dto = new product_dto();
//	dto.setP_brand("df");
//	dto.setP_discount("22");
//	dto.setP_name("demi");
//	dto.setP_id(1);
//	System.out.println(dao.updateProduct(dto));
//	
//}


}