 
import java.util.function.*;
public class predicate {
public static void main(String[] args) {
	Predicate<Integer> p1=(a)-> a>0;
	System.out.println(p1.test(10));
     
	Consumer<Integer>  c1=(e)->System.out.println(e*10+10);
	c1.accept(10);
	
	String s1="bhavitha";
	int l=s1.length();
	System.out.println(l);
	Predicate<Integer> p2=(w) -> w>0;
	System.out.println(p2.test(l));
	
	Predicate<String> p3=(n)->n.length()>0;
	System.out.println(p3.test("Qspiders"));
	
	Consumer<Integer>  c2=(e)->System.out.println(e*e);
	c2.accept(2);
	
	Consumer<Integer>  c3=(e)->System.out.println(e*e*e);
	c3.accept(3);
	
	Function<Integer, Integer> f1=(a) -> a+a;
	System.out.println(f1.apply(20));
	
	Function<Integer, String> f2=(a) -> a+"bh";
	System.out.println(f2.apply(20));
	
	Function<String, String> f3=(a) -> a+"tha";
	System.out.println(f3.apply("bhavi"));
 
	double d=1/2; // 1/2--> 0.5 remove prediction it gives 0.0
	float f=1/2f; //0.5
	System.out.println(d);
	System.out.println(f);

	
	
	
	
	
}
}
