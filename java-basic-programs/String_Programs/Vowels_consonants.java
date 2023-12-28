package String_Programs;

public class Vowels_consonants {
	public static void main(String[] args) 
	{
		String s1="Programming Class".toLowerCase();
		String s2=" ";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
		{
		 
			s2=s2+(char)(ch-32);
			
		}
		else
		{			 
			s2=s2+ch;			 
		}
		}
		 System.out.print(s2);
		 }
}
