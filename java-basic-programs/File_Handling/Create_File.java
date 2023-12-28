package File_Handling;

import java.io.File;
import java.io.IOException;

public class Create_File {
public static void main(String[] args) {
	System.out.println("***********");
	File f1=new File("D:\\Java classes\\Thala2\\abc.txt");
	try {
		f1.createNewFile();
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getName());
	} catch (IOException e) {
	 
		e.printStackTrace();
	}
	System.out.println("File created");
	
	System.out.println("***********");
}
}
/*
 File f1=new File("C:\\Files\\FileHandling\\ONEFile.txt");
	
	try {
		f1.createNewFile();
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getName());
		
		System.out.println(f1.setWritable(false));
		
	} catch (IOException e) {
 
		e.printStackTrace();
	}
	
	System.out.println("Done");
 */
