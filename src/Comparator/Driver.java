package Comparator;
import java.util.Arrays;
public class Driver {
	public static void main(String[] args) {	
		Book books[] = {
				new Book(1, "Elegantly West", 100),
				new Book(3, "Hate Burns", 500),
				new Book(2, "Start Again", 700),
				new Book(4, "The Only End", 300)
		};
		System.out.println("------------Sort By ID----------");
		SortById id = new SortById();
		Arrays.sort(books, id);
		for(Book b : books) {
			System.out.println(b);
		}
		System.out.println("------------Sort By Title----------");
		SortByTitle title = new SortByTitle();
		Arrays.sort(books, title);
		for(Book b : books) {
			System.out.println(b);
		}
		System.out.println("------------Sort By Price----------");
		SortByPrice price = new SortByPrice();
		Arrays.sort(books, price);
		for(Book b : books) {
			System.out.println(b);
		}
	}
}
