package LibraryManagementSystem;

public class Person {
	private String name;
	private String email;
	Person(String name, String email) {
		this.name=name;
		this.email=email;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
}
