package pattern_program;

public class Pyramid_pattern {
	 
		public static void main(String[] args) 
		{
			int k=1;
			 for(int i=1;i<=5;i++)
			{
				  
				 for(int s=5;s>i;s--)
				{
					 System.out.print("  ");
				}
				
				for(int j=1;j<=k;j++)
				{
					System.out.print(j+" ");
				} 
				for(int j=k-1;j>=1;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
				k++;
			}
			System.out.println("                                          ");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("                                          ");
			int x=5;
			 for(int i=1;i<=5;i++)
			{			  
				 for(int s=1;s<i;s++)
				{
					 System.out.print("  ");
				}
				
				for(int j=1;j<=x;j++)
				{
					System.out.print(j+" ");
				} 
				for(int j=x-1;j>=1;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
				x--;
			}
		
			
		}
	

}


/*
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
                                          
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
                                          
1 2 3 4 5 4 3 2 1 
  1 2 3 4 3 2 1 
    1 2 3 2 1 
      1 2 1 
        1 
*/

