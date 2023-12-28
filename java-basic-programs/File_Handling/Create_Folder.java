package File_Handling;

import java.io.File;

public class Create_Folder {
public static void main(String[] args) {
	System.out.println("---------------");
	File f1=new File("D:\\Java classes\\Thala");
	
	f1.mkdir();
	if(f1.exists()) {
	f1.delete();}
	File f2=new File("D:\\Java classes\\Thala2");
	f2.mkdir();
	System.out.println("Folder created is success");
	System.out.println("---------------");
}
}
/*
 File f1=new File("C:\\Files\\FileHandling");
	if(f1.exists()) {
	System.out.println("Deleteting Old Folder and Creating New Folder....");
	f1.delete();
	f1.mkdir();//make directory
	}
	else {
		System.out.println("Creating new Folder....");
		f1.mkdir();
	}*/
