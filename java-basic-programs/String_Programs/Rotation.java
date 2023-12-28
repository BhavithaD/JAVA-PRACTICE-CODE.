package String_Programs;

public class Rotation {

	public static void main(String[] args) {
		String s1="IndVsPak";
		 String s2="PakIndVs";
		 boolean res= Rotate(s1,s2);
		 if(res) {
			 System.out.println("it is in Rotation");
		 }
		 else {
			 System.out.println("it is not in Rotation");
		 }

	}
	private static boolean Rotate(String s1,String s2) {
		//boolean res=false;
		String s3="";
		 if(s1.length()==s2.length()) {
			  s3=s1+s1;
	}
		 return s3.contains(s2);

}
}
