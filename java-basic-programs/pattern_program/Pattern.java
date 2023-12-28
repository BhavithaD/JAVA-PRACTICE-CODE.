package pattern_program;

public class Pattern {
	public static void main(String[] args) 
	{
		char k='A';
		 for(char i='A';i<='E';i++)
		{
			  
			 for(char s='E';s>'A';s--)
			{
				 System.out.print(" ");
			}
			
			for(char j='A';j<=k;j++)
			{
				System.out.print(j+" ");
			} 
			for(char j=(char)(k-'A');j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			k++;
		}
	}
}

/*
A 
A B 
A B C 
A B C D 
A B C D E
*/