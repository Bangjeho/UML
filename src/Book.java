//�й� �̸�: 2017315018 ����ȣ, 2017315015 ������, 2017315054 �߿� ����Ű
//���α׷� ����: ������ �缭�� �����ִ� ���α׷�
//������ : 2018.12.07
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
		System.out.println("å ����: " + title);
		System.out.println("å ����: "+author);
		System.out.println("å ������ȣ: " +catalogNumber);
	}
	

	
	public int getCatalogNumber() {
		// TODO Auto-generated method stub
		return catalogNumber;
	}




	}

