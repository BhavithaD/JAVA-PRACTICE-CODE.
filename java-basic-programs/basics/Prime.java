package basics;

public class Prime {
public static void main(String[] args) {
	for(int k=1;k<=100;k++) {
	int n=k;
	int c=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			c++;
		}
	}
	if(c==2)
	{
		System.out.println(k+" prime");
	}
	 
}
}
}
