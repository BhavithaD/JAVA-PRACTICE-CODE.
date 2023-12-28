package Arrays_programs;

public class Cross_Printing {
public static void main(String[] args) {
	String s1="Program";
	char[] ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++) {
		for(int j=0;j<ch.length;j++) {
			if(i==j || i+j ==ch.length-1) {
				System.out.print(ch[i]+" ");}
				else {
					System.out.print(" ");
				}
				
			}
		System.out.println();
		}
	}
}

