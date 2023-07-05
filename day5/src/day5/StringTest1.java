package day5;

public class StringTest1 {
	public static void main(String[] args) {
		
		String str1 = "AAA";
		String str2 = "AAA";
		
//		관계 연산자 : 연산 결과는 true(참), false(거짓) 둘 중의 하나이다.
//		>(크다, 초과), >=(크거나 같다, 이상), <(작다, 미만), <=(작거나 같다, 이하), =(같다), !=(같지 않다)
		
//		논리 연산자
//		&& : 논리곱, AND, 두 조건이 모두 참일 경우에만 참, ~이고, ~이면서, ~중에서
//		|| : 논리합, OR, 두 조건 중에서 한 개 이상 참일 경우에 참, ~또는, ~이거나
//		! : 논리부정, NOT
		
//		if(조건식) {
//			조건식이 참일 경우 실행할 문장;
//			...;
//		} else {
//			조건식이 거짓일 경우 실행할 문장;
//			...;
//		}
		
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("AAA");
		}
		
		String str3= new String("AAA");
		
		if(str1 == str3) {
			System.out.println("같다");
		}
	
	}
}
