package test.controller;

import java.util.Scanner;

public class Test1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 문제 1
		while(true) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			
			if(num >= 1 && num <= 100) {
				if(num % 2 == 0) {
					System.out.println("2의 배수 입니다.");
				}else {
					System.out.println("2의 배수가 아닙니다.");
				}
			}else {
				System.out.println("1에서 100사이의 값이 아닙니다.");
				System.out.println("종료");
				break;
			}
		}

	}

}
