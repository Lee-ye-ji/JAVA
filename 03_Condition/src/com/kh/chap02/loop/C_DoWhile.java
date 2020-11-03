package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/* do while��
	 * [�ʱ��]
	 * do{
	 * 		������ �ڵ�;
	 * 		[������];
	 * }while(���ǽ�);
	 * 
	 */
	
	public void method1() {
		// while���� �ٸ� ���� ������ ���� �ʾƵ�
		// �ݵ�� �ѹ��� ������ �����ϰ� ���� �˻縦 �Ѵٴ� ��
		
		int num = 0;
		do {
			System.out.println(num);
		}while(num != 0);
	}
	
	public void method2() {
		// 1���� 5���� ���
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 5);
	}
	
	public void method3() {
		//1���� ���� ��(17~24)������ �� ���ϱ�
		
		int random = (int)(Math.random() * 8) + 17;
		System.out.println("���� ��: " + random);
		
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i <= random);
		
		System.out.println("1���� " + random + "������ �հ�: " + sum);
	}
	
	public void method4() {
		// ����ڿ��� ���ڿ��� �Է� �޾Ƽ� �� �ε��� �� ���ڸ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		// �Է� ���� ���ڿ��� ���̸� �˷��� --> ���ڿ�.length() �޼ҵ� ���
		System.out.println("���ڿ��� ����: " + str.length());
		
		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;
		}while(i < str.length());
		
		//���࿡ �� ���ڿ��� �Է� ���� ��� ���� �߻� -> do while���� �ϴ� �ѹ� �����ϰ� ������ Ȯ���ϱ� ����
		
	}

}
