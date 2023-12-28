package Arrays_programs;

public class TwoDimentionalArray {
public static void main(String[] args) 
{
	//int[][] arr= {{4,3,8},{6,2,1},{9,5,7}};
	//int[][] arr=new int[3][3];
	//int[][] arr=new int[][] {{4,3,8},{6,2,1},{9,5,7}};
	//int[][] arr=new int[5][8];
	
	//jagged array
	int[][] arr={{4,3,8,11},{9,5,7,32,45,21},{6,2,12,41}};
	System.out.println(arr.length);
	System.out.println(arr[1].length);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}	
}
}
