package String_Programs;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram 
{
public static void main(String[] args) 
{
	String s1="care".toLowerCase();
	String s2="Race".toLowerCase();
	
	if(s1.length()==s2.length()) {
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		//System.out.println(arr1);
		//System.out.println(arr2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println((Arrays.toString(arr1)));//[a, a, d, m, m]
		System.out.println((Arrays.toString(arr2)));//[a, a, d, m, m]
		boolean res=Arrays.equals(arr1,arr2);
		System.out.println(Arrays.equals(arr1,arr2));//true
		
		if(res)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("not Anagram");
		}
		
		
	}
	else {
		System.out.println("not Anagram");
	}
}
}
