package Reflection;

public class Person {
	private String name;
	private int age;
	
	private Person() {
		System.out.println("no arg cons");
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getDetails() {
		return this.name+"\t"+this.age;
	}
	private void task(String task) {
		System.out.println("Doing Task : "+task);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
