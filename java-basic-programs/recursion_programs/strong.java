package recursion_programs;

//import java.util.Scanner;

public class strong {
public static void main(String[] args) {
//	System.out.println("Enter the numbers");
//	Scanner sc=new Scanner(System.in);
//	int num=sc.nextInt();
//	//System.out.println(sc);
	int num=145;
	int temp =num;
	int sum=0;
	while (num>0) {
		int rem=num%10;
		
		sum= sum+fact(rem);
		num =num/10;
	}
	if(temp==sum)
	{
		System.out.println(temp+" is strong number");
	}
	else 
		System.out.println(temp+" not a strong number");
}
static int fact(int rem) {
	if (rem==0||rem==1) {
		return 1;
	}
	return rem*fact(rem-1);
	
}
}
