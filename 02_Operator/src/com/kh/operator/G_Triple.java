package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������ : �׸��� 3���� ������
	// ���ǽ� ? ���ǽ��� ���� ��� ��1 : ���ǽ��� ������ ��� ��2;
	// �� �� ���ǽ��� �ݵ�� true, false�� �����Բ� �ۼ��ؾ���
	
	public void method1() {
		//�Է� ���� ������ ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int num = sc.nextInt();
		
		String result = (num > 0 ) ? "����̴�" : "�����̴�";
		System.out.println(num + "�� " + result);
	}
	
	public void method2() {
		// �Է¹��� ������ Ȧ������ ¦������ �Ǻ� �� ���
		Scanner input = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int number = input.nextInt();
		
		String result = (number % 2 == 0) ? "¦���̴�" : "Ȧ���̴�";
		System.out.println(number + "�� " + result);
	}
	
	public void method3() {
		// ���� �������� ��ø ���
		// �Է� ���� ������ 0���� �ƴ��� �Ǻ� ��
		// 0�� �ƴ� ��� ������� �������� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0�̴�" : ((num > 0) ? "����̴�" : "�����̴�");
		System.out.println(num + "�� " + result);
	}

}
