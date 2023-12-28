package String_Programs;

public class _1020304050 
{
	public static void main(String[] args) 
	{
		String s1="12345";
		String res="";
		  
		for(int i=0;i<s1.length();i++) {
			res=res+s1.charAt(i)+'0';
		}
		System.out.println(res);
	}
}
