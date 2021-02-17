package com.kh.chap01_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// -> toString()�� �������̵� �Ǿ�����
		
		System.out.println(str1 == str2); // false
		// -> �� �������� �ٸ� ������ �����Ǿ� �ּ� ���� �ٸ��Ƿ� �ּ� �� �񱳴� false
		// �ּ� �� �񱳰� �Ͼ
		
		System.out.println(str1.equals(str2)); // true
		// -> Object�� equals()�� ȣ�� �ȴٸ� �ּҰ� ���̹Ƿ� false�� ����������
		// String Ŭ������ equals()�� �������̵� �Ǿ ���� �� �񱳸� �����ϹǷ� true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// -> hashCode()�� ���� ���� ������ ���� hashCode���� �������� �������̵� �Ǿ� ����
		
		// �������̵� �� hashCode���� ���� �ּҰ��� �˱� ����
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method2() {
		// 2. ���ڿ��� ���ͷ��� ����
		String str1 = "abc";
		String str2 = "abc";
		
		// �ּҰ� ��
		System.out.println(str1 == str2); // true
		// -> true
		// �����ڰ� �ƴ� ���ͷ��� ���� �ʱ�ȭ�ϸ�
		// Heap ������ �ִ� String pool�� ���� �ʱ�ȭ ��
		// ���� ���� �����Ƿ� equals(), hashCode() ���� ���� ���� ���� ��
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// ���� �ּ� ���� �����Ƿ� ���� ��ü�� �����ϰ� �ִ� ���� �� �� ����
		
		// ���� str2 ���� �����Ϸ��� �ϸ� �ش� �����ϰ� �ִ� �� ���� ������ �ɱ�?
		str2 = "bcd";
		
		System.out.println(System.identityHashCode(str2));
		// �ش� �ڸ����� ���� ����Ǵ� �� �ƴ϶� ���ο� ������ ���� ����� �ش� �ּҸ� ����Ű�� ��
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		// �ٽ� abc�� �����ϰ� �Ǹ� ������ �� ���� ����Ű�� ��
		
		// ���� StringŬ������ �Һ�, ��ġ ����� ����.
	}

}
