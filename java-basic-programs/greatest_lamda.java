@FunctionalInterface
interface greatest{
	boolean greatest1(int a,int b);
}
@FunctionalInterface
interface A{
	void m1();
}
public class greatest_lamda {
  
	public static void main(String[] args) {
		greatest g1=(a,b)-> a>b;
		System.out.println(g1.greatest1(34, 40));
		
		A a1=()->
		System.out.println("M1()");
		a1.m1();
	}
	
} 
