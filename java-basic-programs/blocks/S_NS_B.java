package blocks;
//blocks or initializers
class A{
	static float a;
	       float b;
	       {
	    	   b=9.76F;
	    	   System.out.println("NON-STATIC BLOCK AND INSTANCE INITIALIZATION BLOCK");
	       }
	     static  {
	    	 a=9.67f;
	    	   System.out.println("STATIC AND STATIC INITIALIZATION BLOCK");
	       }
}
public class S_NS_B {
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(A.a);
//static o/p
	     /*
            STATIC AND STATIC INITIALIZATION BLOCK
			9.67
			9.67
		 */

		A a1=new A();
		System.out.println(a1.b);
		 
		A a2=new A();
		System.out.println(a2.b);
//non static o/p
	/*	
		NON-STATIC BLOCK AND INSTANCE INITIALIZATION BLOCK
		9.76
		NON-STATIC BLOCK AND INSTANCE INITIALIZATION BLOCK
		9.76
	*/
	}

}
//overall o/p
/*
      STATIC AND STATIC INITIALIZATION BLOCK
      9.67
      9.67
      NON-STATIC BLOCK AND INSTANCE INITIALIZATION BLOCK
      9.76
      NON-STATIC BLOCK AND INSTANCE INITIALIZATION BLOCK
      9.76
 */
