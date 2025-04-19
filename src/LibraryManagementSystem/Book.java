package LibraryManagementSystem;

public class Book {
	public String title;
	public Author author;
	
	Book(String title, Author author) {
		this.title=title;
		this.author=author;
	}
	
	public String toString() {
		return "Book Title : "+this.title+" "+author.toString();
	}
}
