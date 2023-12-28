package encapsulation;

import java.io.IOException;

public class singleton {
	public static void main(String[] args) throws IOException {
		calculator add1=calculator.getcalci(10,20,20);
		  System.out.println(add1.a);
		  
		System.out.println("**************************************");
		 
		
		Runtime e1=Runtime.getRuntime();
		e1.exec("notepad");
		
		/*
claculation is on process
addition of three values--50
addition of three values--70
addition of three values--60
**************************************
addition of three values--60
addition of three values--90
addition of three values--50

		 */
	}

}
