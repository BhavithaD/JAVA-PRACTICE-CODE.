package String_Programs;
//substring(int beginIndex, int endIndex)
//substring(int beginIndex)
public class Sir 
{
	public static void main(String[] args) 
	{
		String s1="SIR";		 
		 
		for(int i=0;i<s1.length();i++) 
		{
			for(int j=i;j<s1.length();j++) 
			{
				String res=s1.substring(i, j+1);
				System.out.println(res);
				 
				
			}
		}
	}
}

