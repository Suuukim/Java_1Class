import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3���� ������ �Է��ϼ��� : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double)total / 3;
		
//		System.out.println("��� ���� : " + average);
		System.out.printf("��� ���� : %6.2f", average);
		
		if(average >= 90) {
			System.out.println("��");
		}
		if(average < 90 && average >= 80) {
			System.out.println("��");
		}
		if(average < 80 && average >= 70) {
			System.out.println("��");
		}
		if(average < 70 && average >= 60) {
			System.out.println("��");
		}
		if(average < 60) {
			System.out.println("��");
		}
	}
}
