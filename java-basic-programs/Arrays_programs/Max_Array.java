package Arrays_programs;

public class Max_Array {
public static void main(String[] args) {
	int [] arr= {9,6,7,6,8,3};
	int fmax=0;
	int smax=0;
	for(int x:arr) {
		if(x>fmax) {
			smax=fmax;
			fmax=x;
		}
		else if(x>smax) {
			smax=x;
		}
	}
	System.out.println("First maximum --> "+fmax);
	System.out.println("Second maximum --> "+smax);
	
	System.out.println("----------------------------------------------");
	//int [] arr1= {5,6,7,6,8,3};
	int fmin=fmax;
	int smin=smax;
	for(int x:arr) {
		if(x<fmin) {
			smin=fmin;
			fmin=x;
		}
		else if(x<smin) {
			smin=x;
		}
	}
	System.out.println("First minimum --> "+fmin);
	System.out.println("Second minimum --> "+smin);
}
}
