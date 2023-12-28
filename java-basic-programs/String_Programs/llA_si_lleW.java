package String_Programs;

public class llA_si_lleW 
{
public static void main(String[] args) 
{
	String s1="All is Well";
	String[] arr=s1.split(" ");
	String result="";
	for(int i=0;i<arr.length;i++)
	{
		String word=arr[i];
		String rev="";
		for(int j=word.length()-1;j>=0;j--) 
		{
			rev=rev+word.charAt(j);
		}
		result=result+rev+" ";
		
	}
	System.out.println(result);
	
 }
}
// o/p==>llA si lleW 
