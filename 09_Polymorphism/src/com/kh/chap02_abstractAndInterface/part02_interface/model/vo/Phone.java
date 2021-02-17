package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Phone {
	// 추상클래스 => 일반 멤버(변수 + 메소드) + 추상 메소드
	// 인터페이스 => 오직 상수 필드 + 추상 메소드
	
	// 인터페이스에서의 필드는 무조건 상수 필드
	/*public static final*/ int NUM = 10; // 상수 필드 선언
	// -> 생략 하더라도 명시적으로는 가능!
	
	// 인터페이스에서의 메소드는 항상 추상 메소드
	/*public abstract*/ void makeaCall(); // 전화 걸기
	/*일반 전화 : 번호를 누름, 
	 * 휴대전화 : 번호를 누르고 통화 버튼을 누름*/
	
	void takeaCall(); // 전화 받기
	/*일반 전화 : 수화기를 듦, 
	 * 휴대전화 : 수신 버튼을 누름*/

}
