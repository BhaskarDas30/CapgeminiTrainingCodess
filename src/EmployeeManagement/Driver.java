package EmployeeManagement;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Welcome--------");
		while(true) {
			System.out.println("Enter 1 to Add Employee");
			System.out.println("Enter 2 to Print All Employee");
			System.out.println("Enter 3 to Search Employee");
			System.out.println("Enter 4 to Search Employee by ID");
			System.out.println("Enter 5 to Delete Employee");
			System.out.println("Enter 6 to Delete Employee by ID");
			System.out.println("Enter 7 to Update Employee by ID");
			System.out.println("Enter 8 to Sort Employee by ID");
			System.out.println("Enter 9 to Sort Employee by Salary");
			System.out.println("Enter Your Choice ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 : {
				Employee emp=createEmployeeObject(sc);
				Employees.add(emp);
				break;
			}
			case 2 : {
				Employees.display();
				break;
			}
			case 3 : {
				System.out.println("Enter the details for the employee to search");
				Employee emp=createEmployeeObject(sc);
				boolean result=Employees.search(emp);
				if(result) {
					System.out.println("Employee is found");
				} else {
					System.out.println("Employee is not found");					
				}
				System.out.println();
				break;
			}
			case 4 : {
				System.out.println("Enter Id to be searched ");
				int id=sc.nextInt();
				boolean result=Employees.searchById(id);
				if(result) {
					System.out.println("Employee is found");
				} else {
					System.out.println("Employee is not found");					
				}
				System.out.println();
				break;
			}
			case 5 : {
				System.out.println("Enter the details for the employee to Remove");
				Employee emp=createEmployeeObject(sc);
				Employees.remove(emp);
				break;
			}
			case 6 : {
				System.out.println("Enter Id to be searched ");
				int id=sc.nextInt();
				Employees.removeById(id);
				break;
			}
			case 7 : {
				System.out.println("Enter Id to be update ");
				int id=sc.nextInt();
				boolean result=Employees.searchById(id);
				if(result) {
					Employee emp=createEmployeeObject(sc);
					Employees.updateById(emp,id);					
				} else {
					System.out.println("Employee cant be updated");
				}
				break;
			}
			case 8 : {
				Employees.sort();
				break;
			}
			case 9 : {
				Employees.sortBySalary();
				break;
			}
			default : {
				System.exit(0);
			}
			}
		}
	}

	private static Employee createEmployeeObject(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter ID, Name, Salary");
		Employee emp=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return emp;
	}
}
