package com.kh.chap01_string.controller;

public class D_BuilderBufferTest {
	/* * String 클래스 -> 불변
	 * 계속 값을 변경하는 경우 가비지컬렉터가 계속 참조되지 않는 문자열을 지워줘야하는 단점
	 * -> 변경이 적고 읽어오기만 하는 경우 String 클래스 용이
	 * 
	 * * StringBuffer, StringBuilder -> 가변(변하는)클래스
	 * - 변경과 저장을 위한 메모리 공간(버퍼)를 내부에 지니는데 처음에는 16개의 문자를 지정할 수 있는 버퍼가 생성되고
	 * 	 문자가 저장 됨에 따라 자동으로 증가
	 * - 초기 버퍼 크기를 지정할 수 있고 문자열의 길이보다 16개의 문자를 더 저장할 수 있음 
	 */
	
	public void method1() {
		// StringBuffer, StringBulider 두 개 모두 생성자/ 메소드 동일하지만
		// 차이점은 동기화 처리가 되느냐 안되느냐의 차이
		
		// StringBuffer는 동기화 처리 O (Thread safe)
		// StringBuilder는 동기화 처리 X
		
		// 멀티 스레드 환경 -> 동기화 처리가 되어야 안전함 -> StringBuffer 사용 권장
		// 단일 스레드 환경 -> 동기화 처리를 하면 속도 저하 발생 -> StringBuilder 사용 권장
		
		// 우리는 StringBuilder로 작업 StringBuffer로 객체만 변경하면 동일하게 메소드 사용 가능
		
		// 기본 생성자로 생성하게 되면 기본으로 16 크기 만큼 생성
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 수용량 : " + sb1.capacity()); // 정해진 기본 수용량 : 16
		System.out.println("sb1 길이 : " + sb1.length()); // 들어있는 문자열의 길이 
		System.out.println("=======================");
		
		// 매개변수로 정수 값을 전달해주면 해당 크기 만큼의 수용량이 지정 됨
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 수용량 :" + sb2.capacity());
		System.out.println("sb2 길이 :" + sb2.length());
		System.out.println("========================");
		
		// 매개변수로 문자열을 전달해주면 해당 문자열의 길이 + 16만큼의 수용량이 지정
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("sb3 수용량 :" + sb3.capacity());
		System.out.println("sb3 길이 :" + sb3.length());
		System.out.println("========================");
	}
	
	public void method2() {
		// 불변 가변 테스트
		
		// String
		String str = "반가워";
		System.out.println(System.identityHashCode(str));
		
		str += "난 String이얌";
		System.out.println(System.identityHashCode(str));
		// 불변 -> 새로 생성되면서 참조하고 있는 주소 값이 바뀌는 형태
		System.out.println("========================");
		
		//stringBuilder
		StringBuilder sb = new StringBuilder("반가워!");
		
		System.out.println("sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :" + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=========================");
		
		
		// StringBuilder에서 값을 변경하고자 할때는 메소드를 통해서 작업
		// 1. append(String str): StringBuilder -> 문자열 추가
		sb.append("안녕!");
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :" + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=========================");
		// -> 주소값이 변동되지 않는 것을 확인할 수 있음
		// 즉 가변 객체임(기존 객체가 가진 문자열 값에서 수정이 일어남)
		
		sb.append("다들 조금만 힘내세요!!!");
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :" + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=========================");
		
		// 2. delete(int start, int end) : StringBuilder -> 문자열 삭제
		sb.delete(2, 5);
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :" + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=========================");
		// 2, 3, 4 인덱스에 해당하는 문자 삭제 됨
		
		// 3. insert(int offset, String str) : StringBuilder -> 문자열 삽입
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :" + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=========================");
		
		// 4. reverse() : StringBuilder -> 역으로 바꾸는
		sb.reverse();
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :" + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("=========================");
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("JavaProgram");
		
		
		sb.append("API").delete(4, 11).reverse();
		System.out.println(sb);
		
		// 메소드 반환형이 모두 StringBuilder이므로 메소드를 이어서 호출 할 수 있음
		// -> 해당 메소드의 결과로 sb 주소값이 반환되기 떄문
		// -> 메소드 체이닝(메소드 이어쓰기)
		
	}
	

}
