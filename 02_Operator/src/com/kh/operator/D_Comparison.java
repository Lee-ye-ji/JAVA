package com.kh.operator;

public class D_Comparison {
	public void method1() {
		// 비교 연산자 (관계 연산자)
		// 두 값을 비교하는 연산자, 다른 말로 관계 연산자라고 함
		// 비교 연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환함
		
		//int a = 10, b =25;
		int a = 10;
		int b = 25;
		
		boolean result1 = (a == b);  //false
		boolean result2 = (a <= b);  //true
		boolean result3 = (a > b);  //false
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("a는 짝수인가 : " + (a % 2 == 0));
		System.out.println("b는 홀수인가 : " + (b % 2 == 1));
		
		System.out.println("a는 짝수인가 : " + (a % 2 != 1));
		System.out.println("b는 홀수인가 : " + (b % 2 != 0));
	}
}
