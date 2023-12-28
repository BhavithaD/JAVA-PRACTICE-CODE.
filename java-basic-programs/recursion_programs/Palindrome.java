package recursion_programs;

public class Palindrome {
	//static int rev=0;
	//static int temp;
	
	static int Palindrome1(int n)
	{
		 int rev=0;
		if(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
		     n=n/10;
			Palindrome1(n);
			 
		}
		return rev;
	 
	}
public static void main(String[] args) {
	 for(int i=1;i<=200;i++) {
	int num = i;
	  
	System.out.println();
			if(num==Palindrome1(num))
			
				System.out.println(num +" is Palindrome");
		 
			
	 }		 
		
	
}
}
