package String_Programs;
//ch-48==>Number
//ch-32==>LowerCase
//ch+32==>UpperCase
public class NumericAlpha
{
public static void main(String[] args) 
   {
	String s1="2A3B4C";
	
    int num=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')//if(Character.isDigit(ch))
			{
				num=num*10+ch-48;
			}
			else {
				while(num>0)
				{
					System.out.print(ch);
					num--;
					 
					}
			}
			 	}
		
		 
	}
}



