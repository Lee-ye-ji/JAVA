package com.kh.chap04_field.model.vo;

// 클래스 변수 (static 변수)에 대해서 알아보기
public class FieldTest3 {
	
	// 전역 변수의 일종인 클래스 변수는 static 예약어가 붙은 변수를 말함
	// static 키워드가 붙으면 프로그램 실행 하자마자 static 메모리 영역에 할당 됨
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// static 변수는 FieldTest3라는 클래스(를)로 찍어낸 모든 객체들이 "공유"하는 차원
	// 객체 생성 할 필요 없이 프로그램 실행하자마자 static 메모리 영역에 할당됨
	
	public FieldTest3() {}
		
		// private를 위한 getter/setter 메소드
		
		/*public void setPriSta(String priSta) {
			this.priSta = priSta;
		}*/
		// static은 객체 생성을 하지 않아도 프로그램 실행과 동시에 static 영역에 할당됨
		// 즉, this를 붙이지 않음
		public static void setPriSta(String priSta) {
			FieldTest3.priSta = priSta;
		}
		
		public static String getPriSta() {
			return priSta;
		}

}
