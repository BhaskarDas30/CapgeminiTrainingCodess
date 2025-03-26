package Inheritance;

public class Student extends Person {
	private int studentid;
	Student() {}
	public Student(int studentid, String name, int age) {
		super(name, age);
		this.studentid = studentid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	void displayDetails() {
		System.out.println(this.studentid);
//		System.out.println(super.getName());
//		System.out.println(super.getAge());
		this.displayParentDetails();
	}
}
