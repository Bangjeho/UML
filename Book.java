import java.util.*;

public class Book implements Comparable{
	private String title;
	private String autor;
	private int catalogNumber;
	
	private Borrower borrower;
	
	public Book(String title, String autor, int catalogNumber) {
		this.title = title;
		this.autor = autor;
		this.catalogNumber = catalogNumber;
	}
	
	public void display() {
		System.out.println(title);
		System.out.println(autor);
		System.out.println(catalogNumber);
	}
	
	public Borrower getBorrower(){
		return borrower;
	}
}