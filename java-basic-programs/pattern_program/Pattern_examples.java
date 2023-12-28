package pattern_program;

public class Pattern_examples {

	
		public static void main(String[] args) 
		{
			 for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					 
						System.out.print("* ");
					 }
		System.out.println();
	}
	System.out.println("----------------------------------------------");
	for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					 
						System.out.print("* ");
					 }
		System.out.println();
	}
	System.out.println("----------------------------------------------");
	for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--)
				{
					 
						System.out.print("* ");
					 }
		System.out.println();
	}
	System.out.println("----------------------------------------------");
	for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					 
						System.out.print(i+" ");
					 }
		System.out.println();
	}
	System.out.println("----------------------------------------------");
	for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					 
						System.out.print(j+" ");
					 }
		System.out.println();
	}
	System.out.println("----------------FLOYD'S TRIANGLE----------------");
	int k=1;
	for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					 
						System.out.print(k+" ");
						k++;
					 }
		System.out.println();
	}

		}
	
}
/*
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
----------------------------------------------
* 
* * 
* * * 
* * * * 
* * * * * 
----------------------------------------------
* * * * * 
* * * * 
* * * 
* * 
* 
----------------------------------------------
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
----------------------------------------------
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
----------------FLOYD'S TRIANGLE----------------
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */
