package String_Programs;
import java.util.Scanner;

public class Rotate 
{
	public static void main(String[] args)
	{	 
	    try(Scanner sc=new Scanner(System.in))
	    {
		String result="";
		System.out.println("Enter the String to rotate --> ");
		String s1=sc.next();
		char[] ch=s1.toCharArray();
		System.out.println("Enter the No.of Steps to rotate  --> ");
		int step=sc.nextInt();
		for(int i=0;i<ch.length;i++) 
		{
			char ch1=(char)(ch[i]+step);
			if(ch1>'z')
			{
				result=result+(char)(ch1-26);
				
			}
			else {
				result=result+ch1;
			}
		 
		}
		System.out.println(result);
		}
	}
}
