package constructor_chaining;
class Hi{
	int x=50;
	int y=20;
	Hi()
	{
		this(4.5);
		System.out.println("Super Class constructor 1");
	}
	Hi(String s){
		System.out.println("Super Class constructor 2");
	}
	Hi(double d){
		this("Bhavi");
		System.out.println("Super Class constructor 3");
	}
}
class Bye extends Hi{
	int p=8;
	Bye(int a,int b){
		super("Bhavitha");
		System.out.println("Sub Class constructor 1");
	}
	Bye(int c){
		super(5.4);
		System.out.println("Sub Class constructor 2");
		
	}
	Bye(){
		this(20);
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.p);
	}
}
public class Statements2_Keywords2 {
	public static void main(String[] args) {
		System.out.println("************************************");
		Bye b1=new Bye();
		System.out.println("------------------------------------");
		System.out.println(b1.x);
		Bye b2=new Bye(10,20);
		System.out.println("------------------------------------");
		System.out.println(b2.y);
		Hi h1=new Hi();
		System.out.println("------------------------------------");
		System.out.println(h1.x);
		System.out.println("************************************");
	}

}
