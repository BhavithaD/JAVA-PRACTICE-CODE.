class Abc implements Runnable{
	@Override
	public void run() {
		System.out.println("I am Run");
	}
}
public class Annonymnous_Lamda {
 public static void main(String[] args) {
	 //Annonymnous class
	Runnable r1=new Runnable()
			{
		public void run() {
			System.out.println("I am Annonymnous run()");
			
		}
			};
			Thread t1=new Thread(r1);
			 
			t1.start();
			
			//Lamda Expression way1
			Runnable r2=()->
			System.out.println("I am Lamda Expresstion run()");
			
			Thread t2=new Thread(r2);
			t2.start();
			
			//Lamda Expression way2
			Thread t3=new Thread(()->System.out.println("Lamda 2"));
			t3.start();
}
 
}
