package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// �� ������
	// �� �� �� �� ���� �����ϴ� ������
	// &&(AND) ||(OR)
	public void method1() {
		//����ڰ� �Է��� ���� ���� 1���� 100 ������ ������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		boolean isTrue;
		// isTrue => (1<= num <= 100) //������ �� �� �̱� ������ ������ ��
		isTrue = (num >= 1) && (num <= 100);
		// && -> �ǹ� : �׸���, ~�ϸ鼭
		System.out.println("����ڰ� �Է��� ���� 1���� 100�����Դϱ�: " + isTrue);
		
		// &&: �� ���� ������ ��� true���� && ������ ��� ���� true
		// 		�ϳ��� ������ false�� �ȴٸ� &&������ ������� false
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� ���� ���� ���� �빮������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�:");
		char ch = sc.next().charAt(0);
		
		// char���� ������ ������
		// 'A'���� 'Z'�� �ش��ϴ� �����ڵ� ���� 65 ~ 90
		//boolean isTrue = (ch >= 65) && (ch <= 90); //�빮��
		boolean isTrue = (ch >= 'A') && (ch <= 'Z');
		System.out.println("����ڰ� �Է��� ���� �빮���Դϱ�: " + isTrue);
	}
	
	public void method3() {
		// ����ڿ��� ���α׷� ���� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Ͻ÷��� y �Ǵ� Y�� �Է��ϼ���: ");
		char ch = sc.next().charAt(0);
		
		boolean isTrue = (ch == 'y') || (ch == 'Y');
		// || -> �ǹ� �Ǵ� , ~�ų�
		System.out.println("����ڰ� �Է��� ���� y�Ǵ� Y�Դϱ�: "+ isTrue);
		
		// ||: �� ���� ���� �� �ϳ���� true�� �ִٸ� || ������ ��� ���� true
		// �� �� ���� ��� false�� ��� || ������ ��� ���� false
	}
	
	public void method4() {
		// &&, || ������ Ư¡ : ù ��° ���ǿ��� ����� ���� �� �� �ִٸ� �� ��° ������ üũ���� �ʴ´�
		int num = 10;
		System.out.println("&& ���� ���� num ��: " + num);
		
		boolean result1 = false && ++num > 0;
		System.out.println("result1 : " + result1);
		System.out.println("&& ���� ���� num ��: " + num);
		// && ������ �տ� �̹� false�� �����Ƿ� ������ ������ ������� ����
		// --> dead code��� ���â Ȯ���� �� ����
		
		boolean result2 = true || ++num < 0;
		System.out.println("result2: " + result2 );
		System.out.println("|| ���� ���� num �� :" +  num );
		// || ������ �տ� �̹� true�� �����Ƿ� ������ ������ ������� ����
		// --> dead code��� ���â Ȯ���� �� ����
	}

}
