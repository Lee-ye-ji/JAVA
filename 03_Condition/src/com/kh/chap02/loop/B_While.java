package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/* while��
	 * 
	 * [�ʱ��]
	 * while(���ǽ�){
	 * 		������ �ڵ�;
	 * 		[������];
	 * }
	 */
	
	public void method1() {
		
		System.out.println("----- method 1 -----");
		
		// 1���� 5���� ����ϱ�
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}
	
	public void method2() {
		
		System.out.println("----- method 2 -----");
		
		// 10���� 1���� ����ϱ�
		int i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
	}
	
	public void method3() {
		
		System.out.println("----- method 3 -----");
		
		// 1���� 10������ Ȧ���� ����ϱ�
		// 1 3 5 7 9
		
		int i = 1;
		while(i <= 10) {
				System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("----- method 4 -----");
		
		// 1���� ���� ��(50~100)������ �� ���ϱ�
		int random = (int)(Math.random() * 51) + 50;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + random + "������ �� : " + sum);
	}
	
	public void method5() {
		
		System.out.println("----- method 5 -----");
		
		// ����ڿ��� ���ڿ��� �Է� �޾Ƽ� �� �ε��� �� ���ڸ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		// �Է� ���� ���ڿ��� ���̸� �˷��� --> ���ڿ�.length() �޼ҵ� ���
		System.out.println("���ڿ��� ����: " + str.length());
		
		// str.charAt(0)
		// str.charAt(1)
		// ...
		// str CharAt(���ڿ��� ����-1)
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
	
	//-----------------------��ø �ݺ��� --------------------
	
	public void method6() {
		
		System.out.println("----- method 6 -----");
		
		// 2�ܺ��� 9�ܱ��� ���
		
		int dan = 2;
		while(dan <= 9) {
			System.out.println("===" + dan + "��===");
			int su = 1;
			while(su <= 9) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				su++;
			}
//			System.out.println();
			dan++;
		}
	}
	
	public void method7() {
		
		System.out.println("----- method 7 -----");
		
		// �ð� 0�� 0�� ~ 23�� 59�� ���
		
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
			System.out.printf("%2d�� %2d��\n", hour, min);
			min++;
			}
			hour++;
		}
	}
	
	// -> ������ Ƚ����ŭ �ݺ��ϰ��� �Ҷ��� for���� �̿��ϴ� ���� ����
	// while���� �޴��� ����� ���α׷��� ����ؼ� ������ ������ �Ǵ��ϴ� �뵵�� �ַ� ����� ��
	
	
	public void method8() {
		
		System.out.println("----- method 8 -----");
		
		Scanner sc = new Scanner(System.in);
		
		//while���� ���ǿ� true�� ������ ����ؼ� �ݺ��ϴ� ���ѷ����� ���� �� ����
		while(true) {
			System.out.println("===== �޴� ====");
			System.out.println("1. 1���� 5���� ���");
			System.out.println("2. 10���� 1���� ���");
			System.out.println("3. 1���� 10���� Ȧ���� ���");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ����:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return; //�޼ҵ带 �����Ų�ٴ� �ǹ�
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
	
	public void method9() {
		
		System.out.println("----- method 9 -----");
		
		// ���ڿ� �Է� �ް� �Է� ���� ���ڿ� ��� -> �Է� ���� ���ڿ��� "exit"�� �ƴ� ������ �ݺ�
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		//str.equalsIgnoreCase("exit") ->��ҹ��ڸ� �������� �ʰ� ó���ϰڴٴ� �ǹ�
		while(!str.equals("exit") && !str.equals("EXIT")) {
			System.out.print("���ڿ��� �Է����ּ���: ");
			str = sc.nextLine();
			System.out.println("str: " + str);
		}
		System.out.println("exit �Է����� ����Ǿ����ϴ�.");
	}

}
