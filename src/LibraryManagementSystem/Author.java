package LibraryManagementSystem;

public class Author {
	public String name;
	public int age;
	
	public Author(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Author : "+this.name+" ; Age : "+this.age;
	}
	
}
