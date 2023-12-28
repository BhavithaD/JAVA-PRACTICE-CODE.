package encapsulation;

public class java_beans {
	public static void main(String[] args) {
		Employee e=new Employee();
		//passing values to the private data member of employee class
		e.setid(9);
		e.setname("Bhavi");
		e.setsal(4000.56);
		//displaying values of the private data member of employee class
		System.out.println("**********************************************");
		System.out.println("Employee ID -- "+e.getid());
		System.out.println("Employee Name -- "+e.getname());
		System.out.println("Employee Salary -- "+e.getsal());
		System.out.println("**********************************************");
		
	}
}
