package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Phone {
	// �߻�Ŭ���� => �Ϲ� ���(���� + �޼ҵ�) + �߻� �޼ҵ�
	// �������̽� => ���� ��� �ʵ� + �߻� �޼ҵ�
	
	// �������̽������� �ʵ�� ������ ��� �ʵ�
	/*public static final*/ int NUM = 10; // ��� �ʵ� ����
	// -> ���� �ϴ��� ��������δ� ����!
	
	// �������̽������� �޼ҵ�� �׻� �߻� �޼ҵ�
	/*public abstract*/ void makeaCall(); // ��ȭ �ɱ�
	/*�Ϲ� ��ȭ : ��ȣ�� ����, 
	 * �޴���ȭ : ��ȣ�� ������ ��ȭ ��ư�� ����*/
	
	void takeaCall(); // ��ȭ �ޱ�
	/*�Ϲ� ��ȭ : ��ȭ�⸦ ��, 
	 * �޴���ȭ : ���� ��ư�� ����*/

}
