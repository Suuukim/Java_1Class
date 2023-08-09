import java.util.Scanner;

public class MagicSquareTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true) {
			System.out.print("�迭�� ������ Ȧ���� �Է��ϼ��� : ");
			n = sc.nextInt();
			if(n % 2 == 1) {
				break;
			}
			System.out.println("Ȧ���� �Է��϶�ϱ��.....��.....");
		}
		
//		�Է¹��� �迭�� ������ŭ �迭�� �����Ѵ�.
		int[][] data = new int[n][n];
//		���ڰ� ä���� ù��° ��ġ(ù �� ���)�� ����Ѵ�.
		int i=0, j= (n - 1) / 2;
		
		for(int k=1;k<=Math.pow(n, 2);k++) {
			
			data[i][j] = k;
			if(k % n == 0) {
				i++;
			}else {
				if(--i < 0) {
					i = n - 1;
				}
				if(++j == n) {
					j = 0;
				}
			}
			
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%2d ", data[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
