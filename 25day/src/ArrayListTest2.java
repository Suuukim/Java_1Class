import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		
//		Person person1 = new Person();
//		System.out.println(person1);
//		Person person2 = new Person("홍길동", 20);
//		System.out.println(person2);
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("홍길동", 20));
		list.add(new Person("임꺽정", 40));
		list.add(new Person("장길산", 31));
		list.add(new Person("일지매", 16));
		list.add(new Person("임꺽정", 40));			// 중복되는 데이터도 입력된다.
		System.out.println(list.size() + " : " + list);		// size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
		
		list.add(1, new Person("포청천", 48));		// add(index, value) : ArrayList의 index번째 위치에 value를 삽입한다.
		
		System.out.println(list.get(1));			// get(index) : ArrayList의 index번째 위치에 value를 얻어온다.
		
		list.set(2, new Person("성춘향", 16));		// set(index, value) : ArrayList의 index번째 위치에 value를 수정한다.
		System.out.println(list.size() + " : " + list);	
		
		list.remove(2);
		System.out.println(list.size() + " : " + list); 	// remove(index) : ArrayList의 index번째 위치에 value를 제거한다.
		
		list.clear();
		System.out.println(list.size() + " : " + list); 	// clear() : ArrayList의 index 번째 위치에 value를 제거한다.
		
	}
}
