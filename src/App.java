//학번 이름: 2017315018 방제호, 2017315015 박진영, 2017315054 야오 유우키
//프로그램 내용: 도서관 사서를 도와주는 프로그램
//제출일 : 2018.12.07

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("SMLibrary");
		int key[] = {0,1,2,3,4,5,6,7};
		while(true){
			System.out.println("-----------------------");
			System.out.println("1 : 이용자 등록\n2 : 책 등록\n3 : 대출가능한 책 보기\n4 : 대출불가능한 책 보기\n5 : 책 대출하기\n6 : 책 반납하기\n7 : 이용자삭제\n0 : 종료하기");
			Scanner scan = new Scanner(System.in);
			System.out.print("입력란: ");
			int s = scan.nextInt();
			System.out.println("-----------------------");
			if(s == key[0]){
				System.out.println("종료합니다...");
				break;
			}
			if(s == key[1]){
				System.out.println("이용자의 이름을 입력해주세요.");
				System.out.print("이용자 이름: ");
				String name = scan.next();
				System.out.println("-----------------------");
				System.out.println("성함이 "+name+"(이)가 맞습니까?"+"\n 맞으면 1 틀리면 2");
				System.out.println("-----------------------");
				System.out.print("입력란: ");
				int x = scan.nextInt();
				if(x != 1){
					System.out.println("다시 시도해주세요.");
					continue;
				}
				else{
					System.out.println("등록을 진행합니다.");
					lib.registerOneBorrower(name);
				}
				
			}
			else if(s == key[2]){
				System.out.println("책의 정보를 입력해주세요.");
				System.out.print("책의 제목: ");
				String title = scan.next();
				System.out.print("책의 저자: ");
				String author = scan.next();
				System.out.print("책의 고유번호: ");
				int catalogNumber = scan.nextInt();
				System.out.println("------------------------");
				System.out.println("책 제목: "+title+"\n"
						+"작가: "+author +"\n"
						+"고유 번호: "+catalogNumber+ "(이)가 맞습니까?"+ 
						"\n맞으면 1 틀리면 2");
				System.out.println("-----------------------");
				System.out.print("입력란: ");
				int x = scan.nextInt();
				if(x != 1){
					System.out.println("다시 시도해주세요.");
					continue;
				}
				else{
					System.out.println("등록을 진행합니다.");
					lib.registerOneBook(title, author, catalogNumber);
				}
				
			}
			else if(s == key[3]){
				System.out.println("대출가능한 책 목록입니다.");
				lib.displayBooksForLoan();
				
			}
			else if(s == key[4]){
				System.out.println("대출불가능한 책 목록입니다.");
				lib.displayBooksOnLoan();
			}
			else if(s == key[5]){
				System.out.println("이용자의 이름과 대출할 책의 고유 번호를 입력해주세요.");
				System.out.print("이용자의 이름: ");
				 String name = scan.next();
				 System.out.print("책의 고유 번호: ");
				 int catalogNumber = scan.nextInt();
				 lib.LendOneBook(name, catalogNumber);
			}
			else if(s == key[6]){
				System.out.println("이용자의 이름과 대출할 책의 고유 번호를 입력해주세요.");
				System.out.print("이용자의 이름: ");
				 String name = scan.next();
				 System.out.print("책의 고유 번호: ");
				 int catalogNumber = scan.nextInt();
				 lib.ReturnOneBook(name, catalogNumber);
			}
			else if(s == key[7]){
				System.out.println("이용자의 이름을 입력해주세요.");
				System.out.print("이용자의 이름: ");
				 String name = scan.next();
					System.out.println("-----------------------");
					System.out.println("성함이 "+name+"(이)가 맞습니까?"+"\n 맞으면 1 틀리면 2");
					int x = scan.nextInt();
					if(x != 1){
						System.out.println("다시 시도해주세요.");
						continue;
					}
					else{
						System.out.println("삭제를 진행합니다.");
						lib.DeleteBorrower(name);
					}
			}
			else
				System.out.println("올바른 입력이 아닙니다.");
				continue;
		}
	}

}
