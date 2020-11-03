package com.kh.chap07_method.part02_methodTest.controller;

public class NonstaticMethod {
	// 매개변수 유무와 반환값 유무에 따른 구분
	
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		// 아무 값도 반환하지 않고 메소드 내용만 수행 후 메소드 종료
		System.out.println("매개변수와 반환 값이 둘 다 없는 메소드입니다.");
		
		// return; // 모든 메소드에 생략 되어 있음 (JVM이 자동 생성)
	}
	
	// 2. 매개변수 없고 반환 값이 있는 메소드
	public String method2() {
		String str = "매개변수가 없지만 반환 값이 있는 메소드 입니다.";
		return str;
	}
	
	// 3. 매개변수 있고 반환 값이 없는 메소드
	public void method3(int num1, int num2) {
		// 이 메소드를 호출하는 곳에서 전달한 값을 받기 위해 선언하는 것이 매개변수
		System.out.println(num1 - num2);
	}
	
	// 4. 매개변수 있고 반환 값도 있는 메소드
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	

}
