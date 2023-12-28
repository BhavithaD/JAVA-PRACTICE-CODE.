package String_Programs;

public class Consonants_Vowels 
{
	public static void main(String[] args) 
	{
		String s1="Programming Class".toLowerCase();
		int Vowels=0;
		int Consonants=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')	
		{
			Vowels++;
		}
		else if(ch!=' ')
		{
			Consonants++;
		}
		}
		System.out.println("No of Vowlws in |"+s1+"| is "+Vowels);
		System.out.println("No of Consonants in |"+s1+"| is "+Consonants);
	}
  
}
