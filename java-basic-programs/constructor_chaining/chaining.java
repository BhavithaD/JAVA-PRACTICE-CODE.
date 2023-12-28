package constructor_chaining;

class A{
	int x=28;
	A(){
		//int x=28;
		System.out.println("super class constructor()");
	}
}
class B extends A{
	int a;
	double b;
	int c;
	int y=10;
	B(){
		this(10);
		System.out.println( "sub class constructor()");
	}
	B(int a)
	{
		this(20,30.9);
		 this.a=a;
		 System.out.println( "sub class constructor(int a)");
	}
	B(int c,double b){
		super();
		this.c=c;
		this.b=b;
		System.out.println( "sub class constructor(int a,double b)");
		System.out.println(c+b);
		int y=40;
		System.out.println(super.x);
		System.out.println(this.y);
		System.out.println(y);}
	
	 }
	

	
	

public class chaining {
public static void main(String[] args) {
	B b1=new B( );
	System.out.println(b1.a);
	System.out.println(b1.c);
	System.out.println(b1.b);
	
}
}
