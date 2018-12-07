//학번 이름: 2017315018 방제호, 2017315015 박진영, 2017315054 야오 유우키
//프로그램 내용: 도서관 사서를 도와주는 프로그램
//제출일 : 2018.12.07

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class Library{
	
	private String name;
	private HashSet<Borrower> registeredBorrowers = new HashSet<>();
	private HashSet<Book> registeredBooks = new HashSet<>();
	private HashMap<Integer,String> loansystem = new HashMap<>();
	public Library(String name) {
		this.name = name;
	}
	
	public void registerOneBorrower(String name) {
		Borrower borrower = new Borrower(name);
		
		boolean isnew = true;
		Iterator<Borrower> iterator = registeredBorrowers.iterator();
		while (iterator.hasNext()) 
		{
			if (iterator.next().getName().equals(borrower.getName())) 
			{
				isnew = false;
				break;
			}
		}
		if (isnew){
			registeredBorrowers.add(borrower);
			System.out.println("success!!");
		} 
		else {
			System.out.println("overlap.. failㅠㅠ..");
		}
	}
		
		public void registerOneBook(String title, String author, int catalogNumber){
			Book book = new Book(title,author,catalogNumber);
			boolean isnew = true;
			Iterator<Book> iterator = registeredBooks.iterator();
			while (iterator.hasNext())
			{
				if (iterator.next().getCatalogNumber() == book.getCatalogNumber())
				{
					isnew = false;
					break;
				}
			}
			if (isnew == true){
				registeredBooks.add(book);
				System.out.println("success!!");
			}
			else
				System.out.println("overlap.. failㅠㅠ..");
		}
		public void displayBooksForLoan(){
			Iterator<Book> iterator = registeredBooks.iterator();
			while(iterator.hasNext()){
				Book book = iterator.next();
				if(loansystem.containsKey(book.getCatalogNumber()) == false )
				{
					book.display();
				}
				else
					System.out.println("there a no books available");
			}
		}
		public void displayBooksOnLoan(){
			Iterator<Book>iterator = registeredBooks.iterator();
			while(iterator.hasNext() == true){
				Book book = iterator.next();
				if(loansystem.containsKey(book.getCatalogNumber()) == true){
					book.display();
				}
				else
					System.out.println("there a no books Onloan");
			}
		}
		public void LendOneBook(String name, int catalogNumber) throws NullPointerException{
			Iterator<Borrower> iterator = registeredBorrowers.iterator();
			Borrower br = null;
			Book bk = null;
			while(iterator.hasNext()){
				Borrower brw = iterator.next();
				if(brw.getName().equals(name)){
					br = brw;
				}
			}
			if(br == null){
				System.out.println("Not a registered borrower.");
			}
			
			Iterator<Book> iterator2 = registeredBooks.iterator();
			while(iterator2.hasNext()){
				Book bok = iterator2.next();
				if(bok.getCatalogNumber() == catalogNumber){
					bk = bok;
				}
			}
			if(bk ==null){
				System.out.println("Not a registered book.");
				return;
			}
			if(loansystem.containsKey(bk.getCatalogNumber())){
				System.out.println("book already borrowed.");
				return;
			}
			else
				loansystem.put(bk.getCatalogNumber(), br.getName());
				System.out.println("success!!.");
				}
		public void ReturnOneBook(String name,int catalogNumber){
			Iterator<Borrower> iterator = registeredBorrowers.iterator();
			Borrower br = null;
			Book bk = null;
			while(iterator.hasNext()){
				Borrower brw = iterator.next();
				if(brw.getName().equals(name)){
					br = brw;
					
				}
			}
			if(br == null){
				System.out.println("Not a registered borrower.");
			}
			
			Iterator<Book> iterator2 = registeredBooks.iterator();
			while(iterator2.hasNext()){
				Book bok = iterator2.next();
				if(bok.getCatalogNumber() == catalogNumber){
					bk = bok;
				}
			}
			if(bk == null){
					System.out.println("Not a registered book.");
					return;
			}
			if(loansystem.containsKey(bk.getCatalogNumber())){
				loansystem.remove(bk.getCatalogNumber());
				System.out.println("success!!.");
				return;
			}
			
			if(loansystem.containsKey(bk.getCatalogNumber()) == false){
				System.out.println("book already returned");
			}
				
		}	
		
		public void DeleteBorrower(String name){
			boolean isNew = true;
			Iterator<Borrower> iterator = registeredBorrowers.iterator();
			while(iterator.hasNext()){
				Borrower borrower = iterator.next();
				if(borrower.getName().equals(name)){
					registeredBorrowers.remove(borrower);
					System.out.println("success.");
					isNew = false;
					break;
				}
			}
			if(isNew){
				System.out.println("Not a registered borrower.");
			}
		}
}
	

