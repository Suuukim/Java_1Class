import java.util.Random;

public class CountTest {
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
//		�迭�̶� ���� �̸����� �������� ��� ��Ҹ� ����� ��� �� ��� ����.
//		�迭�� �����ϸ� ���ڴ� 8, ���ڴ� ����, boolean�� false, Ŭ������ ���� �迭�� null�� �ڵ����� �ʱ�ȭ �ȴ�.
//		�迭�� ��ġ�� �����ϴ� ����(index)�� 0���� �����ϴ� �Ϳ� ��������
//		�ڷ���[] �迭�� = new �ڷ���[�迭�� ũ��];			//1���� �迭
		int[] count = new int[6];
		
		Random random = new Random();
		for(int i=1;i<10;i++) {	
			int r = random.nextInt(6) + 1;
			System.out.println(r);
			/*
			case 1: a++; break;
			case 2: b++; break;
			case 3: c++; break;
			case 4: d++; break;
			case 5: e++; break;
			case 6: f++; break;
			*/
			/*
			case 1: count[0]++; break;
			case 2: count[1]++;	break;
			case 3: count[2]++; break;
			case 4: count[3]++; break;
			case 5: count[4]++; break;
			case 6: count[5]++; break;
			 */
			count[r - 1] ++;
		}
		/*
		System.out.println("1�� ���� : " + a);
		System.out.println("2�� ���� : " + b);
		System.out.println("3�� ���� : " + c);
		System.out.println("4�� ���� : " + d);
		System.out.println("5�� ���� : " + e);
		System.out.println("6�� ���� : " + f);
		*/
		/*
		System.out.println("1�� ���� : " + count[0]);
		System.out.println("2�� ���� : " + count[1]);
		System.out.println("3�� ���� : " + count[2]);
		System.out.println("4�� ���� : " + count[3]);
		System.out.println("5�� ���� : " + count[4]);
		System.out.println("6�� ���� : " + count[5]);
		 */	
//		�迭��.length : �迭�� ũ�⸦ ���´�.
		for(int i=0;i<count.length;i++) {
			System.out.println("1�� ���� : " + count[i]);
		}
	}
}
