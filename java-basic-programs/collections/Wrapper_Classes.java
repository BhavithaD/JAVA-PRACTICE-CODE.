package collections;

public class Wrapper_Classes {
public static void main(String[] args) {
	Integer i1=new Integer(50);
	Integer i2=50;//auto boxing
	
	System.out.println(i1);
	System.out.println(i2);
	
	System.out.println(i1.hashCode());
	System.out.println(i2.hashCode());
	
	System.out.println(i1.equals(i2));
	
	int x=i1;//auto unboxing
	System.out.println(x);
	
	String s1="123";
	int y=Integer.parseInt(s1);
	System.out.println(y);
	
	double z=Double.parseDouble(s1);
	System.out.println(z);
	
	float f=Float.parseFloat(s1);
	System.out.println(f);

}
}
