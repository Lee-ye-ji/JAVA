package com.kh.chap03_wrapper.controller;

public class B_WrapperStringTest {
	// 문자열 -> 기본 자료형
	// 기본 자료형 -> 문자열
	public void method1() {
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); //1015.3 -> 문자열로 작업됨
		
		
		// 1. String -> 기본자료형으로 바꾸기 위해
		// 해당 Wrapper클래스.parse~() 메소드 사용
		byte b = Byte.parseByte(str1);
		short s = Short.parseShort(str1);
		int i = Integer.parseInt(str1);
		long l = Long.parseLong(str1);
		// -> 만약 str2(실수)를 넣으면 java.lang.NumberFormatException 발생
		
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		boolean bool = Boolean.parseBoolean("true");
		// -> true 혹은 false만 파싱 가능, 다른 문자열 넣으면 무조건 false로 파싱
		System.out.println("bool : " + bool);
		
		// char는 파싱하지 못하고 charAt()으로 문자 하나만 분리해냄
		char c = "abc".charAt(0);
		
		System.out.println(i + d); // 원하는 대로 정수 + 실수의 연산 수행
		
		// 2. 기본 자료형 -> String 
		// 해당 Wrapper클래스.valueOf().toString()
		String strB = Byte.valueOf(b).toString();
		
		// Wrapper 클래스가 아닌 String 클래스의 메소드 사용
		String strB2 = String.valueOf(b);
	}

}
