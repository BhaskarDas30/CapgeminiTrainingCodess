package Book;

import java.util.TreeSet;

public class BookDriver {
	public static void main(String[] args) {
		TreeSet<Book> set=new TreeSet<>(new PriceComparator());
		set.add(new Book(1, "Java", 500));
		set.add(new Book(3, "HTML", 700));
		set.add(new Book(2, "Python", 300));
		System.out.println(set);
	}
}
