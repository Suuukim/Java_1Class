import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3���� ������ �Է��ϼ��� : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double) total / 3;
		
//		key ���� ������ ����ϴ� ���� �Ǵ� ���� ����� ������ ����, �ڹ� 1.7���ʹ� ���ڿ��� �����ϴ�.
//		switch (key) {
//			case value: 		//":"���� �����Ѵ�.
//				key�� value�� ��ġ�� ��� ������ ����;
//				...;
//				[break;]		//if���� ������ ������ ����� {} ����� Ż���Ѵ�.
//			...;
//		[default:
//			key�� ��ġ�ϴ� value�� ���� ��� ������ ����;
//			...;
//			break;]
//		}
		
		
//		���� �۾��� �ϴ� case�� ������ �� �ִ�.
//		switch ((int) average) {
//			case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
//				System.out.println("��");
//			case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
//				System.out.println("��");
//		}
		
		switch ((int) average / 10) {
			case 10:
				System.out.println("�� ���߾��");
//				System.out.println("��"); break;
			case 9:
				System.out.println("��"); break;
			case 8:
				System.out.println("��"); break;
			case 7:
				System.out.println("��"); break;
			case 6:
				System.out.println("��"); break;
//			���� �۾��� �ϴ� case�� ������ �� �ִ�.
//			case 5: case 4: case 3: case 2: case 1: case 0:
			default:	
				System.out.println("��");
		}
		
	
	
	}
}
