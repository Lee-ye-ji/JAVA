package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/* �ݺ��� : ���α׷��� ���� �帧�� �����ϴ� ��� �߿� �ϳ���
	 * ���� �ڵ带 �ݺ������� ���������
	 * ũ�� for���� while�� �� ������ ����
	 */
	
	/* for(�ʱ��; ���ǽ�; ������){
	 * 		������ �ڵ�;
	 * }
	 * 
	 *  �ʱ��: �ݺ����� ���� �� �� �� �ѹ� ����Ǵ� �κ�
	 *  		���� �ݺ��� �ȿ��� ��� �� ������ ���� �� �ʱ�ȭ �ϴ� �κ�
	 *  ���ǽ� : �ݺ����� ���� �� ������ �ۼ��� �κ�
	 *  		���ǽ��� true�� ��� �ش� �ڵ带 ����
	 *  		���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ���� ����
	 *  		���� �ʱ�Ŀ��� ��� �� ������ ������ ���ǽ��� �ۼ���
	 *  ������ : �ݺ����� �����ϴ� ���� ���� ���� ��Ű�� �κ�
	 *  		���� ������(++,--)�� �ַ� ��� ��
	 * */
	
	public void method1() {
		
		System.out.println("===== method1 ====");
		
		// "�ȳ��ϼ���" 10�� ���
		for(int i=1; i<=10; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	public void method2() {
		
		System.out.println("===== method2 ====");
		
		// 1���� 5���� ���
		for(int i = 1; i <= 5; i++) { // �������� i++ => ���� ������ �ϴ� ���� ������ �ϴ� ũ�� ��� ����
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public void method3() {
		
		System.out.println("===== method3 ====");
		
		// 5���� 1���� ���
		for(int i =5; i >= 1; i--) { // ����(++) ������ �Ӹ� �ƴ϶� ����(--) �����ڵ� ��� ����
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("===== method4 ====");
		
		// 1���� 10������ Ȧ�� ���
		// 1 3 5 7 9
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { //Ȧ���� ��츸 ��� �ǵ���
				System.out.print(i+ " ");
			}
		}
		for(int i = 1; i <= 10 ;i+=2) { //�����Ŀ��� ���������� ���� �ٸ� ���� �� �� �ִ�.
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public void method5() {
		
		System.out.println("===== method5 ====");
		
		// 1���� 10���� ������ �հ�
		
		// �հ踦 ����� ����
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println("1���� 10������ ��: " + sum);
	}
	
	public void method6() {
		
		System.out.println("===== method6 ====");
		
		// 1���� ����ڰ� Ű����� �Է��� �������� �հ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
//		System.out.println("1���� ����ڰ� �Է��� �������� ��: " + sum);
		System.out.println("1���� " + num + "������ ��: " + sum);

	}
	
	public void method7() {
		
		System.out.println("===== method7 ====");
		
		// ������ 2�� ����ϱ�
		// 2*1 = 2
		// 2*2 = 4
		// 2*3 = 6
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		System.out.println();
	}
	
	public void method8() {

		System.out.println("===== method8 ====");
		
		//����ڿ��� �Է� ���� ���� �ش��ϴ� ������ ����ϱ�
		Scanner sc = new Scanner(System.in);;
		System.out.print("�� ���� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		// if - �Է� �� ���ڰ� 2~9������ �������� ���� Ȯ��
		if(dan >= 2 && dan <= 9) {
			for(int su = 1; su < 10; su++) {
				System.out.printf("%d * %d = %d\n" , dan, su, (dan * su));
			}

		}else {
			System.out.println("2~9������ ���� �Է��ؿ����մϴ�.");
		}
		System.out.println();
	}
	
	public void method9() {
		
		System.out.println("===== method9 ====");
		
		/* 1���� � ���� ��(1���� 10������ ���� ��)������ �հ� ���ϱ�
		 * java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ�
		 * ����ؼ� ���� �� �߻� ��ų �� ����
		 * java.lang ��Ű���� import�� �ʿ䰡 ����
		 * -> �����Ϸ��� ���� import java.lang.*;�� ������
		 * */
		
		// Math.random() -> 0.0 ~ 0.999999.... ������ ���� �� �߻�
		// int random = Math.random();
		
		// 0.0 * 10 <= random < 1*10 -> ���ϴ� ������ ���ڸ� ���Ѵ�.
		// 0 <= random < 10  -> 0 ~ 9�� ���� ����
		// 0 + 1 <= random < 10 + 1 -> ���ϴ� ���� ���� ���߱� ���� ���Ѵ�.
		// 1 <= random < 11 -> 1.0  <= random < 11.0
		// 1.0  <= random < 11.0 -> int�� ����ȯ
		int random = (int)(Math.random() * 10) + 1;
		System.out.println("random:" + random);
		
		// 1���� random �� ������ �������� �հ�
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1����" + random + "������ �� :" + sum);
	}
	
	public void method10() {
		
		System.out.println("===== method10 ====");
		
		// ���� ������ ���
		// 2���� 9������ ���� ���� random ������ ���
		int random = (int)(Math.random() * 8) + 2;
		
		//random �� ���
		System.out.println("===" + random + "��===");
		
		//�ݺ���
		for(int i = 1; i< 10; i++) {
			System.out.println(random + "*" + i + "=" + (random * i)); 
		}
	}
	
	public void method11() {
		
		System.out.println("===== method11 ====");
		
		// ����ڿ��� �� ���� ���� �� �Է� �޾�
		// ���� ������ ū �� ������ �հ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		
		// 2, 4 -> 2 3 4
		// 4, 2 -> 2 3 4
		
		int min = 0; // �Է� �� ���� �� ���� ���� ������ ����
		int max = 0; // �Է� �� ���� �� ū ���� ������ ����
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "���� " + max + "������ �� : " + sum);
	}
	
	// -------------------------- ��ø �ݺ��� ----------------------
	
	public void method12() {
		
		System.out.println("===== method12 ====");
		
		// 1���� 5���� ��µǴ� ���� 3�� ���
		// 1 2 3 4 5 
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 1; i <= 3; i++) { // -> 1�پ� ����� 3�� �ݺ�
			for(int j = 1; j <= 5; j++) { // 1~5���� ���
				System.out.print(j+ " ");
			}
			System.out.println(); // 1~5 �ѹ� ��� �� ����
		}
	}
	
	public void method13() {
		
		System.out.println("===== method13 ====");
		
		// 0�� 0�� ~ 23�� 59�� ���
		// �� ����, �� ����
		
		// �� -> 0�ú��� 23�ñ��� ���� --> �ܺ� for��
		// �� -> 0�к��� 59�б��� ����  --> ���� for��
		
		for(int hour = 0; hour <= 23; hour++) {
			for(int min = 0; min <= 59; min++) {
				System.out.println(hour + "��" + min + "��");
			}
		}
	}
	
	public void method14() {
		
		System.out.println("===== method14 ====");
		
		// 2�ܺ��� 9�ܱ��� ���
		// �� -> 2 ~ 9 --> �ܺ� for��
		// �� -> 1 ~ 9 --> ���� for��
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===" + dan + "��===");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + "*" + su + "=" + (dan * su));
			}
		}
	}
	
	public void method15() {
		
		System.out.println("===== method15 ====");
		
		// ****
		// ****
		// ****
		// ****
		// ****
		
		// �� -> 5�� --> �ܺ� for��
		// �� -> 4�� --> ���� for��
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print('*');
			}
			System.out.println(); //���๮
		}
		System.out.println();
	}
	
	public void method16() {
		
		System.out.println("===== method16 ====");
		
		// 1***
		// *2**
		// **3*
		// ***4
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); //���๮
		}
	}
	

}
