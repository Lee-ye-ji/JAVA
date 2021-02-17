package com.kh.chap01_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1() {
		String str ="Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 이용하여 문자열 분리
		
		// 방법 1. 분리된 문자열을 배열로 처리하고 싶을 떄
		// -> String 클래스의 split 메소드
		// split(String regex) : String[]
		String[] arr = str.split(",");
		
		System.out.println("분리 후 문자열의 갯수 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 방법 2. 분리 된 문자열들을 객체로 취급하고 싶을 때
		// -> java.util.StringTokenizer 클래스 이용
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		// countToken() : int -> 토큰 개수 리턴
		System.out.println("분리 후 문자열의 갯수 : " + stn.countTokens());
		
		/*int length = stn.countTokens();
		for(int i = 0; i < length; i++) {
			// nextToken() : String -> 다음 토큰 리턴, 이전 토큰 제거
			System.out.println(stn.nextToken());
		}*/
		
		 // hasMoreTokens() : boolean
		// -> 토큰이 남아있는지 확인
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		String str2 = "JAVA Oracle JDBC HTML CSS Spring";
		StringTokenizer stn2 = new StringTokenizer(str2);
		// 구획 문자를 인자로 받지 않으면 다폴트 구획문자는 공백
		
		System.out.println("==== 공백 제거  ====");
		while(stn2.hasMoreTokens()) {
			System.out.println(stn2.nextToken());
		}
		
		String str3 = "JAVA@Oracle!JDBC*HTML@CSS!Spring";
		StringTokenizer stn3 = new StringTokenizer(str3, "@!*");
		// 여러 개의 구획 문자를 인자로 받을 수 있음, 구획 문자는 길이가 1
		
		System.out.println("===== 구획 문자 여러 개 제거 =====");
		while(stn3.hasMoreTokens()) {
			System.out.println(stn3.nextToken());
		}
		
		// *** 만약 split으로 여러 개의 문자를 제거하고자 한다면? ***
		// split 메소드의 매개변수는 정규 표현식을 사용해야 함  -> 나중에 javascript에서 학습
		String[] arr2 = str3.split("[@!*]"); //[]표기하면 나누어짐
		for(String s : arr2) {
			System.out.println(s);
		}
		
		StringTokenizer stn4 = new StringTokenizer(str, ",", true);
		// boolean 매개변수를 추가하여 구획 문자도 토큰으로 저장할 수 있음
		// -> 기본 값은 false라 토큰으로 저장하지 않음
		
		System.out.println("===== 구획 문자도 토큰으로 저장 =====");
		while(stn4.hasMoreTokens()) {
			System.out.println(stn4.nextToken());
		}
		
		/* split()
		 * - 장점 : 정규 표현식 사용 가능 (다양한 패턴으로 쪼갤 수 있음)
		 * - 단점 : 속도가 느리다(정규 표현식 사용으로)
		 * 
		 * StringTokenizer
		 * - 장점 : 속도가 빠르다(다량의 데이터)
		 * - 단점 : 정규 표현식 사용 불가능(단순한 문자로만 쪼갤 수 있음 -> 원패턴)
		 */
		
	}

}
