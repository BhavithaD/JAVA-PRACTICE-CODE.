package asbj_app;

public class student implements Cloneable
{
int id;
String name;
double perc;
public student(int id, String name, double perc) //constructor
{
	 
	this.id = id;
	this.name = name;
	this.perc = perc;
}
public String  toString() //Override toString();
{
	return "studentid="+id+
			"\n studentname="+name+
			"\n studentpercentage = "+perc+"";
}
public int hashCode() //Override hashCode();
{
	return (int)perc;
}
public boolean equals(Object o1) //Override equals(Object o1)
{
	if(this.hashCode()==o1.hashCode()) {
		return true;
	}
	else
	{
		return false;
	}
	
}
public student getStudentColne() //to clone the Student details
{
	student ref=null;
	try {
		ref=(student)this.clone();
	}
	catch(CloneNotSupportedException e) 
	{
		e.printStackTrace();
	}
	return ref;
}
public void finalize() //static System.gc() method internally calling  non-static finalise() method 
{
	System.out.println("Explicitly  deleted by GC");
}

}
