package realtime_examples;
import java.lang.Math;
public class OTP {
	static String getOTP() {
	    String otp="";
	    otp=otp+ (int)(Math.random()*10)
	    		+(int)(Math.random()*10)
	    		+(int)(Math.random()*10)
	    		+(int)(Math.random()*10);
	    return otp;
	}
	public static void main (String args[]) {
		System.out.println(getOTP());
	}
}
