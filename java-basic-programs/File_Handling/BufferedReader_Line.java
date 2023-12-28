package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Line {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Files\\FileHandling\\ONEFile.txt");
	FileReader fr=new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}
}
}
