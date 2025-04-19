package SetInterface;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double percentage;
	public Student(int id, String name, double percentage) {
		this.setId(id);
		this.setName(name);
		this.setPercentage(percentage);
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.percentage;
	}
	public int hashCode() {
		return Objects.hash(id,name,percentage);
	}
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return (this.id==s.id && this.name.equals(s.name) && this.percentage==s.percentage);
	}
}
