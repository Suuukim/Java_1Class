
public class WhileTest {
	public static void main(String[] args) {
		
//		while�� ���� ���� ������ �����̸� {} ����� �� ���� �������� �ʴ´�.
//		while(���ǽ�) {
//		������ ���� ���� ������ ����;
//		....;
//		}
		
		int sum = 0, i = 0;
		while(i < 100) {
			sum += ++i;
		}
		System.out.println("1~100�� �հ� : " + sum);
		
//		while�� ���� ���� ������ �����̴��� {} ����� �� ���� �����Ѵ�.
//		do {
//			������ ���� ���� ������ ����;
//		
//		} while(���ǽ�);		//";"�� �������� �ȵȴ�.
		
		sum = i = 0;		// ������ ������ ���� ����� �� ����.
		do {
			sum += ++i;
		}while(i < 100);
		System.out.println("1~100�� �հ� : " + sum);
		
		
	}
}
