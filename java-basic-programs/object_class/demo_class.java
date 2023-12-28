package object_class;
import asbj_app.student;
public class demo_class {
     public static void main(String[] args) {
		student std1=new student(121,"as",84);
		student std2=new student(122,"bj",85);
		student std3=new student(121,"as",84);
		System.out.println("----Object class non static methods----");
	    System.out.println();
		System.out.println();
		System.out.println("----toString()----");
		String s1=std1.toString();
		System.out.println(s1);
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());
		
		
		System.out.println(std1);
		System.out.println(new student(123,"bj",86));
		System.out.println();
		
		 System.out.println("----hashCode()----");
		int h1=std1.hashCode();
		System.out.println("std1 = "+h1);
		System.out.println("std1 = "+std1.hashCode());
		System.out.println("std2 = "+std2.hashCode());
		System.out.println("std3 = "+std3.hashCode());
		
		System.out.println();
		System.out.println("----equals()----");
		boolean b1=std1.equals(std3);
		System.out.println("std1.equals(std3)--> "+b1);
		System.out.println("std1.equals(std1)--> "+std1.equals(std1));
		System.out.println("std2.equals(std2)--> "+std2.equals(std2));
		System.out.println("std3.equals(std3)--> "+std3.equals(std3));
		System.out.println("std2.equals(std1)--> "+std2.equals(std1));
		
		
		System.out.println();
		System.out.println("clone()");
		System.out.println(std1.getStudentColne());
		System.out.println(std3.getStudentColne());
		
		System.out.println();
		System.out.println("----finalise()----");
		std1=null;
		System.gc();
		System.out.println();
		System.out.println();
		System.out.println("----class()----");
		Class<? extends student> c=std3.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getClass());
		System.out.println(c.getInterfaces());
		System.out.println(c.getAnnotatedInterfaces());
		
		
		
		
	}
}
