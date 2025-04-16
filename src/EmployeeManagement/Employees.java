package EmployeeManagement;

import java.util.*;

public class Employees{
	static ArrayList<Employee> list_of_emp=new ArrayList<>();
	
	public static void add(Employee e) {
		list_of_emp.add(e);
		System.out.println("Employee Added Succefully");
		System.out.println();
	}
	
	public static void display() {
		for(Employee e : list_of_emp) {
			System.out.println(e);
		}
		System.out.println();
//		using iterator
//		Iterator<Employee> itr = list_of_emp.iterator();
//		while(itr.hasNext()) {
//			Employee emp=itr.next();
//			System.out.println(emp);
//		}
//		using list iterator
//		ListIterator<Employee> itr = list_of_emp.listIterator(list_of_emp.size());
//		while(itr.hasPrevious()) {
//			Employee emp=itr.previous();
//			System.out.println(emp);
//		}
	}

	public static boolean search(Employee emp) {
		// TODO Auto-generated method stub
		if(list_of_emp.contains(emp)) {
			return true;
		}
		return false;
	}

	public static boolean searchById(int id) {
		// TODO Auto-generated method stub
		for(Employee e : list_of_emp) {
			if(e.getId()==id) {
				return true;
			}
		}
		return false;
	}

	public static void remove(Employee emp) {
		// TODO Auto-generated method stub
		list_of_emp.remove(emp);
		System.out.println("Employee Removed");
		System.out.println();
	}

	public static void removeById(int id) {
		// TODO Auto-generated method stub
		Employee emp=null;
		for(Employee e : list_of_emp) {
			if(e.getId()==id) {
				emp=e;
			}
		}
		list_of_emp.remove(emp);
		System.out.println();
	}

	public static void updateById(Employee emp, int id) {
		// TODO Auto-generated method stub
		Employee old=null;
		for(Employee e : list_of_emp) {
			if(e.getId()==id) {
				old=e;
			}
		}
		old.setId(emp.getId());
		old.setName(emp.getName());
		old.setSalary(emp.getSalary());
		System.out.println("Employee details are updated");
		System.out.println();
	}
	public static void sort() {
		Collections.sort(list_of_emp);
		System.out.println("Employees are Sorted");
		System.out.println();
	}

	public static void sortBySalary() {
		// TODO Auto-generated method stub
		Collections.sort(list_of_emp, new SalaryComparator());
		System.out.println("Employees are Sorted");
		System.out.println();
	}
}
