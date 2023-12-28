package recursion_programs;

public class Numbers_1_10 {
static void print(int n) {
	if(n<=10) {
		System.out.println(n);
		n++;
		print(n);
	}
	 
 }
public static void main(String[] args) {
	print(1);
}
}
