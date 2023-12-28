package String_Programs;

import java.util.Arrays;

public class StringArrayReverse 
{
	public static void main(String[] args) {
		String[] arr= {"abc","def","ghi","rte","dsw"};
		String[] result=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			  StringBuilder sb=new StringBuilder();
			  sb.append(arr[i]);
			  sb.reverse();
			  result[i]=sb.toString();
			  
			//String res=arr[i];
			//String rev="";
			//for(int j=res.length()-1;j>=0;j--) {
			//rev=rev+res.charAt(j);
			//}
			//result[i]=rev;
		
			}
			System.out.println(Arrays.toString(result));
		}
}

