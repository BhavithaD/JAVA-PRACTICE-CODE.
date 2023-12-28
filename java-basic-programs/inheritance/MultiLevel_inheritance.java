package inheritance;
class M1
{
	int a=20;
	void b() 
	{
		System.out.println("M1 class");
	}
}
class M2 extends M1
{
	int c=40;
	void d()
	{
		System.out.println("M2 class");
	}
}
class M3 extends M2
{
	int e=60;
	void f() 
	{
		System.out.println("M3 class");
	}
}
public class MultiLevel_inheritance {
	public static void main(String[] args) 
	{
		M3 c1=new M3();
		System.out.println(c1.a);
		c1.b();
		System.out.println(c1.c);
		c1.d();
		System.out.println(c1.e);
		c1.f();
	}

}
