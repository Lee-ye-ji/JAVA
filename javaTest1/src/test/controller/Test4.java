package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 문제 4
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int i = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int j = sc.nextInt();
		
		if(i > 0 && i < 10 && j > 0 && j < 10) {
			int sum = i + j;
			int sub = i - j;
			int mul = i * j;
			int div = i / j;
			
			System.out.println("합 : " + sum);
			System.out.println("차 : " + sub);
			System.out.println("곱 : " + mul);
			System.out.println("나누기 : " + div);

		}else {
			System.out.println("1자리 정수형(1부터 9까지만) 입력하세요.");
		}

	}

}
