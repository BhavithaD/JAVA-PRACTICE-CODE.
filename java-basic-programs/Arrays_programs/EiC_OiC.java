package Arrays_programs;

public class EiC_OiC //Even Index Count _Odd Index count
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60};
		int esum=0,osum=0;
		
		for(int i=0;i<=arr.length-1;i++)  
		{
			if(i%2==0) 
			{
				esum=esum+arr[i];
				 
			}
			else if(i%2!=0) {
				osum=osum+arr[i];
			}
	}
		System.out.println(esum);
		System.out.println(osum);

}
}
