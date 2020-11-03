package com.kh.chap07_method.part02_methodTest.run;

import com.kh.chap07_method.part02_methodTest.controller.NonstaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		// NonStaticeMethod test
		NonstaticMethod test = new NonstaticMethod();
		
		// 1. 매개변수와 반환 값이 없는 메소드 호출
		test.method1();
		
		// 2. 매개변수 없고 반환 값이 있는 메소드 호출
		// 그 반환형과 일치하는 자료형의 변수에 메소드 수행 후의 반환 값을 담아서 사용
		String str = test.method2();
		System.out.println(str);
		
		// 3. 매개변수가 있고 반환 값이 없는 메소드 호출
		test.method3(10, 20);
		// *** 반드시 전달 값은 매개변수의 타입과 순서와 갯수가 일치하는 값을 넘겨 주어야 함 ***
		
		// 4. 매개변수가 있고 반환 값이 있는 메소드 호출
		int result = test.method4(3, 5);
		System.out.println("result : " + result);
		
		
		// StaticMethod test
		// 객체 생성하지 않고 호출
		// 이미 프로그램 시작 시에 static 영역에 메소드가 저장 되어 있기 때문
		// 사용법을 클래스명.메소드명();
		StaticMethod.method1();
		
		System.out.println("10과 20의 합은" + StaticMethod.method2() + "입니다.");
		
		StaticMethod.method3("예딩");
		
		System.out.println(StaticMethod.method4("보로로"));
		
		
		
		
		
		
		
		

	}

}
