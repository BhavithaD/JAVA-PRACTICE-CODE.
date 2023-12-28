package String_Programs;

public class ConvertCount {
public static void main(String[] args) {
	 
	String s1="ASBJb@vi79";
	String s2="";
	
	int UpperCaseCount=0;
	int LowerCaseCount=0;
	int NumbersCount=0;
	int SpeacialCharCount=0;
	
	for(int i=0;i<s1.length();i++) 
	{
		char ch=s1.charAt(i);
		if(ch>='A' && ch<='Z') 
		{
			System.out.println((char)(ch+32));
			s2=s2+(char)(ch+32);
			UpperCaseCount++;
			}
		else if(ch>='a' && ch<='z') {
			System.out.println((char)(ch-32));
			s2=s2+(char)(ch-32);
			LowerCaseCount++;
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch);
			s2=s2+ch;
			NumbersCount++;
		}
		else
		{
			
		System.out.println(ch);
		//s2=s2+ch;
		SpeacialCharCount++;
		}
	
	}

System.out.println();
	
System.out.println("without any speacial characters--> "+s2);
System.out.println("UpperCaseCount--> "+UpperCaseCount);
System.out.println("LowerCaseCount--> "+LowerCaseCount++);
System.out.println("NumbersCount--> "+NumbersCount);
System.out.println("SpeacialCharCount --> "+SpeacialCharCount);
}
}
