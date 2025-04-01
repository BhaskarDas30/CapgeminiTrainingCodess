package ObjectClass;
import java.util.Objects;
public class Student {
	private String name;
	private double percentage;
	private int id;
	public Student(String name, double percentage, int id) {
		this.name = name;
		this.percentage = percentage;
		this.id = id;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return this.name + " - "+ this.percentage + " - " + this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		return (this.name.equals(s.name) && this.percentage==s.percentage && this.id==s.id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.percentage, this.id);
	}
}
