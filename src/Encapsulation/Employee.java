package Encapsulation;

public class Employee {
		String name = "Bhaskar";
		int age = 22;
		private long phone_number = 8017869636l;
		private double salary = 30000;
		public long getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(long phone_number) {
			this.phone_number = phone_number;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		} 
}
