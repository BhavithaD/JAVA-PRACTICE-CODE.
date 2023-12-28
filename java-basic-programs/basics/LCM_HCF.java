package basics;
import java.util.Scanner;
public class LCM_HCF {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter NUM 1-->");
	    int num1=sc.nextInt();
	    System.out.println("Enter NUM 2-->");
	    int num2=sc.nextInt();
	    
	    int a=num1,b=num2,c=0;
	    
	    while (b!=0) {
	    	c=b;
	    	b=a%b;
	    	a=c;
	    }
	    int HCF=a;
	    int LCM=(num1*num2)/HCF;

	    System.out.println("Highest Common Factor of given numbers is--> "+HCF);
	    System.out.println("Least Common Multiple of given numbers is--> "+LCM);
	    sc.close();
	}
}
