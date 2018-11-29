//학번 이름: 2017315018 방제호, 2017315015 박진영, 2017315054 야오 유우키
//프로그램 내용: 도서관 사서를 도와주는 프로그램

import java.util.*;


public class Borrower implements Comparable{
	private String name;
	private LinkedList<Book> borrowedBooks;
	public Borrower(String name){		
		this.name = name;
		borrowedBooks = new LinkedList<Book>();
		

	}
	
	public void attachBook(Book book){
		borrowedBooks.add(book);
	}
	
	public void detachBook(){
		borrowedBooks.add(null);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
