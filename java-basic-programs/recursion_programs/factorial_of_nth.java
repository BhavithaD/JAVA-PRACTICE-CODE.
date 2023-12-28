package recursion_programs;
//import java.util.Scanner;
public class factorial_of_nth {
 static int factorial(int b) {
	 if(b==0||b==1) 
		 return 1;
	 
	 else 
		 return b*factorial(b-1);
 }
 public static void main(String[] args) {
//	 Scanner s1=new Scanner(System.in);
//	 System.out.println("Enter the Value-->");
//	 int a=s1.nextInt();
	 int a=7;
	System.out.println(a+" factorial is "+factorial(a));
}
}
