import java.util.Scanner;

public class WeekDayTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일을 계산할, 월, 일 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
//		1년 1월 1일 부터 입력한 년도의 전년도 12월 31일 까지 지난 날짜를 계산한다.
		int sum = (year -1) * 365 + (year -1) / 4;
		
		
		
	}
}
