import java.sql.Date;

public class MemoVO {
	
	private int no;
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;
	
//	������ �޼ҵ�(���� ������)
//	������ �̸��� �ݵ�� Ŭ���� �̸��� ���ƾ� �Ѵ�.
//	�����ڴ� return�� ������ �ʴ´�. return�� ������ �ʴ� �޼ҵ�� ���� ���ѿ� "void"�� �Է��ϴµ� �����ڴ� ���� ������ ���� �ʴ´�.
//	�����ڸ� �������� ������ �ڹ� �Ĥ����Ϸ��� �ƹ��� �ϵ� ���� �ʴ� �⺻ �����ڸ� ����� �ش�. ������ ����ڰ� �����ڸ� �����ϸ� �⺻ �����ڴ�
//	�ڵ����� �������� �ʴ´�.
//	�����ڴ� ��ü�� ������ �� �ڵ����� ����Ǹ� ��� ������ �ʱ�ȭ ��Ű�� �������� ���ȴ�.
	public MemoVO() {
//		System.out.println("�⺻ �����ڰ� ����˴ϴ�.");
		name = "����";
		gender = false;
		memo = "����";
	}

	public MemoVO(String name, boolean gender, String memo) {
//		���� {} ��Ͽ� ���� �̸��� ������ ���� ������ ��� ������ ���� ��� ���� ������ �켱���� �ش�.
//		super() : �θ� Ŭ������ �����ڸ� �ǹ��Ѵ�. �����ϸ� super()�� �����Ϸ��� �ڵ����� �־��ش�.
//		this() : ���� Ŭ������ �����ڸ� �ǹ��Ѵ�.
//		super()�� this()�� �ݵ�� �������� ù�ٿ� �ڵ��ؾ� �Ѵ�.
//		this : ���� Ŭ������ �ǹ��Ѵ�.
		
		this.name = name;
		this.gender = gender;
		this.memo = memo;
	}
	 
//	��ü�� ����� ������ ����ؾ� �Ѵٸ� toString() �޼ҵ带 override(������) �Ѵ�.
	@Override
	public String toString() {
		return name + "(" + (gender ? "��" : "��") + ")�� ���主 " + memo; 
	}
}
