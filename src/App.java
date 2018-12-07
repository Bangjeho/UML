//�й� �̸�: 2017315018 ����ȣ, 2017315015 ������, 2017315054 �߿� ����Ű
//���α׷� ����: ������ �缭�� �����ִ� ���α׷�
//������ : 2018.12.07

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("SMLibrary");
		int key[] = {0,1,2,3,4,5,6,7};
		while(true){
			System.out.println("-----------------------");
			System.out.println("1 : �̿��� ���\n2 : å ���\n3 : ���Ⱑ���� å ����\n4 : ����Ұ����� å ����\n5 : å �����ϱ�\n6 : å �ݳ��ϱ�\n7 : �̿��ڻ���\n0 : �����ϱ�");
			Scanner scan = new Scanner(System.in);
			System.out.print("�Է¶�: ");
			int s = scan.nextInt();
			System.out.println("-----------------------");
			if(s == key[0]){
				System.out.println("�����մϴ�...");
				break;
			}
			if(s == key[1]){
				System.out.println("�̿����� �̸��� �Է����ּ���.");
				System.out.print("�̿��� �̸�: ");
				String name = scan.next();
				System.out.println("-----------------------");
				System.out.println("������ "+name+"(��)�� �½��ϱ�?"+"\n ������ 1 Ʋ���� 2");
				System.out.println("-----------------------");
				System.out.print("�Է¶�: ");
				int x = scan.nextInt();
				if(x != 1){
					System.out.println("�ٽ� �õ����ּ���.");
					continue;
				}
				else{
					System.out.println("����� �����մϴ�.");
					lib.registerOneBorrower(name);
				}
				
			}
			else if(s == key[2]){
				System.out.println("å�� ������ �Է����ּ���.");
				System.out.print("å�� ����: ");
				String title = scan.next();
				System.out.print("å�� ����: ");
				String author = scan.next();
				System.out.print("å�� ������ȣ: ");
				int catalogNumber = scan.nextInt();
				System.out.println("------------------------");
				System.out.println("å ����: "+title+"\n"
						+"�۰�: "+author +"\n"
						+"���� ��ȣ: "+catalogNumber+ "(��)�� �½��ϱ�?"+ 
						"\n������ 1 Ʋ���� 2");
				System.out.println("-----------------------");
				System.out.print("�Է¶�: ");
				int x = scan.nextInt();
				if(x != 1){
					System.out.println("�ٽ� �õ����ּ���.");
					continue;
				}
				else{
					System.out.println("����� �����մϴ�.");
					lib.registerOneBook(title, author, catalogNumber);
				}
				
			}
			else if(s == key[3]){
				System.out.println("���Ⱑ���� å ����Դϴ�.");
				lib.displayBooksForLoan();
				
			}
			else if(s == key[4]){
				System.out.println("����Ұ����� å ����Դϴ�.");
				lib.displayBooksOnLoan();
			}
			else if(s == key[5]){
				System.out.println("�̿����� �̸��� ������ å�� ���� ��ȣ�� �Է����ּ���.");
				System.out.print("�̿����� �̸�: ");
				 String name = scan.next();
				 System.out.print("å�� ���� ��ȣ: ");
				 int catalogNumber = scan.nextInt();
				 lib.LendOneBook(name, catalogNumber);
			}
			else if(s == key[6]){
				System.out.println("�̿����� �̸��� ������ å�� ���� ��ȣ�� �Է����ּ���.");
				System.out.print("�̿����� �̸�: ");
				 String name = scan.next();
				 System.out.print("å�� ���� ��ȣ: ");
				 int catalogNumber = scan.nextInt();
				 lib.ReturnOneBook(name, catalogNumber);
			}
			else if(s == key[7]){
				System.out.println("�̿����� �̸��� �Է����ּ���.");
				System.out.print("�̿����� �̸�: ");
				 String name = scan.next();
					System.out.println("-----------------------");
					System.out.println("������ "+name+"(��)�� �½��ϱ�?"+"\n ������ 1 Ʋ���� 2");
					int x = scan.nextInt();
					if(x != 1){
						System.out.println("�ٽ� �õ����ּ���.");
						continue;
					}
					else{
						System.out.println("������ �����մϴ�.");
						lib.DeleteBorrower(name);
					}
			}
			else
				System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
				continue;
		}
	}

}
