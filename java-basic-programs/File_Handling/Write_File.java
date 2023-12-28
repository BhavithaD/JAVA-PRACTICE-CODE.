package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
public static void main(String[] args) {
	System.out.println("**********");
	File f1=new File("D:\\Java classes\\Thala2\\abc.txt");
	FileWriter b=null;
	f1.setWritable(true);
	try {
		b=new FileWriter(f1);
		b.write("File Handling\n");
		b.write("File Handling\n");
		b.write("File Handling\n");
		b.write("File Handling\n");
		b.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(b!=null) {
			try {
			 b.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}
	 
	System.out.println("**********");
}
}
/*
 File f1=new File("C:\\Files\\FileHandling\\ONEFile.txt");
	FileWriter fw=null;
	
	//f1.setWritable(true)
	                   
	try {
		f1.setWritable(true);
		fw=new FileWriter(f1);
		fw.write("File Handling\n");
		fw.write("File Handling\n");
		fw.write("File Handling\n");
		fw.write("File Handling\n");
		fw.write("File Handling");
		
		fw.flush();
		System.out.println("Done");
	} catch (IOException e) {
		 
		e.printStackTrace();
	}
	finally {
		if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {
				 
				e.printStackTrace();
			}
		}
	}
 */