package day5;

public class StringTest1 {
	public static void main(String[] args) {
		
		String str1 = "AAA";
		String str2 = "AAA";
		
//		���� ������ : ���� ����� true(��), false(����) �� ���� �ϳ��̴�.
//		>(ũ��, �ʰ�), >=(ũ�ų� ����, �̻�), <(�۴�, �̸�), <=(�۰ų� ����, ����), =(����), !=(���� �ʴ�)
		
//		�� ������
//		&& : ����, AND, �� ������ ��� ���� ��쿡�� ��, ~�̰�, ~�̸鼭, ~�߿���
//		|| : ����, OR, �� ���� �߿��� �� �� �̻� ���� ��쿡 ��, ~�Ǵ�, ~�̰ų�
//		! : ������, NOT
		
//		if(���ǽ�) {
//			���ǽ��� ���� ��� ������ ����;
//			...;
//		} else {
//			���ǽ��� ������ ��� ������ ����;
//			...;
//		}
		
		if(str1 == str2) {
			System.out.println("����");
		} else {
			System.out.println("AAA");
		}
		
		String str3= new String("AAA");
		
		if(str1 == str3) {
			System.out.println("����");
		}
	
	}
}
