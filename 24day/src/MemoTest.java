
public class MemoTest {
	public static void main(String[] args) {
		
		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("ȫ�浿", true, "1�� �Դϴ�.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
		
		MemoVO vo3 = new MemoVO("������", false, "�̻��̿���");
		System.out.println(vo3);
		
		vo2.count = 100;
		System.out.println(vo3.count);
		
//		System.out.println(vo2.name);		// name�� private ������ ������ ����̹Ƿ� ������ �߻��Ѵ�.
		
		System.out.println(vo2.getName());
		vo2.setName("�Ӳ���");
		System.out.println(vo2.getName());
	}
}
