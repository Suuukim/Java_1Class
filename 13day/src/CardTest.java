import java.util.Random;

public class CardTest {
	public static void main(String[] args) {
		
		String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
//		char symbol[] = {'��','��','��','��'};
		String symbol[] = {"��","��","��","��"};
		
		int card[] = new int[52];
		for(int i=0;i<card.length;i++) {
			card[i] = i;
		}
		for(int i=0;i<card.length;i++) {
//			System.out.printf("%2s ", number[card[i] % 13]);		//���ڸ�
//			System.out.printf("%s ", symbol[card[i] / 13]);		//���̸�
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);		//���̸�
			if((i + 1) % 13 ==0) {
				System.out.println();
			}
		}
		System.out.println("=======================���� ��=======================");
		
		Random radom = new Random();
		for(int i=0;i<10000000;i++) {
			int r = radom.nextInt(51);
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
		for (int i=0;i<card.length;i++) {
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("=======================���� ��=======================");
	}
}
