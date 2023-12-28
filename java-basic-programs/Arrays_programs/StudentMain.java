package Arrays_programs;
import java.util.Scanner;
public class StudentMain {
public static void main(String[] args) {
	Student s1=new Student(123,"Bhavitha",new double[] {100.0,200.0,300.0});
	System.out.println(s1);
	System.out.println(s1.totalmark());
	System.out.println(s1.average());
	System.out.println(s1.result());
	System.out.println("----------------------------------------------------------");
	try(Scanner sc1=new Scanner(System.in)){
	System.out.println("Enetr Student ID :: ");
	int id = sc1.nextInt();
	System.out.println("Enter Student Name :: ");
	String name=sc1.next();
	
	double[] mark=new double[3];
	for(int i=0;i<mark.length;i++) {
		System.out.println("Eneter the Subject"+(i+1)+" mark ::");
		mark[i]=sc1.nextDouble();
	}
	Student s2=new Student(id, name, mark);
	System.out.println(s2);
	System.out.println(s2.totalmark());
	System.out.println(s2.average());
	System.out.println(s2.result());
	}
}
}
