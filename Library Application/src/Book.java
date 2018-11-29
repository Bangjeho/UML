//학번 이름: 2017315018 방제호, 2017315015 박진영, 2017315054 야오 유우키
//프로그램 내용: 도서관 사서를 도와주는 프로그램

import java.util.*;

public class Book implements Comparable{
	private int catalogNumber;
	private String author;
	private String title;
	
	private Borrower borrower;
	public Book(String title, String author, int catalogNumber){
		this.title = title;
		this.author = author;
		this.catalogNumber = catalogNumber;
	}
	
	public void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(catalogNumber);
	}
	
	public void attachBorrower(Book book){
		borrower.attachBook(book);
	}
	
	public void detachBorrower(){
		borrower.detachBook();
	}
	
	public Borrower getBorrower() {
		// TODO Auto-generated method stub
		return borrower;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	}

