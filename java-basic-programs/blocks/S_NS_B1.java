package blocks;

class blocks{
	static int a=10;
	int b=20;
	
	static{
		a=100;
		System.out.println("blocks class static block-1");
		}
	static{
		a=1000;
		System.out.println("blocks class static block-2");
		}
	
		{
		b=200;
		System.out.println("blocks class non static block-1");
		}
		{
		b=2000;
		System.out.println("blocks class non static block-2");
		}
}

public class S_NS_B1 {
	static{
		System.out.println("S_NS_B1 static block");
	}
	{
		System.out.println("S_NS_B1 non static block");
	}
	int x=10;
	public static void main(String[] args) {
		System.out.println(blocks.a);
		System.out.println(blocks.a);
		
		blocks b1=new blocks();
		System.out.println(b1.b);
		blocks b2=new blocks();
		System.out.println(b2.b);
		
		S_NS_B1 mc=new S_NS_B1();//by creating executes S_NS_B1 non static block 
		//System.out.println("by creating executes S_NS_B1 non static block ");
	System.out.println(mc.x);
	}
}
