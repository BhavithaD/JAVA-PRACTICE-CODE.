package class_reference_typecasting;
//one object type to another type of object is known as class/reference typecasting
class A{
	int a=10;
}
class B extends A{
	int b=20;
	int c=30;
}
class C extends B{
	int d=40;
	int e=50;
	int f=60;
}
public class up_down_casting {
	public static void main(String[] args) {
		//A a11=new A();
		A a13=new A();
		System.out.println(a13.a);
		C c1=new C();
		System.out.println("***************UP_CASTING*************************");
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1.e);
		System.out.println(c1.f);
		
		System.out.println("--------------------------------------------");
		B b1=(B)c1;
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		
		System.out.println("--------------------------------------------");
		A a1=(A)c1;
		System.out.println(a1.a);
		
		System.out.println("***************DOWN_CASTING***********************");
		A a2=new C();
		System.out.println(a2.a);
		System.out.println("--------------------------------------------");
		B a3=(B)a2;
		System.out.println(a3.a);
		System.out.println(a3.b);
		System.out.println(a3.c);
		System.out.println("--------------------------------------------");
		C a4=(C)a2;
		System.out.println(a4.a);
		System.out.println(a4.b);
		System.out.println(a4.c);
		System.out.println(a4.d);
		System.out.println(a4.e);
		System.out.println(a4.f);	
				
	}   
}
