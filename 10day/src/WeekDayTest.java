import java.util.Scanner;

public class WeekDayTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �����, ��, �� : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
//		1�� 1�� 1�� ���� �Է��� �⵵�� ���⵵ 12�� 31�� ���� ���� ��¥�� ����Ѵ�.
		int sum = (year -1) * 365 + (year -1) / 4;
		
		
		
	}
}
