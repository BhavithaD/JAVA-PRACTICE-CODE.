package interface_examples;
interface Operations1
{
	double pi=3.14;
	double add(int a,int b);
	double sub(int a,int b);
}
interface Operations2 extends Operations1
{
	double mul(int a,int b);
	double div(int a,int b);
}
abstract class  A implements Operations2,Operations1
{
	
}
class B extends A
{
	public double add(int a,int b) {
		return a+b;
	}
	public double sub(int a,int b) {
		return a-b;
	}
	public double mul(int a,int b) {
		return a*b;
	}
	public double div(int a,int b) {
		return a/b;
	}
}
public class Calculator 
{
	public static void main(String[] args) {
		B b=new B();
		// System.out.println(b.pi);
		System.out.println("Addition of two numbers --> "+b.add(10, 20));
		System.out.println("Substraction of two numbers -->"+b.sub(56, 40));
		System.out.println(b.mul(34, 5));
		System.out.println(b.div(52, 7));
	}

}
