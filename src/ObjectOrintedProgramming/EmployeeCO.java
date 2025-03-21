package ObjectOrintedProgramming;
public class EmployeeCO {
	String name;
	int salary;
	String phno;
	EmployeeCO() {	
		System.out.println("Default Constructor called");
	}
	EmployeeCO(String name) {
		this.name=name;
	}
	EmployeeCO(String name, int salary) {
		this(name);
		this.salary=salary;
	}
	EmployeeCO(String name, int salary, String phno) {
		this(name, salary);
		this.phno=phno;
	}	
}
