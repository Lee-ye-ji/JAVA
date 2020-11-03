package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// 1. 기본 생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
		// JVM의 기본 값 출력
		// 만약 값들을 초기화 하고 싶으면 일일히 setter 메소드를 이용해 값을 입력해야했음
		
		// 2. 매개변수 생성자로 객체 생성
		// -> 생성과 동시에 초기화 하는 방법
		User u2 = new User("user02", "pass02", "홍길동");
		System.out.println(u2.information());
		
		// 생성자는 기본 생성자 말고 다양한 매개변수 생성자를 만들 수 있음
		User u3 = new User("user03", "pass03", "삐약", 20, 'F');
		System.out.println(u3.information());
		
		

	}

}
