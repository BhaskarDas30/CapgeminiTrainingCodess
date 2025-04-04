package Comparator;
import java.util.*;
public class SortById implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.id - b2.id; 
	}
}
