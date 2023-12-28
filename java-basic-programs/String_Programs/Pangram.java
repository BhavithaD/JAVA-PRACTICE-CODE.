package String_Programs;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		String s1=" The Quick brown fox jumps over the lazy dog ".toLowerCase();
		
		 char arr[]=new char[26];
		 for(int i=0;i<s1.length();i++)
		 {
			 char ch=s1.charAt(i);
			 if(ch>='a' && ch<='z') //()
			 {
				 int index=ch-97;
				 arr[index]=ch;
				 //System.out.println(Arrays.toString(arr));
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 boolean res=true;
		 for(char ch:arr) {
			 if(ch=='\0') {
				 res=false;
				 break;
			 }
			 else {
				 res=true;
			 }
		 }
			 if(res) {
			 System.out.println(" Pangram ");
		 }
		 else
		 {
			 System.out.println(" not Pangram ");
		 }
		 }
		 
		 //System.out.println(ch1);
		 
		 

	}


