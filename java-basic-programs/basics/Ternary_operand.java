package basics;
//(conditions)?True:False
public class Ternary_operand {
	static void check(int num) {
		 System.out.println(num+" is "+((num%2==0)?"Even":"Odd"));
	}
	public static void main(String[] args) {
		check(28);
		System.out.println();
		check(1);
	}
}
