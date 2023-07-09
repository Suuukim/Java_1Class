import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double) total / 3;
		
//		key 값은 점수를 기억하는 변수 또는 연산 결과가 정수인 수식, 자바 1.7부터는 문자열도 가능하다.
//		switch (key) {
//			case value: 		//":"임을 주의한다.
//				key와 value가 일치할 경우 실행할 문장;
//				...;
//				[break;]		//if문을 제외한 나머지 제어문의 {} 블록을 탈출한다.
//			...;
//		[default:
//			key와 일치하는 value가 없을 경우 실행할 문장;
//			...;
//			break;]
//		}
		
		
//		같은 작업을 하는 case는 나열할 수 있다.
//		switch ((int) average) {
//			case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
//				System.out.println("수");
//			case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
//				System.out.println("우");
//		}
		
		switch ((int) average / 10) {
			case 10:
				System.out.println("참 잘했어요");
//				System.out.println("수"); break;
			case 9:
				System.out.println("수"); break;
			case 8:
				System.out.println("우"); break;
			case 7:
				System.out.println("미"); break;
			case 6:
				System.out.println("양"); break;
//			같은 작업을 하는 case는 나열할 수 있다.
//			case 5: case 4: case 3: case 2: case 1: case 0:
			default:	
				System.out.println("가");
		}
		
	
	
	}
}
