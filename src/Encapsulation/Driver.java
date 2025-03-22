package Encapsulation;

public class Driver {
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name);
		System.out.println(e.getPhone_number());
		System.out.println(e.getSalary());
		e.setSalary(40000);
		System.out.println(e.getSalary());
	}
}
