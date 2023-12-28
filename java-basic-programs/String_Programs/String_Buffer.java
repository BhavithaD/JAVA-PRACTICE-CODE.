package String_Programs;

public class String_Buffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("ASBJ");
	StringBuffer sb1=new StringBuffer("Bhavitha");
	
	System.out.print(sb);// toString() Method will override
	System.out.println(sb1);//implicit toString()
	
	System.out.println(sb.hashCode());// hashCode() will not override in StringBuilder
	System.out.println(sb1.hashCode());// it returns Unique Integer Number of object Address
	
	System.out.println(sb.equals(sb));// equals(Object o1) will not override in StringBuilder
	System.out.println(sb1.equals(sb));//it Equalize the object address
	System.out.println(sb1.equals(sb1));
	
}
}
