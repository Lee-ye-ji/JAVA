package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		System.out.println("-----����_�ǽ����� 1-----");
		
		Scanner user = new Scanner(System.in);
		
		//�̸�
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = user.nextLine();
		
		//����
		System.out.print("���̸� �Է��ϼ���: ");
		int age = user.nextInt();
		user.nextLine(); // -> ���� ���� �뵵�� ���
		
		//����
		System.out.print("������ �Է��ϼ���(��/��): ");
		char gender = user.nextLine().charAt(0);
		
		//Ű
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		double height = user.nextDouble();
		
		System.out.print("\n");
		
		System.out.println("Ű  " +  height + "��  " + age + "��  " 
		+ gender + "��  " + name + "�� �ݰ����ϴ�^^");
	}
	
	public void method2() {
		
		System.out.println("\n-----����_�ǽ����� 2-----");
		
		int iNum1;
		int iNum2;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		iNum1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		iNum2 = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.println("���ϱ� ���: " + (iNum1+iNum2) );
		System.out.println("���� ���: " + (iNum1-iNum2) );
		System.out.println("���ϱ� ���: " + (iNum1*iNum2) );
		System.out.println("������ �� ���: "+ (iNum1/iNum2));
		
	}
	
	public void method3() {
		
		System.out.println("\n-----����_�ǽ����� 3-----");
		
		Scanner square = new Scanner(System.in);
		
		System.out.print("����: ");
		double width = square.nextDouble();
		
		System.out.print("����: ");
		double height = square.nextDouble();
		
		// ���� = ���� * ����
		double area = width * height;
		// �ѷ� = (���� + ����) * 2
		double circumference = (width + height) * 2;
		
		System.out.print("\n");
		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + circumference);
	}
	
	public void method4() {
		
		System.out.println("\n-----����_�ǽ����� 3-----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.nextLine();
		
		System.out.println("ù ��° ����: "+ word.charAt(0));
		System.out.println("�� ��° ����: "+ word.charAt(1));
		System.out.println("�� ��° ����: "+ word.charAt(2));
	}

}
