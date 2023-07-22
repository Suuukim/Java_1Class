//	�޷� �۾��� ����� �޼ҵ尡 ����� Ŭ����
public class MyCalen {

//	�μ��� �⵵�� �Ѱܹ޾� ����, ����� �Ǵ��� �����̸� true, ����̸� false�� �����ϴ� �޼ҵ�
	public static boolean isLeapyear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
//	�μ��� ��, ���� �Ѱܹ޾� �� ���� ������ ��¥�� �����ϴ� �޼ҵ�
	public static int lastDay(int year, int month) {
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = isLeapyear(year) ? 29 : 28;
		return m[month - 1];
	}
	
//	�μ��� ��, ��, ���� �Ѱܹ޾� 1�� 1�� 1�� ���� ������ ��¥�� �հ踦 ����� �����ϴ� �޼ҵ�
	public static int totalDay(int year, int month, int day) {
		int sum = (year - 1)* 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for(int i=1;i<month;i++) {
			sum += lastDay(year, i);
		}
		return sum + day;
	}
	
//	�μ��� ��, ��, ���� �Ѱܹ޾� ������ ���ڷ� �����ϴ� �޼ҵ�
//	�Ͽ���(0), ������(1), ȭ����(2), ������(3), �����(4), �ݿ���(5), �����(6)
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
	}
}
