
public class MemoTest {
	public static void main(String[] args) {
		
		MemoVO vo1 = new MemoVO();
		MemoVO vo2 = new MemoVO("ȫ�浿", true, "1�� �Դϴ�.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
	}
}
