package basics;
import java.util.Scanner;
public class gcd {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1--> ");
	int num1=sc.nextInt();
	System.out.println("Enter num2--> ");
	int num2=sc.nextInt();
	
	while(num1!=num2) 
	{
		if(num1>num2) {
			num1=num1-num2;}
		else {
			num2=num2-num1;}
		
	}
	System.out.println(num2);
	sc.close();
	
}
}
