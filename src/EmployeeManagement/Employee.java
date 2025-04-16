package EmployeeManagement;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee [ ID : "+id+" | Name : "+name+" | Salary : "+salary+" ]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
}
