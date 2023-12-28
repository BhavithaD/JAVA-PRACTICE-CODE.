package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
public static void main(String[] args) {
	Employee e1=new Employee(123,"bbb",2000.9);
	File f1=new File("employee.ser");
	FileOutputStream fos=null;
	ObjectOutputStream o=null;
	try {
		fos=new FileOutputStream(f1);
		o=new ObjectOutputStream(fos);
		o.writeObject(e1);
		o.flush();
		fos.flush();
		
		 
		System.out.println("Serialization is Done");
		
	} catch (IOException e) {
		 
		e.printStackTrace();
	}
	finally {
		try {
			fos.close();
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
