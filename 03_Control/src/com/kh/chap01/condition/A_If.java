package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/* ���α׷��� �⺻������ ���������� ���������
	 * ���� �κ��� ���������� ���� �ؾ� �� ��
	 * �Ǵ� �ݺ������� ���� �ؾ� �� ��
	 * "���"�� �̿���
	 * 
	 * ���������� �����ϴ� ���ù� -> ���ǹ�
	 * �ݺ������� �����ϴ� �ݺ��� -> �ݺ���
	 * �� ���� �帧 ���� -> �б⹮
	 * 
	 * <���ǹ�>
	 * ���ǽ��� ���� ������ ���������� �Ǵ��ؼ�
	 * �ش� ������ �����ϴ� ��� �׿� �ش��ϴ� ���๮�� ����
	 * 
	 * -> ���ǽ��� ����� true/false�� �����̾����
	 * -> �񱳿�����(��� ��, ���� ��), ��������(&&, ||)�� ���ǽĿ��� �����
	 * 
	 * ���ǹ��� ũ�� if���� switch������ ������
	 * if���� ũ�� �������� ����
	 * 1. �ܵ� if��
	 * 2. if else��
	 * 3. if else if��
	 * */
	
	/*�ܵ� if��
	 * if(���ǽ�){
	 * 			���� �� �ڵ�;
	 * }
	 * 
	 * -> ���ǽ��� ��� ���� true(��)�� �߰�ȣ ({ })���� �ڵ� ����
	 * -> ���ǽ��� ��� ���� false(����)�� �ڵ� �������� �ʰ� �Ѿ
	 * */
	
	public void method1() {
		// ������ �ǽ� ���� 1, 2 : ��� , ���� , 0 �Ǻ��� if������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}
		
		if(num < 0) {
			System.out.println("������");
		}
		
		if(num == 0) {
			System.out.println("0�̴�");
		}
	}
	
	public void method2() {
		// �ǽ� ���� 3: ¦Ȧ �Ǻ��� if������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}
		
		if(num % 2 != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
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
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "���л�";
		}
		
		// M,m,F,f ���� �ٸ� ���ڸ� �Է����� ���� �߸� �Է��ϼ̽��ϴٶ�� ���
		if(gender != 'M' && gender !='m' && gender != 'F' && gender != 'f') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			// �� �� �Է� �޾��� ��� "�̴�."�� ������� �ʰ� ����
			// ȣ�� �� �޼ҵ带 �����ϰ� ���� �� return ���� ���
			return; //�� �ڵ带 ������ �� �޼ҵ� 3�� �ٷ� ����
		}
		
		System.out.println(student + "�̴�.");
	}
	
	public void method4() {
		// ���ο� ����
		// �Էµ� �̸��� ������ �´� �� Ȯ���ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		/*if(name == "�̿���") {
			System.out.println("�����Դϴ�.");
		}
		
		if(name != "�̿���") {
			System.out.println("������ �ƴմϴ�.");
		}*/
		
		/* �⺻�ڷ����� �� �ÿ� ==, != �� ���� ����񱳸� �� �� ������
		 * String�� �⺻�ڷ����� �ƴ� �����ڷ����̹Ƿ�
		 * String Ŭ�������� �����ϴ� equals() �޼ҵ带 ����ؼ� ���ؾ� ��
		 * */
		
		if(name.equals("�̿���")) {
			System.out.println("�����Դϴ�.");
		}
		
		if(!name.equals("�̿���")) {
			System.out.println("������ �ƴմϴ�.");
		}
	}

}
