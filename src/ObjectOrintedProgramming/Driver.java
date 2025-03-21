package ObjectOrintedProgramming;
public class Driver {
	public static void main(String[] args) {
		EmployeeCO emp1=new EmployeeCO();
		EmployeeCO emp2=new EmployeeCO("Bhaskar");
		EmployeeCO emp3=new EmployeeCO("Somrik", 60000);
		EmployeeCO emp4=new EmployeeCO("Deeptanghsu", 40000, "9823651100");
		System.out.println(emp2.name);
		System.out.println(emp3.name+" "+emp3.salary);
		System.out.println(emp4.name+" "+emp4.salary+" "+emp4.phno);
	}
}
