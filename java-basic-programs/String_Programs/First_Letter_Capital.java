package String_Programs;

public class First_Letter_Capital {

	public static void main(String[] args) {
		 String s1=" this is program";
		  
		 StringBuilder sb=new StringBuilder();
		  for(int i=0;i<s1.length();i++)
		  {
			  char ch=s1.charAt(i);
			  if(i==0 && ch>='a' && ch<='z')
			  {
				  sb.append( (char)(ch-32));				  
			  }
			  else if(ch==' ' && s1.charAt(i+1)>='a' && s1.charAt(i+1)<='z') 
			 //else if(ch==' ' && Character.isLowerCase(s1.charAt(i+1)))
			  {
				  sb.append(" "+((char)(s1.charAt(i+1)-32)));
				  i++;
			  }
			  else
			  {
				  sb.append(ch);
			  }
		  }
		  System.out.println(sb); 	 
		 

	}

}
