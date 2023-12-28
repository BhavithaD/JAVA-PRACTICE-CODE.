package recursion_programs;

public class Armstrong
{
	public static void main(String[] args)
	{
	
		int a=1634,b=a; //407,153,371,370
		System.out.println("Given number is --> "+a);
		B(b);
		System.out.println("Digit Count of the given number is --> "+count);
		A(a);
		System.out.println("Digit sum of the given Number is --> "+sum);
		
		System.out.println("         The given number equals to digit sum  then it is Armstrong");
		System.out.println();
		 if(sum==a) 
			 System.out.println(a+" is Armstrong");
		 else
			 System.out.println(a+" is not Armstrong");
	
	}
 
	
	static int rem=0;
	static int fact(int rem,int count) 
	{
		int p=1;
		for(int i=1;i<=count;i++) 
		{
			p=p*rem;
		}
		return p;
	}
	
	static int count=0;
	static void B(int b) 
	{
		while(b>0) {
		count++;
		b=b/10;
		}
	}
	static int sum=0;
	static void A(int a) 
	{
		 
		if(a>0) {
			rem=a%10;
			sum=sum+fact(rem,count);
			a=a/10;
			A(a);
			
		}
	}
}