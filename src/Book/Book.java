package Book;

public class Book implements Comparable<Book>{
	private int id;
	private String title;
	private double price;
	public Book(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int compareTo(Book b) {
		return this.id-b.id;
	}
	public String toString() {
		return this.id+" "+this.title+" "+this.price;
	}
}
