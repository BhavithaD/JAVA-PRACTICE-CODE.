package class_reference_typecasting;
class downcasting{
//	void test(A a11) {
//		C c11=(C)a11;
//		System.out.println();
//		System.out.println(c11.a);
//		System.out.println(c11.b);
//		System.out.println(c11.c);
//		System.out.println(c11.d);
//		System.out.println(c11.e);
//		System.out.println(c11.f);
//		
//		B b11=(B)a11;
//		System.out.println();
//		System.out.println(b11.a);
//		System.out.println(b11.b);
//		System.out.println(b11.c);
//		
//		A a12=(A)a11;
//		System.out.println();
//		System.out.println(a12.a);
//		System.out.println("///////////////////////////////////////////////");
//	}
		
	void test2(A a13) {
		if(a13 instanceof C) 
		{
			 
				C c12=(C)a13;
				System.out.println("------------");
				System.out.println(c12.a);
				System.out.println(c12.b);
				System.out.println(c12.c);
				System.out.println(c12.d);
				System.out.println(c12.e);
				System.out.println(c12.f);
				System.out.println("------------");

		}
		else if(a13 instanceof B) {
			B b12=(B)a13;
			System.out.println("------------");
			System.out.println(b12.a);
			System.out.println(b12.b);
			System.out.println(b12.c);
			System.out.println("------------");
			 	
		}
		else
		{
			System.out.println("------------");
			System.out.println(a13.a);
			System.out.println("------------");
		}
			
		}
	
}

public class InstanceOf {
	public static void main(String[] args) {
		downcasting d=new downcasting();
		 
		 
		
		d.test2(new B());
	 
	}

}
