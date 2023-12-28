package constructor;

//constructor name must same as class name

class sample1{
	 String d="Default constructor";
	 float z;//"0.0" <-- default value
	/*every class contains default constructor by the compiler and 
	 default values for the Data members
	 */
} 

class sample2
{  
	String z="Zero parameter constructor";
	sample2()//"zero parameter constructor"<-- without arguments
	{
		System.out.println("sample2 class");
	}
	
	String p1="Parameter constructor with one argument";
	int l;
	double m ;
	float n ;
	sample2(int l1)//"Parameterized constructor"<-- with arguments
	{
		 l=l1;
		System.out.println("sample2 class (int) -> "+l);
	}
	String p2="Parameter constructor with two argument";
	sample2(double m1,float n1)//"Parameterized constructor"<-- with arguments
	{
		m=m1;
		n=n1;
		System.out.println("sample2 class (double,float) -> "+m+" , "+n);
	}
}
 
public class constructor_eg 
{
   
	public static void main(String[] args) 
	{
		 
		sample1 s1=new sample1(); //default constructor
		System.out.println(s1.z);
		System.out.println("------"+s1.d+"------");
		System.out.println();
		sample2 s2=new sample2(); //Zero parameter constructor
		System.out.println("------"+s2.z+"------");
		System.out.println();
		sample2 s3=new sample2(9);//Parameterized constructor
		System.out.println("------"+s3.p1+"------");
		sample2 s4=new sample2(4.5,67.6f);
		System.out.println("------"+s4.p2+"------");
		
		 
	}
}
