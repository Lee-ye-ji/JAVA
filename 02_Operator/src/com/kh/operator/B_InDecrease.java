package com.kh.operator;

public class B_InDecrease {
	public void method1(){
		// ���� ������
		// ++ : 1 ���� ��Ű�� ������
		// -- : 1 ���� ��Ű�� ������
		// ���� ����, ���� ���� ����
		
		//���� ����
		int a = 10;
		int b = ++a;
		System.out.println("a: " + a + " b: "+ b); // a => 11, b => 11
		
		//���� ����
		int c = 10;
		int d = c++; //���� ������ �ٸ� ������ �Ͼ �� ���� �ǹǷ� c�� ���� d�� ���� �� �� ������ �Ͼ��.
		System.out.println("c: " + c + " d: " + d ); // c => 11, d => 10
		
		int num1 = 20;
		int result = num1++ * 3; // 20 * 3 �� ���� result => 60, ���� ���� ���� ++ num1 => 21
		// ���� ������ �ٸ� ������ �Ͼ �� ���� �ȴ�.
		
		System.out.println("result: " + result);
		System.out.println("num1: " + num1 );
		
	}

}
