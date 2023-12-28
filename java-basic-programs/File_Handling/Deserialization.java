package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		File f1=new File("employee.ser");
		try {
			FileInputStream fs=new  FileInputStream(f1);
			ObjectInputStream os=new ObjectInputStream(fs);
			Employee em=(Employee) os.readObject();
			System.out.println(em);
		} catch (IOException | ClassNotFoundException e) {
			 
			e.printStackTrace();
		}
	}

}
