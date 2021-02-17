package com.kh.chap04_field.model.vo;

// ���� ���� ��ġ�� ���� ������ ���� ���� Ŭ����(����, ����, �Ű� ��)
public class FieldTest2 {
	/* Ŭ���� = "�ʵ�" + ������ + �޼ҵ�
	 * 
	 * - ��������: Ŭ���� ������ �ۼ��ϴ� ������ ���� Ŭ���� ������ ��𼭵� ���
	 * 			�޼ҵ� �ۿ� Ŭ���� �ȿ� �������־�� �Ѵ�.
	 * - ��������: �޼ҵ� ���� ��, ������, ��� �� Ŭ���� ������ ������ Ư���� ����({})�ȿ�
	 * 			�����Ǿ� �� ���� �ȿ����� ��� ����
	 * 
	 * 1. ���� ����
	 * 		- ��� ����(�ν��Ͻ� ����)
	 * 		����: new�� ���� �ν��Ͻ�(��ü) ���� �� �޸𸮿� �Ҵ�
	 * 		�Ҹ� : ��ü �Ҹ� �� �Ҹ�
	 * 		- Ŭ���� ����(static ����) : static ���� ���� ���� -> �ڿ��� ���� �ٷﺼ ��
	 * 		���� : ���α׷� ���� �� static �޸� ������ �Ҵ�
	 * 		�Ҹ� : ���α׷��� ���� �� �� �Ҹ�
	 * 2. ���� ����
	 * 		���� : Ư���� ���� ({}) ���� �� �޸� ������ �Ҵ�(ex. �޼ҵ� ���� ��)
	 * 		�Ҹ� : Ư���� ����({}) ���� �� �Ҹ� (ex. �޼ҵ� ���� ��)
	 */
	
	// ��� ����(�ν��Ͻ� ���� ) == �ʵ� ��
	private int global; //private�� ��������
	
	// ������ 
	public FieldTest2() {}
		
		// �Ű������� �ִ� �޼ҵ�
		public void test(int num) {
			
			//���� ����(Ư�� ���� ��, �޼ҵ� ���� ���� �ۼ��ϴ� ����)
			int local; 		// ���� �������� ���� ������ X
			
			// �Ű�����(�޼ҵ��� ��ȣ �ȿ� �ۼ��ϴ� ����)�� ���������� �������� �޼ҵ� ���� �ȿ����� ��� ����
			// -> int num�� ���� ����
			
			System.out.println("���� ���� : " + global);
			// ���� ������ Ŭ���� �������� ��� �����ϸ�
			// �ʱ�ȭ ���� �ʾ��� ���� JVM�� �⺻ ���� �ο� (int -> 0)
			
			//System.out.println("���� ���� : " + local);
			// ���� ������ �ʱ�ȭ ���� �ʾ��� �� ���� �߻� -> �ݵ�� �ʱ�ȭ �ؾ���
			
			System.out.println("�Ű� ���� : " + num);
			// �Ű������� �޼ҵ� ȣ�� �� �ݵ�� ���� ���޵Ǿ� ���� ������ ��� ����
		}

}