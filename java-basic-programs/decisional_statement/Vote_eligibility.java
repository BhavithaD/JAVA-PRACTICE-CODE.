package decisional_statement;

public class Vote_eligibility 
{
public static void main(String[] args) 
	{
	    int age=18;
		if(age>=18)
		{
			System.out.println("Eligible for votaing");
		}
		else if(age<18 && age>0)
		{
			System.out.println("Not Eligible for votaing");
		}
		else
		{
			System.out.println("Not possible");
		}
	}
}
