package String_Programs;

public class SCp_SNCp //String constant pool and String non constant pool in Heap Area
{
public static void main(String[] args)
{
	String s1="Bhavitha";
	String s2="Bhavitha";//String constant pool storing string literals
	
	String s3=new String("Bhavitha");//String non constant pool-->[new] operator is used 
	String s4=new String("Bhavitha");
	
	System.out.println(s1==s2);
	System.out.println(s3==s4);//
	
	System.out.println(s1.equals(s4));
	System.out.println(s3.equals(s4));

	
	
}
}
