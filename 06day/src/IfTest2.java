import java.util.Scanner;

public class IfTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����/����� �Ǻ��� �⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
//		������ ����ϴ� ������ ������ �����ϴ� �޼ҵ��� �̸��� "is"�� �����ϰ� �ϴ� ���� �����̴�.
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
//		�⵵�� 4�� ���� ��������(&&) 100���� ���� �������� �ʰų�(||) 400�� ���� �������� ����, �׷��� ������ ���
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println(year + "���� �����Դϴ�.");
//		} else {
//			System.out.println(year + "���� ����Դϴ�.");
//		}
		
		if(isLeapYear) {
			System.out.println(year + "���� �����Դϴ�.");
		}else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		
//		���� ������(?:)
//		if�� ������ ���� ��� ������ ���϶��� �����϶� ������ ������ ���� 1������ ��� ����ϸ� ���ϴ�.
//		���ǽ� ? ���ǽ��� ���� ��� ������ ���� : ���ǽ��� ������ ��� ������ ����
//		System.out.println(year + "����" + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "��" : "��")+"���Դϴ�.");
		
		System.out.println(year + "����" + (isLeapYear ? "��" : "��") + "���Դϴ�.");
		
		sc.close();
		
		
	}
}
