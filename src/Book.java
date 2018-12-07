//학번 이름: 2017315018 방제호, 2017315015 박진영, 2017315054 야오 유우키
//프로그램 내용: 도서관 사서를 도와주는 프로그램
//제출일 : 2018.12.07
import java.util.*;

public class Book {
	private int catalogNumber;
	private String author;
	private String title;
	public Book(String title, String author, int catalogNumber){
		this.title = title;
		this.author = author;
		this.catalogNumber = catalogNumber;
	}

	public void display(){
		System.out.println("책 제목: " + title);
		System.out.println("책 저자: "+author);
		System.out.println("책 고유번호: " +catalogNumber);
	}
	

	
	public int getCatalogNumber() {
		// TODO Auto-generated method stub
		return catalogNumber;
	}




	}

