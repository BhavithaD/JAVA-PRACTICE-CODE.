package core_java;
import java.util.Random;
public class Math_Functions {
	static String getOTP() {
	    String otp="";
	    otp=otp+ (int)(Math.random()*10)
	    		+(int)(Math.random()*10)
	    		+(int)(Math.random()*10)
	    		+(int)(Math.random()*10);
	    return otp;
	}
	public static void main(String args[]) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(4, 1));
		System.out.println(Math.floor(4.5));
		System.out.println(Math.ceil(4.5));
		System.out.println(Math.round(4.5));
		System.out.println(Math.abs(-5));
		System.out.println(Math.log10(3.5));
		System.out.println((int)Math.random()*100);
		System.out.println("*******************************");
		for(int i=40;i<=3000;i++) {
		System.out.println(getOTP());}
		System.out.println("*******************************");
		Random r1=new Random();
		System.out.println(Math.abs(r1.nextInt()));
		
		
	}

}
