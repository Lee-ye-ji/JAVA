package com.kh.chap07_method.part02_methodTest.controller;

public class NonstaticMethod {
	// �Ű����� ������ ��ȯ�� ������ ���� ����
	
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
		// �ƹ� ���� ��ȯ���� �ʰ� �޼ҵ� ���븸 ���� �� �޼ҵ� ����
		System.out.println("�Ű������� ��ȯ ���� �� �� ���� �޼ҵ��Դϴ�.");
		
		// return; // ��� �޼ҵ忡 ���� �Ǿ� ���� (JVM�� �ڵ� ����)
	}
	
	// 2. �Ű����� ���� ��ȯ ���� �ִ� �޼ҵ�
	public String method2() {
		String str = "�Ű������� ������ ��ȯ ���� �ִ� �޼ҵ� �Դϴ�.";
		return str;
	}
	
	// 3. �Ű����� �ְ� ��ȯ ���� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// �� �޼ҵ带 ȣ���ϴ� ������ ������ ���� �ޱ� ���� �����ϴ� ���� �Ű�����
		System.out.println(num1 - num2);
	}
	
	// 4. �Ű����� �ְ� ��ȯ ���� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	

}
