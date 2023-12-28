package Methods;

public class Even_Odd {
	static void check(int num) {
		if(num%2==0) 
			System.out.println(num+" is even number");
		else
			System.out.println(num+" is odd number");
	}
	public static void main(String[] args) {
		check(28);
		System.out.println();
		check(19);
	}

}
