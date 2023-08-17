
public class ArrayListTest1 {
	public static void main(String[] args) {
//		배열은 한 번 선언하면 프로그램에서 크기를 변경할 수 없다.
		int[] data = new int[10];
		
//		<E> : 제네릭이라 부르며 ArrayList에 저장할 자료형을 반드시 클래스로 적는다.
		
		
		
		for(int i=0;i<10;i++) {
			data[i] = i+1;
		}
	}
}
