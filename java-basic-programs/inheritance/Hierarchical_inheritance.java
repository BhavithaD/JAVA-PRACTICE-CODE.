package inheritance;
class H1
{
	int a=20;
	void b() 
	{
		System.out.println("H1 class");
	}
}
class H2 extends H1
{
	int c=40;
	void d()
	{
		System.out.println("H2 class");
	}
}
class H3 extends H1
{
	int e=60;
	void f() 
	{
		System.out.println("H3 class");
	}
}
public class Hierarchical_inheritance  
{
	public static void main(String[] args) 
	{
		System.out.println("H2 class extends H1 class properties ");
		H2 h1=new H2();
		System.out.println(h1.a);
		System.out.println(h1.c);
		h1.b();
		h1.d();
		System.out.println("---------------------------------");
		System.out.println("H3 class extends H1 class properties ");
		H3 h2=new H3();
		System.out.println(h2.a);
		System.out.println(h2.e);
		h2.b();
		h2.f();
	}
	
	
}
