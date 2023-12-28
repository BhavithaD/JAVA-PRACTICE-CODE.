package Arrays_programs;

public class Avg_Arr //Average value in an array
{
public static void main(String[] args) {
	int arr[]= {11,22,33,44,55,66};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("Average value of an given array--> "+sum/arr.length);
}
}
