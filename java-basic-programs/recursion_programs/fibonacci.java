package recursion_programs;

public class fibonacci {
	static int fib(int b) {
		if(b==1) 
			return 0;
		else if(b==2||b==3)
			return 1;
		else 
			return fib(b-1)+fib(b-2);
	}
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {
		int x=i;
		System.out.println(fib(x));
	}
	}

}
