package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {
public static void main(String[] args) {
	System.out.println("**********");
	File F1=new File("D:\\Java classes\\Thala2\\abc.txt");
	FileReader r=null;
	try {
		r=new FileReader(F1);
		int size=(int) F1.length();
		System.out.println(size);
		char[] arr=new char[size];
		r.read(arr);
		String data=new String(arr);
		System.out.println(data);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("**********");
}
}
/*
 File f1=new File("C:\\Files\\FileHandling\\ONEFile.txt");
	FileReader fr=null;

	try {
		fr=new FileReader(f1);
		int size=(int) f1.length();
		System.out.println(size);
		char[] arr=new char[size];
		fr.read(arr);
		String data=new String(arr);
		System.out.println(data);
	} catch (IOException e) {
	 
		e.printStackTrace();
	}
	finally {
		if(fr!=null) {
			
				try {
					fr.close();
				} catch (IOException e) {
					 
					e.printStackTrace();
				}
			
		}
	}
 */
