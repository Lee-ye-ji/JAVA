package com.kh.chap02.encapsulation.model.vo;

public class Student {
	/* 1. �ʵ�
	 * 
	 * ���������� [�����] �ڷ��� ������;
	 * 
	 */
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	/* 2. ������ : ��ü�� �����ϱ� ���� ������ �޼ҵ�
	 * ���������� Ŭ������([�Ű�����]) {
	 * }
	 */
	public Student() { }
		
		/* 3. �޼ҵ� : ����� �����ϴ� �κ�
		 * ���������� ��ȯ�� �޼ҵ��([�Ű�����]){
		 * 
		 * }
		 */
		
		// 3_1. setter
		// ������(�ʵ�)���� ��� �� �����ϴ� ����� �ϴ� �޼ҵ�
		// �� �� �޼ҵ�� �ܺ� ���� �����ϵ��� �ؾ��ϱ� ������ public ���� ������ ���
		// ��ȯ�� ���� -> void
		// �޼ҵ� ���� ī�� ǥ����� �̿��ϸ� setXXX�� ��� ������
		// �Ű��������� �����Ӱ� ������ ���� ������ ���ʻ� �ʵ��� �����ϰ� �����
		
		// ��ȯ���� �����Ƿ� -> void
		public void setName(String name) {  // �̸��� �������ִ� �޼ҵ�
			// name = name;
			// �Ű������� name = �Ű������� name;
			// {} ���������� �ش� �������� ������� ������ �켱������ ���� ����
			
			// �츮�� ���ϴ� �ڵ��
			// �ʵ��� name = �Ű������� name;
			this.name = name;
			// this���� �ش� ��ü�� �ּҰ��� �������
		}
		
		public void setKor(int kor) { // ���� ������ �������ִ� �޼ҵ�
			this.kor = kor;
		}
		
		public void setMath(int math) { // ���� ������ �������ִ� �޼ҵ�
			this.math = math;
		}
		
		public void setEng(int eng) { // ���� ������ �������ִ� �޼ҵ�
			this.eng = eng;
		}
		
	
		// 3_2. getter
		// ���� ��ȯ���ִ� ����� �ϴ� �޼ҵ�
		// getter �޼ҵ� ���� ī�� ǥ����� �̿��Ͽ� getXXX�� ��� ������
		// ���������ڴ� �ܺο��� ���� �� �� �־�� �ϹǷ� public
		// �ʵ� ���� ��ȯ����� �ϹǷ� ��ȯ�ϰ����ϴ� �ڷ����� ��ȯ���� ����
		// getter�޼ҵ�� ���� �ش� �ʵ� ���� ��ȯ���ִ� �޼ҵ�� �ش� �޼ҵ�� ���޵Ǵ� ���� �����Ƿ�
		// �Ű������� �ۼ��� �ʿ䰡 ����
		
		public String getName() { // ��ȯ���� �������� ��� �ݵ�� return ������ �ʿ���
									// �������ִ� ��� �Ӹ� �ƴ϶� ���� ��ȯ�� �ִ� ����� ������ ����
			return name;  // getter�޼ҵ� �ȿ��� �������� name�� �����Ƿ� this�� ������ �ʾƵ� �ʵ� name�� �ν���
		}
		
		public int getKor() {
			return kor;
		}
		
		public int getMath() {
			return math;
		}
		
		public int getEng() {
			return eng;
		}
		
		// ��� �ʵ� ���� �� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		public String information() {
			return "�̸� : " + name + ", ���� ���� : " + kor + ", ���� ���� : " + math + ", ���� ���� : " + eng;
		}

}
