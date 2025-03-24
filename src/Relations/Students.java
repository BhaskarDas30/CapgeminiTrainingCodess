package Relations;

public class Students {
	private String name;
	private String email;
	private Subjects subjects[];
	public Students(String name, String email, Subjects[] subjects) {
		this.subjects = subjects;
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	void display() {
		System.out.println("Your Subjects");
		for(Subjects s:subjects) {
			if(s!=null)
				System.out.println(s.getSubject());
		}
	}
	
}
