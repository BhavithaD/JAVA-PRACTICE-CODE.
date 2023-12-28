package inheritance;
class S1
{
	int a=20;
	void b() 
	{
		System.out.println("A class");
	}
}
class S2 extends S1
{
	int c=40;
	void d()
	{
		System.out.println("B class");
	}
}
public class SingleLevel_inheritance
{
	public static void main(String[] args) 
	{
		S2 b1=new S2();
		System.out.println(b1.a);
		b1.b();
		System.out.println(b1.c);
		b1.d();
	}
}
