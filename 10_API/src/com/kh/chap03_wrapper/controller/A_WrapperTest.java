package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	
	/* Wrapper 클래스
	 * => 기본 자료형을 객체로 포장해주는 클래스
	 * => 기본 자료형으로 사용해도 되지만 프로그램에 따라서 해당 기본 타입을 객체로 취급해야 하는 경우가 있음
	 * 
	 * 기본 자료형 		Wrapper 클래스
	 * boolean		Boolean
	 * char 		Character
	 * byte 		Byte
	 * short		Short
	 * int			Integer
	 * long			Long
	 * float		Float
	 * double		Double
	 * 
	 */
	
	public void method1() {
		// Boxing : 기본 자료형 -> Wrapper 클래스
		int num1 = 10;
		int num2 = 10;
		
		// 1. 객체 생성을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(num1 == num2);  // 기본 자료형 비교(값 비교) -> true
		System.out.println(i1 == i2);		// 객체 비교(주소값 비교) -> false
		
		// 객체로 변경하면 해당 클래스의 메소드 사용 가능
		System.out.println(i1.equals(i2)); 	// 값 비교를 위해 Object의 equals 오버라이딩하여 구현
		System.out.println(i1.compareTo(i2)); 
		// -> 두 값을 비교해서 앞쪽이 크면 1반환, 뒤쪽이 크면 -1반환, 같으면 0반환
		
		// 2. 객체 생성을 하지 않고 바로 대입(Auto Boxing)
		Integer i3 = num2;
		
		// 객체 생성을 통해 Boxing하게 되면 문자열도 넣을 수 있음
		// -> 문자열을 숫자화 시켜줌. 단, 문자열에 정수가 아닌 값이 있으면 오류 발생
		Integer i4 = new Integer("123");
		System.out.println(i4);
		
		// UnBoxing : Wrapper 클래스 -> 기본 자료형
		
		// 1. Wrapper 클래스의 ~Value() 메소드 사용
		int num3 = i1.intValue();
		int num4 = i2.intValue();
		
		// 2. 메소드 사용하지 않고 바로 대입(Auto UnBoxing)
		int num5 = i1;
		
		
	}

}
