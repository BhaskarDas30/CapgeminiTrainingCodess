package LibraryManagementSystem;

public class Librarian extends Person{
	private int employeeId;
	public Librarian(String name, String email, int employeeId) {
		super(name,email);
		this.employeeId=employeeId;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
}
