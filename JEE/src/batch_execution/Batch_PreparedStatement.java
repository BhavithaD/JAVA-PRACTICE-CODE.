package batch_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batch_PreparedStatement {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
Class.forName("com.mysql.cj.jdbc.Driver");

	Scanner s=new Scanner(System.in);
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata?user=root&password=root");
	
	//-----------------------------------------
	PreparedStatement pst=c.prepareStatement("insert into student values(?,?,?,?)");
	
	System.out.println("Enter Number rows to be Inserted--> ");
	int n=s.nextInt();
	
	while(n>0) {
	System.out.println("Enter the ID--> ");
	int id=s.nextInt();
	pst.setInt(1, id) ;
	
	System.out.println("Enter the Name--> ");
	String name=s.next();
	pst.setString(2, name) ;
	
	System.out.println("Enter the Email ID--> ");
	String  email=s.next();
	pst.setString(3, email) ;
	
	System.out.println("Enter the Contact--> ");
	long contact =s.nextLong();
	pst.setLong(4, contact) ;
	
	pst.addBatch();
	n--;
	}
	System.out.println("-----------------number of rows Inserted----------------------");
int[] arr=pst.executeBatch();
	
	for(int a=0;a<arr.length;a++) {
		System.out.print(arr[a]+" ");
			}
	System.out.println();
	//--------------------------------------------
	PreparedStatement pst1=c.prepareStatement("delete from student where id=?");
	System.out.println("Enter Number rows to be Deleted--> ");
	int n1=s.nextInt();
	
	while(n1>0) {
	System.out.println("Enter the ID--> ");
	int id=s.nextInt();
	pst1.setInt(1, id) ;
	pst1.addBatch();
	n1--;
	}
	System.out.println("----------------Deleted rows-----------------------");
    int[] arr1=pst1.executeBatch();
	
	for(int a=0;a<arr1.length;a++) {
		System.out.print(arr1[a]+" ");
			}
	System.out.println();
	System.out.println();
	//--------------------------------------------
	PreparedStatement pst2=c.prepareStatement("update student set name=? where id=?");
	System.out.println("Enter Number rows to be Updated--> ");
	int n2=s.nextInt();
	
	while(n2>0) {
		System.out.println("Enter the Name--> ");
		String name=s.next();
		pst2.setString(1, name) ;
		
	System.out.println("Enter the ID--> ");
	int id=s.nextInt();
	pst2.setInt(2, id) ;
	pst2.addBatch();
	n2--;
	}
	System.out.println("----------------Updated rows-----------------------");
    int[] arr2=pst2.executeBatch();
	
	for(int a=0;a<arr2.length;a++) {
		System.out.print(arr2[a]+" ");
			}
	System.out.println();
	System.out.println();
	
	c.close();
	s.close();
}
}
