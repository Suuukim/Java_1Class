import java.util.Scanner;

public class ScannerTest2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
//		���ڿ��� ������ �����͸� �Է¹��� �� nextLine() �޼ҵ尡 ������ �Ǿ� �Ѵٸ� Ű���� ������
//		����Ű�� �о���̴� ������ �߻��ȴ�. ���ڿ��� ������ �����͸� �Է¹��� �� Ű���� ���۸� ����ִ� ������ �����ϰ�
//		nextLine() �޼ҵ带 �����Ѵ�.
		sc.nextLine();		//Ű���� ���۸� ����.
		
		String name = "";
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		System.out.println(name + "���� " + age + "�� �Դϴ�.");
		
		
		sc.close();
	}
}
