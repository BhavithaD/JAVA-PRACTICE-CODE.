class IKException extends Exception
{
	static void m1()
	{
		System.out.println("Error");
	}
}
public class Gj 
{
	public static void main(String[] args) throws IKException {
		try
		{
			int x = 20/10;
			if(x==1)
				System.out.println("Good");
			else
				throw new IKException();
		}
		catch(IKException e)
		{
			IKException.m1();
			e.printStackTrace();
		}
	}
}
