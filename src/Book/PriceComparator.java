package Book;

import java.util.*;

public class PriceComparator implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		return Double.compare(b1.getPrice(), b2.getPrice());
	}
}
