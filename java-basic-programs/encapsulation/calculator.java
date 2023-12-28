package encapsulation;
// singleton-->one of the design pattern which allows only one object(refer singleton class)
public class calculator {

	int a=10;
 private static calculator c  =new calculator(); //only single object can create inside class
 
 private calculator() //constructor defined as private
 {
	System.out.println("calculation is on process");
	}
 public static calculator getcalci(int a,int b,int d)//creating of static method which as same reference
 { 
	 
	System.out.println("addition of three values--"+(a+b+d));
	/*without system class
	o/p--> calculation is on process
	
	*with system class
	*o/p-->calculation is on process
addition of three values--50
addition of three values--70
addition of three values--60
**************************************
addition of three values--60
addition of three values--90
addition of three values--50

	*/
		return c;
 }
 
}
