package com.kh.chap01_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// -> toString()도 오버라이딩 되어있음
		
		System.out.println(str1 == str2); // false
		// -> 힙 영역에서 다른 공간에 생성되어 주소 값이 다르므로 주소 값 비교는 false
		// 주소 값 비교가 일어남
		
		System.out.println(str1.equals(str2)); // true
		// -> Object의 equals()가 호출 된다면 주소값 비교이므로 false가 나오겠지만
		// String 클래스에 equals()가 오버라이딩 되어서 실제 값 비교를 수행하므로 true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// -> hashCode()도 실제 값이 같으면 같은 hashCode값이 나오도록 오버라이딩 되어 있음
		
		// 오버라이딩 된 hashCode말고 실제 주소값을 알기 위해
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method2() {
		// 2. 문자열을 리터럴로 생성
		String str1 = "abc";
		String str2 = "abc";
		
		// 주소값 비교
		System.out.println(str1 == str2); // true
		// -> true
		// 생성자가 아닌 리터럴로 값을 초기화하면
		// Heap 영역에 있는 String pool로 값이 초기화 됨
		// 실제 값이 같으므로 equals(), hashCode() 또한 같은 값이 나올 것
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 실제 주소 값이 같으므로 동일 객체를 참조하고 있는 것을 알 수 있음
		
		// 만약 str2 값을 변경하려고 하면 해당 참조하고 있던 그 값이 변경이 될까?
		str2 = "bcd";
		
		System.out.println(System.identityHashCode(str2));
		// 해당 자리에서 값이 변경되는 게 아니라 새로운 공간에 값이 생기고 해당 주소를 가리키게 됨
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		// 다시 abc로 변경하게 되면 기존의 그 값을 가리키게 됨
		
		// 따라서 String클래스는 불변, 마치 상수와 같음.
	}

}
