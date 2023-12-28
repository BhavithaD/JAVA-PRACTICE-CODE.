package composition;
class keyboard{
	int keys=102;
	double price=599.00;
	void usage1() {
		System.out.println("Used to enter the characters, Numbers, Symboles etc...");
	}
}
class Mouse{
	String color="Black";
	double price=299.99;
	void usage2() {
		System.out.println("Used to select and click the Specifications");
	}
}
class Monitor{
	double inch=7.5;
	void usage3() {
		System.out.println("Used to view or to display the content");
	}
}
class computer{
	 static keyboard k=new keyboard();
	        Mouse m=new Mouse();
	 static Monitor m1=new Monitor();
}

public class Computer_eg {
	public static void main(String[] args) {
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		System.out.println("KEYBOARD");
		computer.k.usage1();
		System.out.println("No of Keys in Keyboard-->"+computer.k.keys);
		System.out.println("Keyboard Price-->"+computer.k.price);
		System.out.println("--------------------------------");
		
		System.out.println("MOUSE");
		computer c=new computer();
		c.m.usage2();
		System.out.println("Color of Mouse-->"+c.m.color);
		System.out.println("Mouse Price-->"+c.m.price);
		System.out.println("--------------------------------");
		 
		
		System.out.println("MONITOR");
		computer.m1.usage3();
		System.out.println("Monitor inch sice-->"+computer.m1.inch);
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		
	}

}
