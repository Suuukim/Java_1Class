
public class MainClass {
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(2));
		
		MethodClass methodClass = new MethodClass();
		System.out.println("1~100�� �հ� : " + methodClass.total());
		
		System.out.println("1~100�� �հ� : " + MethodClass.total());
	}
}
