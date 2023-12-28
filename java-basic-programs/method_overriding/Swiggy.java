package method_overriding;
class Order
{
	void payment() 
	{
		System.out.println("Pay by credit card");
	}
}
class Order1 extends Order
{
	void payment() 
	{
		System.out.println("pay by UPI");
	}
}
class Order2 extends Order1
{
	void payment() 
	{
		System.out.println("pay as Cash");
	}
}
public class Swiggy {
	public static void main(String[] args) {
		Order o=new Order2();//upcasting
		 o.payment();
	} 
}
