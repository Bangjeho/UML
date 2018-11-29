//�й� �̸�: 2017315018 ����ȣ, 2017315015 ������, 2017315054 �߿� ����Ű
//���α׷� ����: ������ �缭�� �����ִ� ���α׷�

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Library {
	private String name;
	private TreeSet<Book> registeredBooks;
	private HashSet<Borrower> registeredBorrowers;
	
	public Library(String name){
		this.name = name;
		registeredBooks = new TreeSet<Book>();
		registeredBorrowers = new HashSet<Borrower>();
	}
		
		public void registerOneBorrower(String name){
			Borrower borrower = new Borrower(name);
			registeredBorrowers.add(borrower);
		}
		public void registerOneBook(String title, String author, int catalogNumber){
			Book book = new Book(title,author,catalogNumber);
			registeredBooks.add(book);
		}
		public void displayBooksForLoan(){
			Iterator iterator = registeredBooks.iterator();
			while(iterator.hasNext() == true){
				Book book = (Book)iterator.next();
				if(book.getBorrower() == null){
					book.display();
				}
			}
		}
		public void displayBoosOnLoan(){
			Iterator iterator = registeredBorrowers.iterator();
			while(iterator.hasNext() == true){
				Book book = (Book)iterator.next();
				if(book.getBorrower() != null){
					book.display();
				}
			}
		}
		public void LendOneBook(String name, int catalogNumber){
			
			
			
		}
		public void ReturnOneBook(int catalogNumber){
			
		}
	}
	

