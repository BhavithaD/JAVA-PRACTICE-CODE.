package File_Handling;

import java.io.File;

public class Particular_Files {
public static void main(String[] args) {
	File f1=new File("C:\\Files\\FileHandling");
	String[] n=f1.list();
	for(String name:n) {
		if(name.endsWith(".txt")) {
			System.out.println(name);
		}
	}
}
}
