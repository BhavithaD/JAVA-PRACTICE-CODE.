package String_Programs;

public class viceversa {
public static void main(String[] args) {
	String s1="QspidersJspiders";
	 String s2="JspidersQspiders";
	 boolean res=false;
	 if(s1.length()==s2.length()) {
		 String s3=s1+s1;//QspidersJspidrsQspidersJspidrs
		 if(s3.contains(s2))
		 {
			 res=true;
		 }
		 else {
			 res=false;
		 }
	 }
	 else {
		 res=false;
	 }
	 if(res) {
		 System.out.println("it is in Rotation");
	 }
	 else {
		 System.out.println("it is not in Rotation");
	 }
}

}
