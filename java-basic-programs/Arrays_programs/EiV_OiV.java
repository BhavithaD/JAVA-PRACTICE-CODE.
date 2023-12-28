package Arrays_programs;

public class EiV_OiV//even index value _Odd index value
{
public static void main(String[] args)  
	{
	int arr[]= {11,22,33,44,55,66};
		for(int i=0;i<=arr.length-1;i++)  
		{
			if(i%2==0) 
			{
				
				System.out.println(arr[i]);
			}
			 
//			else if(i%2!=0) 
//			{
//				System.out.println(arr[i]);
//			}
		}
	}
}
