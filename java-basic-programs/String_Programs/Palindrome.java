package String_Programs;
//import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	
	String s1=" Amma  ".toLowerCase().trim();
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
		
	}
	if(s1.equals(s2)) {
		System.out.println("It is Palindrome");
	}else {
		System.out.println("It is not a Palindrom");
	}
	System.out.println("----=======----=======----");
	System.out.println("With reverse() method of StringBuffer class");
	String s3="Mom".toLowerCase();
	StringBuffer sb=new StringBuffer(s3);
	sb.reverse();
	String s4=new String(sb);
	if(s3.equals(s4)) {
		System.out.println("It is Palindrome");
	}else {
		System.out.println("It is not a Palindrom");
		}
	
	//System.out.println("enter string to Reverse==> ");
	//System.out.println((new StringBuffer(new Scanner(System.in).next())).reverse());
	
}
}
