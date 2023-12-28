package encapsulation;
//java_beans(refer java_beans class)
public class Employee {
	
 private int id; //private data member
 private String name; //private data member
 private double sal; //private data member
 
  public Employee()//public default constructor
  {
	  
  }
  // below methods are getters and setters methods to access private data member anywhere

public int getid() {
	return id;
}

public void setid(int id) {
	this.id = id;
}

public String getname() {
	return name;
}

public void setname(String name) {
	this.name = name;
}

public double getsal() {
	return sal;
}

public void setsal(double sal) {
	this.sal = sal;
}
  
 
//no other methods
}
      