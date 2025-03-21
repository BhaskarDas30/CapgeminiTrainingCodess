package ObjectOrintedProgramming;
public class Employee {
	String name;
	int salary;
	String phnumber;
	Employee(String name, int salary, String phnumber) {
		this.name=name;
		this.salary=salary;
		this.phnumber=phnumber;
	}
	public void display() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(phnumber);
	}
}
