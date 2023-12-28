package String_Programs;
import java.util.Scanner;
public class Permutation 
{
	
	private static int fact(String s1)
	{
	  int num =1;
	  for(int i =1; i<=s1.length();i++)
	  {
		  num=num*i;
	  }
	  
	  return num;
	}

	 
	static void permute(String s1,String s2) 
	{
		  
		if(s1.length()==0) {
			//System.out.println();
			System.out.println(s2);	
			return;
		}
		 
		for(int i=0;i<s1.length();i++) {
			
			char ch=s1.charAt(i);
			//System.out.println(s1);
			
			String res=s1.substring(0, i)+s1.substring(i+1);
			 
		
		 
			permute(res,ch+s2);
		
			
		}
	}

public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter string to know permute strings --> ");	
	String s1=sc.next();
	
		String result="";	
 	
		System.out.println("There is "+fact(s1)+ " \nPossible Permutation Strings "+"( " +s1+" )");
		permute(s1,result);
		 
		sc.close();
		
	
}

}
