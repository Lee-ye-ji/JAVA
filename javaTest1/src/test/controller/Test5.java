package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// 문제 5
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :");
		int i =sc.nextInt();
		int j =sc.nextInt();
		
		int length = (int)(Math.log10(i*j)+1);

		if(i >= 1 && i <= 9 && j >= 1 && j <= 9) {
			if(length == 1) {
				System.out.println("한자리 수 입니다.");
			}else if(length == 2) {
				System.out.println("두자리 수 입니다.");
			}
		}else {
			System.out.println("1부터 9까지의 수만 입력해주세요.");
		}
	}

}
