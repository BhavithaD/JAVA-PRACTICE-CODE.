
interface add{
	double addition(double a,double b);
}
public class Lamda_Expression {
public static void main(String[] args) {
	
	add a1=(s,f)->
	 {return s+f;};
	System.out.println(a1.addition(20.0, 30.0));
	
	add a2=(s,f)-> s+f;	 
	System.out.println(a2.addition(20.01, 30.02));
}

}
