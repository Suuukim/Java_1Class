import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int menu = 0;
//		while(true) {
		while(menu != 5 ) {
		
			do {
			System.out.println("===================================");
			System.out.println("1.����    2.����    3.����    4.����    5.����");
			System.out.println("===================================");
			System.out.print("���ϴ� �޴��� �����ϼ��� : ");
			menu = sc.nextInt();
		} while(menu < 1 || menu > 5);
		
//		���⿡ �Դٴ� ���� �޴��� 1~5 ������ ���ڰ� �ԷµǾ��ٴ� ���̴�.
		switch(menu) {
		case 1: System.out.println("�Է�"); break;
		case 2: System.out.println("����"); break;
		case 3: System.out.println("����"); break;
		case 4: System.out.println("����"); break;
		case 5: 
			System.out.println("���̹���");
			System.exit(0);			// ���α׷��� ������ �����Ѵ�.
			break;
			}
		}
		
		sc.close();
	}
}
