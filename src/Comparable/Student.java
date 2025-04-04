package Comparable;

public class Student implements Comparable{
	String name;
	int rollno;
	double percentage;
	public Student(String name, int rollno, double percentage) {
		this.name = name;
		this.rollno = rollno;
		this.percentage = percentage;
	}
	public String toString() {
		return name+"\t"+rollno+"\t"+percentage;
	}
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
//		if(this.rollno > s.rollno)
//			return 1;
//		else if(this.rollno < s.rollno)
//			return -1;
//		else
//			return 0;
		
//		return this.rollno - s.rollno; 
//		
//		return Double.compare(s.percentage, this.percentage);
		
		return this.name.compareTo(s.name);
		
	}
}
