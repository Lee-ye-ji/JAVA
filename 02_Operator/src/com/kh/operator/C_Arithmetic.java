package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + num1 * num2); 
		// ���ϱ� �����ں��� ���ϱ� ������ �켱������ ���� ������ ��ȣ�� ��� ��
		System.out.println("num1 / num2 : " + num1 / num2); // �������� �� => 3
		System.out.println("num1 % num2 : " + num1 % num2); // �������� ������ => 1
		
		// %(��ⷯ)�� ���� ���ǹ����� ¦Ȧ �Ǻ� � ���� ���
		// ��  % 2  => 0 �Ǵ� 1�̶�� ����� ����
		// ��� ���� 0�̸� ���� ¦��, ��� ���� 1�̸� ���� Ȧ��
		
		// ���� ��� �Ǻ����� ���� ���
		// 5�� ����ΰ�?
		// �� % 5 => ��� ���� 0�̸� 5�� ���
		
	}

}
