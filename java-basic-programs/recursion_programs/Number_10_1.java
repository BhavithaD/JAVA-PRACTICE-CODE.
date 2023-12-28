package recursion_programs;

public class Number_10_1 {
	static void print(int n) {
		if(n>=1) {
			System.out.println(n);
			n--;
			print(n);
		}
		 
	 }
	public static void main(String[] args) {
		print(10);
	}
}
