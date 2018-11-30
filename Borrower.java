import java.util.*;

public class Borrower implements Comparable {
	private String name;
	private LinkedList<Book> borrowedBooks;
	
	public Borrower(String name) {
		this.name = name;
		borrowedBooks = new LinkedList<Book>();
	}
}