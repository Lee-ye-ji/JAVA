package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/* if-else ��
	 * if(���ǽ�){
	 * 			���� �� �ڵ�1;
	 * }else{
	 * 			���� �� �ڵ�2;
	 * }
	 * 
	 * ���ǽ��� ����� true�� ��� �ڵ� 1 ���� �� ��������
	 * ������ ���ǽ��� ����� false�� ��� ������ �ڵ� 2 ����
	 */
	
	/* if-else if else��
	 * if(���ǽ�1){
	 * 		������ �ڵ�1:
	 * else if(���ǽ�2){
	 * 		������ �ڵ�2;
	 * }else{
	 * 		������ �ڵ�3;
	 * }
	 * 
	 * ������ �ټ� �� ��� ����ϴ� ���ǹ�����
	 * ���ǽ� 1�� ����� true�� ��� �ڵ� 1�� �����ϰ� ��������
	 * ������ ���ǽ�1�� ����� false�� ��� ���� ���ǽ�2 Ȯ��
	 * ���ǽ� 2�� ����� true�� ��� �ڵ�2�� �����ϰ� ��������
	 * ������ ���ǽ� 2�� ����� false�� ��� ������ �ڵ� 3 ����
	 */
	
	public void method1() {
		// A_If Ŭ������ method1() : ���, ���� 0 �Ǻ�
		// ���, ����, 0 �Ǻ��� 3���� �ܵ� if����
		// if-else if-else ������ ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����.");
		}else if(num < 0) {
			System.out.println("������.");
		}else {
			System.out.println("0�̴�.");
		}
		// �ܵ� if������ �����ϴ� �ͺ��� ���� Ȯ�� Ƚ���� �پ��� �Ǿ� ȿ����
	}
	
	public void method2() {
		// A_If Ŭ������ method2(): ¦Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		// ¦�� �ƴϸ� Ȧ�� --> if-else
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		}else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
	}
	
	public void method3() {
		// �ǽ����� 5: ���� �Է� �޾� ���л����� ���л����� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("����(M/F): ");
		char gender = sc.next().charAt(0);
		
		String student = "";
		// ���ڿ� �������� �ʱ�ȭ�صα�
		
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		}else if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}else {
			// M,m,F,f ���� �ٸ� ���ڸ� �Է����� ���� �߸� �Է��ϼ̽��ϴٶ�� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			// �� �� �Է� �޾��� ��� "�̴�."�� ������� �ʰ� ����
			// ȣ�� �� �޼ҵ带 �����ϰ� ���� �� return ���� ���
			return; //�� �ڵ带 ������ �� �޼ҵ� 3�� �ٷ� ����
		}
		
		System.out.println(student + "�̴�.");
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		// 13������ - ���, 13�� �ʰ� 19�� ���� - û�ҳ�, 19�� �ʰ� - ����
		
		String result = "";
		
		if(age <= 13) {
			result = "���";
		}else if(/*age > 13 &&*/ age <= 19) {  // else if ������ ���� if ������ ������ �������� ���ϰ� �����Ա� ������
			result = "û�ҳ�";			   // if ���� �ݴ� ������ ���������� �����ϰ� ����
		}else {
			result = "����";
		}
		
		// if���� ���ǿ� ���� ���� �ۼ� �� �� ���� ���� �������� ������ ��
		System.out.println(result);
	}
	
	public void method5() {
		// ����ڿ��� ������ �Է� �޾�
		// ���� ���� ����� ���� ������ ����� ����ϴ� �޼ҵ�
		
		// 90�� �̻��� A���
		// 90�� �̸� 80�� �̻� B���
		// 80�� �̸� 70�� �̻� C���
		// 70�� �̸� 60�� �̻� D���
		// 60�� �̸� F���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("����� ������ "+ score + "�̰�, ����� "+ grade + "�Դϴ�.");
	}
	
	public void method6() {
		// ���� ������ �� ��� �� �߰� ���� �̻��� ��쿡��
		// ��޿� "+"��� ���ڸ� �߰��Ͽ� ����ϰ� ����
		// ��ø if���� ���ؼ� �ذ��غ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade += "+";
			}
		}else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade += "+";
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade += "+";
			}
		}else if(score >= 60) {
			grade = "D";
			if(score >= 65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.println("����� ������ "+ score + "�̰�, ����� "+ grade + "�Դϴ�.");
	}

}
