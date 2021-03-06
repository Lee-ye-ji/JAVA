package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자 : 항목이 3개인 연산자
	// 조건식 ? 조건식이 참인 경우 식1 : 조건식이 거짓인 경우 식2;
	// 이 때 조건식은 반드시 true, false가 나오게끔 작성해야함
	
	public void method1() {
		//입력 받은 정수가 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력: ");
		int num = sc.nextInt();
		
		String result = (num > 0 ) ? "양수이다" : "음수이다";
		System.out.println(num + "은 " + result);
	}
	
	public void method2() {
		// 입력받은 정수가 홀수인지 짝수인지 판별 후 출력
		Scanner input = new Scanner(System.in);
		System.out.print("값 입력: ");
		int number = input.nextInt();
		
		String result = (number % 2 == 0) ? "짝수이다" : "홀수이다";
		System.out.println(number + "은 " + result);
	}
	
	public void method3() {
		// 삼항 연산자의 중첩 사용
		// 입력 받은 정수가 0인지 아닌지 판별 후
		// 0이 아닌 경우 양수인지 음수인지 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력: ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0이다" : ((num > 0) ? "양수이다" : "음수이다");
		System.out.println(num + "은 " + result);
	}

}
