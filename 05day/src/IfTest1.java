import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double)total / 3;
		
//		System.out.println("평균 점수 : " + average);
		System.out.printf("평균 점수 : %6.2f", average);
		
		if(average >= 90) {
			System.out.println("수");
		}
		if(average < 90 && average >= 80) {
			System.out.println("우");
		}
		if(average < 80 && average >= 70) {
			System.out.println("미");
		}
		if(average < 70 && average >= 60) {
			System.out.println("양");
		}
		if(average < 60) {
			System.out.println("가");
		}
	}
}
