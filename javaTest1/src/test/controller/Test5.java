package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// ���� 5
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� :");
		int i =sc.nextInt();
		int j =sc.nextInt();
		
		int length = (int)(Math.log10(i*j)+1);

		if(i >= 1 && i <= 9 && j >= 1 && j <= 9) {
			if(length == 1) {
				System.out.println("���ڸ� �� �Դϴ�.");
			}else if(length == 2) {
				System.out.println("���ڸ� �� �Դϴ�.");
			}
		}else {
			System.out.println("1���� 9������ ���� �Է����ּ���.");
		}
	}

}
