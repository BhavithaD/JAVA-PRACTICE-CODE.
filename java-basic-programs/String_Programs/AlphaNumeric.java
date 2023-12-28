package String_Programs;

public class AlphaNumeric {
public static void main(String[] args) {
	String s1="A2B3C4 ";
	 	 int num=0;
	 	 char mychar='\0';
	 	 for(char ch:s1.toCharArray()) {
	 		 {
	 			 if(ch>='0' && ch<='9') {
	 				 num=num*10+ch-48;
	 			 }
	 			 else
	 			 {
	 				 for(int i=1;i<=num;i++) {
	 					 System.out.print(mychar);
	 				 }
	 				 mychar=ch;
	 				 num=0;
	 			 }
	 		 }
	 	 }
	 	 System.out.println();
	 	 System.out.println("****************************************");
	 	 
	 	String s2="2A3B4C";
	 	 int num1=0;
	 	 char mychar1='\0';
	 	 for(char ch:s2.toCharArray()) {
	 		 {
	 			mychar1=ch;
	 			 if(ch>='0' && ch<='9') {
	 				 num1=num1*10+ch-48;
	 			 }
	 			 else
	 			 {
	 				 for(int i=1;i<=num1;i++) {
	 					 System.out.print(mychar1);
	 				 }
	 				 
	 				 num1=0;
	 			 }
	 		 }
	 	 }
	 
}
}
