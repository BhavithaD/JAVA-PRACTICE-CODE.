package String_Programs;

public class Objectclass_methods {
public static void main(String[] args) {
	String s1=new String();
	String s2=new String("ASBJ");
	char[] arr= {'A','S','B','J'};
	String s3=new String(arr);
	System.out.println("----------------------------------------");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println("----------------------------------------");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println("----------------------------------------");
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
}
}
