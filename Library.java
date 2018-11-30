import java.util.*;

public class Library {
	private String name;
	private TreeSet<Book> registeredBooks;
	private HashSet<Borrower> registeredBookwers;
	
	public Library(String name) {
		this.name = name;
		registeredBooks = new TreeSet<Book>(); //
		registeredBookwers = new HashSet<Borrower>();
	}
	
	public void registerOneBorrower(String name) {
		Borrower b = new Borrower(name);
		registeredBookwers.add(b);
	}
	public void registeredOneBook(String title, String autor, int catalogueNumber) {
		Book b = new Book(title, autor, catalogueNumber);
		registeredBooks.add(b);
	}
	public void displayBooksForLoan() {
		Iterator iter = registeredBooks.iterator();
		while(iter.hasNext() == true) {
			Book book = (Book) iter.next();
			if(book.getBorrower() == null)
				book.display();
				
		}
		public void lendOneBook(String name, int catalogueNumber) {
						
		}
		public void returnOneBook(int catalogueNumber) {
			
		}
	}
}
