package String_Programs;

public class Parsing {
	public static void main(String[] args) {
		String s1="456";
		//int num=Integer.parseInt(s1);
		//System.out.println(num);
		int n=0;
		for(int i=0;i<s1.length();i++) {
			int ch=s1.charAt(i);
			System.out.println(ch);
			n=n*10+ch-48;
			
		}
		System.out.println(n);
	}

}
