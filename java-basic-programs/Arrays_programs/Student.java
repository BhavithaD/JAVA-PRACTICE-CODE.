package Arrays_programs;

import java.util.Arrays;

public class Student {
 int id;
 String name;
 double marks[];
public Student(int id, String name, double[] marks) {
	 
	this.id = id;
	this.name = name;
	this.marks = marks;
}
double totalmark() {
	double total=0.0;
	for(double mark:marks) {
		total +=mark;
	}
	return total;
}

double average() {
	return totalmark()/marks.length;
}

String result() {
	String res="Pass";
	for(double mark:marks) {
		if(mark<35.0)
		{
			res="Fail";
      }
	}
	return res;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
}

 
}
