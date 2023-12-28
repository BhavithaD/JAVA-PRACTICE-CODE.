package String_Programs;

//import java.util.Arrays;

public class Well_is_All {
public static void main(String[] args) {
	String s1="All is well";
	String[] arr=s1.split(" "); 
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
}
