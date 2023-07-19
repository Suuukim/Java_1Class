import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		
		int[] ball = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Random random = new Random();
		for(int i=0;i<1000000; i++) {
			int r = random.nextInt(9) + 1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		
		System.out.print("CPU : ");
		for(int i=0;i<level;i++) {
			System.out.print(ball[i]);
		}
		System.out.println();
		
		sc.nextLine(); 		// Ű���� ���۸� ����.
//		���⶧���� �ݺ��Ѵ�.
		int count = 0;
//		currenTimeMillis() : 1990�� 1�� 1�� ���� �� �޼ҵ尡 ����Ǵ� �������� ���� �ð��� 1/1000�� ������ ���´�.
		long start = System.currentTimeMillis();		//���� ���� �ð�
		int s = 0, b = 0;
		while(true) {
			System.out.println("USER : ");
			String user = sc.nextLine();
			
//			��Ʈ����ũ�� ���� ������ ����.
//			��Ʈ����ũ�� ���� ������ �ݺ����� �ٽ� ����ؾ� �ϹǷ� �ݺ��ȿ��� �ʱ�ȭ ���Ѿ� �Ѵ�.
			for(int i=0;i<level;i++) {
//				��Ʈ����ũ�� ����
				if(ball[i] == user.charAt(i) - 48) {
					s++;
				}
//			indexOf() : ���ڿ����� ��ȣ ���� ���ڳ� ���ڿ��� ���ʷ� ��Ÿ���� ��ġ�� ���´�. ������ -1�� �����Ѵ�.
//			���ڿ��� Ư���� ���� �Ǵ� ���ڿ��� ���ԵǾ� �ִ°��� �� �� �ִ�.
//			System.out.println(user.indexOf(ball[i] + ""));
//			���� ����
			if(user.indexOf(ball[i] + "") >= 0) {
				b++;
			}
			
		}
//			�������� �ݺ��� Ż���Ѵ�.
			if(s == level) {
				break;
			}
			System.out.println(s + "��Ʈ����ũ " + (b - s) + " ��");
		}
	
		long end = System.currentTimeMillis();		//���� ���� �ð�
		System.out.println((end - start) / 1000 + "�� �ɷ��� " + count + "�� ���� �����.");
	
	}
}
