import java.util.Scanner;

// �޷��� ����ϴ� Ŭ����
public class MyCalendar {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�޷��� ����� ��, �� : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		System.out.println("======================================");
		System.out.printf("    %4d�� %2d��\n", year, month);
		System.out.println("======================================");
		System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("======================================");
		
//		1���� ���� ��ŭ �ݺ��ϸ� ��ĭ�� ����Ѵ�.
		for(int i=1;i<=MyCalen.weekDay(year, month, 1);i++) {
			System.out.print("    ");
		}		
//		1�� ���� �޷��� ����� ���� ������ ��¥ ��ŭ �ݺ��ϸ� ��¥�� ����Ѵ�.
		for(int i=1;i<=MyCalen.lastDay(year, month);i++) {
			System.out.printf(" %2d ", i);
//			����� ��¥�� ������̰� �� ���� ������ ��¥�� �ƴϸ� ���� �ٲ۴�.
			if(MyCalen.weekDay(year, month, i) == 6 && MyCalen.lastDay(year, month) != i) {
				System.out.println();
			}
		}
		System.out.println("\n====================================");
	}
}
