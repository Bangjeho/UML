//�й� �̸�: 2017315018 ����ȣ, 2017315015 ������, 2017315054 �߿� ����Ű
//���α׷� ����: ������ �缭�� �����ִ� ���α׷�

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
