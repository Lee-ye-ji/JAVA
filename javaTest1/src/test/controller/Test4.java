package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// ���� 4
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int i = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int j = sc.nextInt();
		
		if(i > 0 && i < 10 && j > 0 && j < 10) {
			int sum = i + j;
			int sub = i - j;
			int mul = i * j;
			int div = i / j;
			
			System.out.println("�� : " + sum);
			System.out.println("�� : " + sub);
			System.out.println("�� : " + mul);
			System.out.println("������ : " + div);

		}else {
			System.out.println("1�ڸ� ������(1���� 9������) �Է��ϼ���.");
		}

	}

}
