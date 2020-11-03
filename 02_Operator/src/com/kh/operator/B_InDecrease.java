package com.kh.operator;

public class B_InDecrease {
	public void method1(){
		// 증감 연산자
		// ++ : 1 증가 시키는 연산자
		// -- : 1 감소 시키는 연산자
		// 전위 연산, 후위 연산 구분
		
		//전위 연산
		int a = 10;
		int b = ++a;
		System.out.println("a: " + a + " b: "+ b); // a => 11, b => 11
		
		//후위 연산
		int c = 10;
		int d = c++; //후위 연산은 다른 연산이 일어난 후 실행 되므로 c의 값이 d에 대입 된 후 증가가 일어난다.
		System.out.println("c: " + c + " d: " + d ); // c => 11, d => 10
		
		int num1 = 20;
		int result = num1++ * 3; // 20 * 3 후 대입 result => 60, 이후 후위 연산 ++ num1 => 21
		// 후위 연산은 다른 연산이 일어난 뒤 실행 된다.
		
		System.out.println("result: " + result);
		System.out.println("num1: " + num1 );
		
	}

}
