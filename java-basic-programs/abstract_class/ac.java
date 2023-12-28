package abstract_class;
 
abstract class operations //combination of concrete method and abstract method for abstract class
{
	int add(int a,int b)//concrete method
	{
		int c=a+b;
		System.out.println("Addition of given numbers is "+c);
		return c;
	}
	abstract int sub(int a, int b);//abstract method

}
abstract class operations2 extends operations //only abstract method for abstract class
{
	abstract int mul(int a, int b);//abstract method
	abstract int mod(int a, int b);//abstract method
	abstract int div(int a, int b);//abstract method
}
abstract class operations3 extends operations2 //only concrete methods for concrete class
{
	int add1(int a,int b,int c)//concrete method
	{
		int d=a+b+c;
		System.out.println("Addition of three numbers is "+d);
		return d;
	}
	 int sub1(int a, int b,int c)//concrete method
	 {
		 int d=a-b-c;
			System.out.println("Subtraction of three numbers is "+d);
			return d;
	 }

}
abstract class operations4 extends operations3{
	
}
class calculations extends operations4{
	int sub(int a,int b)//abstract method is override to concrete method
	{
		int c=a-b;
		System.out.println("Subtraction of given numbers is "+c);
		return c;
	}
	int mul(int a,int b)//abstract method is override to concrete method
	{
		int c=a*b;
		System.out.println("Multiplication of given numbers is "+c);
		return c;
	}
	int mod(int a,int b)//abstract method is override to concrete method
	{
		int c=a%b;
		System.out.println("Remainder of given numbers is "+c);
		return c;
	}
	int div(int a,int b)//abstract method is override to concrete method
	{
		int c=a/b;
		System.out.println("Quotient of given numbers is "+c);
		return c;
	}
	
}
public class ac{
	public static void main(String[] args) {
		System.out.println("*********************Different calculation methods*********************");
		operations4 op=new calculations();//up casting
		System.out.println("                                             ");
		op.add(10,200);
		System.out.println("------------------------------------------");
		op.sub(40,20);
		System.out.println("------------------------------------------");
		op.mul(2, 5);
		System.out.println("------------------------------------------");
		op.mod(34,4);
		System.out.println("------------------------------------------");
		op.div(20,2);
		System.out.println("------------------------------------------");
		op.add1(2,5 ,4);
		System.out.println("------------------------------------------");
		op.sub1(7,4, 2);
		System.out.println("                                             ");
		System.out.println("***********************************************************************");
		
	 
	}
	
}
