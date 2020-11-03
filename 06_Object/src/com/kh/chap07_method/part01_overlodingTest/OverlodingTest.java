package com.kh.chap07_method.part01_overlodingTest;

public class OverlodingTest {
	// 오버로딩
	public void test() {}
	
	public void test(int a) {}
	
	public void test(int a, String s) {}
	
	public void test(String s, int a) {}  // -> 매개 변수의 순서도 중요함
	
	public void test(int a , int b) {}
	
	//public void test(int c, int d) {} // 에러 발생 -> 매개변수명과는 상관 없이 자료형의 갯수의 순서가 다르게 작성 되어야 함
	
	public void test(int a, int b, String str) {
		System.out.println("test");
	}
	
	// 반환형이 다름
	/*public int test(int a, int b, String str) {
		return 0;
	}*/
	// 에러 발생 -> 반환형이 다르다고 오버로딩이 적용되지는 않음
	
	/*private void test(int a, int b, String str) {
		
	}*/
	// 에러 발생 -> 접근 제한자가 다르다고 오버로딩이 적용되지 않음
	
	// < 결론 >
	// 오버로딩은 메소드명이 같은 경우 발생하는 데 접근 제한자, 반환형과는 무관하게
	// 매개변수의 자료형 갯수, 순서가 다르게 작성되어야만 함.
	

}
