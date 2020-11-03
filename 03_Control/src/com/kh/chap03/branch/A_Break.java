package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break: ���� ����� �ݺ����� ���������� ����
	// *** switch�� break�� switch���� ���������� break��
	// �ݺ������� ���Ǵ� break�� �ٸ� ***
	
	public void method1() {
		// "exit" �Է� ������ ���ڿ��� ��� �Է¹ް� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			//str�� ����ϱ� ���� exit���� Ȯ���Ͽ� �ݺ��� ���������� �������� ����
			if(str.equals("exit"))
				break; //�б⹮
			
			System.out.println("str : " + str);
		}
		//System.out.println("test");
		// -> ���� �ݺ��� �ȿ� break�� ���� ��� ���� �ڵ� ���� �߻�
		// (���� �ݺ����� ���������� �ʴ´ٸ� ������ �� ���� �ڵ��̹Ƿ�)
	}
	
	public void method2() {
		// 1���� ����ڰ� �Է��� ���ڱ����� �հ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		
		// for��(���ѹݺ�)
		for(int i = 1;;i++) {
			sum += i;
			if(i == num)
				break;
		}
		System.out.println("sum : " + sum);
	}
	
	public void method3() {
		// ����ڿ��� �ݺ������� ���� �ΰ��� ���� ��ȣ(����)�� �Է� �ް�
		// �׿� �ش��ϴ� ����� ����ϱ�
		// ���� ���� �� ���� ��ȣ�� �Է����� �ʰ� �ٸ� ���� ��ȣ�� �Է����� ��� �ݺ� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
//			sc.nextLine();
			
			System.out.print("�����ȣ(+,-) : ");
//			String op = sc.nextLine();
			String op = sc.next();
			
			int result = 0;
			
			if(op.equals("+")) {
				result = num1 + num2;
			}else if(op.equals("-")) {
				result = num1 - num2;
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
			
			System.out.println("result : " + result);
		}
	}

}
