package day5;

import java.util.Scanner;

public class StringTest2 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
//		length() : ������ ����� ���ڿ��� �����ϴ� ������ ������ ���´�.
		System.out.println("�Է��� ���ڿ��� ũ�� : " + str.length());
		
//		trim() : ���ڿ� ��, ���� ���ʿ��� ������ �����Ѵ�.
		System.out.println("�Է��� ���ڿ����� ���ʿ��� ������ ������ ���ڿ��� ũ�� : " + str.trim().length());
		
//		toUpperCase() : �����ڸ� ������ �빮�ڷ� ��ȯ�Ѵ�.
		System.out.println("������ �빮�ڷ� ��� : " + str.toUpperCase());
		
//		toLowerCase() : �����ڸ� ������ �ҹ��ڷ� ��ȯ�Ѵ�.
		System.out.println("������ �ҹ��ڷ� ��� : " + str.toLowerCase());
		
//		charAt() : ���ڿ����� index ��° ���� 1���ڸ� ���´�. ������ ��ġ�� ����� �� �� �������� ���� index�� 0���� ���۵ȴ�.
		System.out.println("3��° ���� : " + str.charAt(2));
		
		sc.close();
	}
}
