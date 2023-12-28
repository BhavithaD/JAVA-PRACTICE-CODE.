package String_Programs;

public class String_Builder {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("ASBJ");
	StringBuilder sb1=new StringBuilder("Bhavitha");
	StringBuilder sb2=new StringBuilder("Bhavitha");
	System.out.print(sb);// toString() Method will override
	System.out.println(sb1);//implicit toString()
	
	System.out.println(sb.hashCode());// hashCode() will not override in StringBuilder
	System.out.println(sb1.hashCode());// it returns Unique Integer Number of object Address
	
	System.out.println(sb.equals(sb));// equals(Object o1) will not override in StringBuilder
	System.out.println(sb1.equals(sb));//it Equalize the object address
	System.out.println(sb1.equals(sb1));
	System.out.println(sb2.equals(sb1));
}
}
