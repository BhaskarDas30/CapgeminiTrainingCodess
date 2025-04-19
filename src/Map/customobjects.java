package Map;

import java.util.*;

public class customobjects {
	public static void main(String[] args) {
		Map<Integer, Book> map=new TreeMap<>();
		Book book=new Book("Harry Potter", 10000);
		map.put(1, book);
		System.out.println(map);
	}
	
}
class Book {
	String name;
	double price;
	Book(String name, double price) {
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return "["+this.name+" "+this.price+"]";
	}
}