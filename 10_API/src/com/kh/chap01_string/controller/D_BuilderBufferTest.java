package com.kh.chap01_string.controller;

public class D_BuilderBufferTest {
	/* * String Ŭ���� -> �Һ�
	 * ��� ���� �����ϴ� ��� �������÷��Ͱ� ��� �������� �ʴ� ���ڿ��� ��������ϴ� ����
	 * -> ������ ���� �о���⸸ �ϴ� ��� String Ŭ���� ����
	 * 
	 * * StringBuffer, StringBuilder -> ����(���ϴ�)Ŭ����
	 * - ����� ������ ���� �޸� ����(����)�� ���ο� ���ϴµ� ó������ 16���� ���ڸ� ������ �� �ִ� ���۰� �����ǰ�
	 * 	 ���ڰ� ���� �ʿ� ���� �ڵ����� ����
	 * - �ʱ� ���� ũ�⸦ ������ �� �ְ� ���ڿ��� ���̺��� 16���� ���ڸ� �� ������ �� ���� 
	 */
	
	public void method1() {
		// StringBuffer, StringBulider �� �� ��� ������/ �޼ҵ� ����������
		// �������� ����ȭ ó���� �Ǵ��� �ȵǴ����� ����
		
		// StringBuffer�� ����ȭ ó�� O (Thread safe)
		// StringBuilder�� ����ȭ ó�� X
		
		// ��Ƽ ������ ȯ�� -> ����ȭ ó���� �Ǿ�� ������ -> StringBuffer ��� ����
		// ���� ������ ȯ�� -> ����ȭ ó���� �ϸ� �ӵ� ���� �߻� -> StringBuilder ��� ����
		
		// �츮�� StringBuilder�� �۾� StringBuffer�� ��ü�� �����ϸ� �����ϰ� �޼ҵ� ��� ����
		
		// �⺻ �����ڷ� �����ϰ� �Ǹ� �⺻���� 16 ũ�� ��ŭ ����
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 ���뷮 : " + sb1.capacity()); // ������ �⺻ ���뷮 : 16
		System.out.println("sb1 ���� : " + sb1.length()); // ����ִ� ���ڿ��� ���� 
		System.out.println("=======================");
		
		// �Ű������� ���� ���� �������ָ� �ش� ũ�� ��ŭ�� ���뷮�� ���� ��
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 ���뷮 :" + sb2.capacity());
		System.out.println("sb2 ���� :" + sb2.length());
		System.out.println("========================");
		
		// �Ű������� ���ڿ��� �������ָ� �ش� ���ڿ��� ���� + 16��ŭ�� ���뷮�� ����
		StringBuilder sb3 = new StringBuilder("�ݰ���!!");
		System.out.println("sb3 ���뷮 :" + sb3.capacity());
		System.out.println("sb3 ���� :" + sb3.length());
		System.out.println("========================");
	}
	
	public void method2() {
		// �Һ� ���� �׽�Ʈ
		
		// String
		String str = "�ݰ���";
		System.out.println(System.identityHashCode(str));
		
		str += "�� String�̾�";
		System.out.println(System.identityHashCode(str));
		// �Һ� -> ���� �����Ǹ鼭 �����ϰ� �ִ� �ּ� ���� �ٲ�� ����
		System.out.println("========================");
		
		//stringBuilder
		StringBuilder sb = new StringBuilder("�ݰ���!");
		
		System.out.println("sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 :" + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=========================");
		
		
		// StringBuilder���� ���� �����ϰ��� �Ҷ��� �޼ҵ带 ���ؼ� �۾�
		// 1. append(String str): StringBuilder -> ���ڿ� �߰�
		sb.append("�ȳ�!");
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 :" + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=========================");
		// -> �ּҰ��� �������� �ʴ� ���� Ȯ���� �� ����
		// �� ���� ��ü��(���� ��ü�� ���� ���ڿ� ������ ������ �Ͼ)
		
		sb.append("�ٵ� ���ݸ� ��������!!!");
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 :" + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=========================");
		
		// 2. delete(int start, int end) : StringBuilder -> ���ڿ� ����
		sb.delete(2, 5);
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 :" + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=========================");
		// 2, 3, 4 �ε����� �ش��ϴ� ���� ���� ��
		
		// 3. insert(int offset, String str) : StringBuilder -> ���ڿ� ����
		sb.insert(1, "������");
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 :" + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=========================");
		
		// 4. reverse() : StringBuilder -> ������ �ٲٴ�
		sb.reverse();
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 :" + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("=========================");
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("JavaProgram");
		
		
		sb.append("API").delete(4, 11).reverse();
		System.out.println(sb);
		
		// �޼ҵ� ��ȯ���� ��� StringBuilder�̹Ƿ� �޼ҵ带 �̾ ȣ�� �� �� ����
		// -> �ش� �޼ҵ��� ����� sb �ּҰ��� ��ȯ�Ǳ� ����
		// -> �޼ҵ� ü�̴�(�޼ҵ� �̾��)
		
	}
	

}
