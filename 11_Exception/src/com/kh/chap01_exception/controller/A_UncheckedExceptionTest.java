package com.kh.chap01_exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedExceptionTest {
	/*	* RuntimeException의 후손 Exception들
	 * - 프로그램 실행 시 발생되는 예외들
	 * -> 코드 개선을 통해 예외 처리 가능
	 * -> UncheckedException
	 * */
	
	// 여러가지 Exception을 발생시켜 테스트 해보기
	public void method1() {
		// 1. ArrayIndexOutofBoundException
		// : 배열의 접근에 잘못 된 인덱스 값을 사용하는 예외 상황
		int[] arr = new int[5];
		for(int i = 0; i </*=*/ arr.length; i++) {
			arr[i] = i; // arr[5]라는 배열의 인덱스를 넘어가는 접근으로 인해 exception 발생
		}
		
		// 2. NullPointerException
		// : 참조 변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외 상황
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[0][0]);
		// System.out.println(arr2[1][0]);
		
		// 3. ClassCastException
		// : 허용할 수 없는 형 변환이 진행되는 예외 상황
		String str = "1";
		Object obj = str;
		//Integer integer = (Integer)obj;
	}
	
	public void method2() {
		// 4. ArithmeticException
		// : 나누기 연산에서 부모가 0인 경우 발생하는 예외상황
		// 일반적으로 if문으로 0인지 검사 -> 여기서는 try~catch 사용해보기
		
		// try{} : 예외가 발생되는 구문 작성
		// catch(예외클래스 매개변수){} : 예외가 발생되는 경우 처리해야되는 구문 작성
		
		int ran = 0;
		double result = 0.0;
		
		for(int i = 0; i < 10; i++) {
			ran = (int)(Math.random() * 10); // 0~9사이의 난수 생성
			try {
				result = 10 / ran; // 0으로 나누는 경우 -> AritmeticException 발생
				// try 구문에서 에러가 발생하면 이후 코드 실행하지 않고 바로 catch 구문으로 감
				System.out.printf("ran : 10 / %d = %f\n", ran, result);	
			}catch(ArithmeticException e) {
				//e.printStackTrace();
				//System.out.println(e.getMessage());
				System.out.printf("ran : 10 / 0은 불가능합니다.\n");
			}
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		System.out.print("숫자 하나 입력 : ");
		
		try {
			int num = sc.nextInt();
			result = 10 / num;
			System.out.println("result : " + result);	
		}catch(ArithmeticException e) {
			System.out.println("0은 입력 불가 !!!");
		}catch(InputMismatchException e) {
			System.out.println("문자도 입력 불가 !!!");
		}catch(RuntimeException e) {
			System.out.println("모든 RuntimeException을 받아주마");
		}catch(Exception e) {
			System.out.println("모든 Exception을 받아주마");
		}
		
		// 다형성(자식 객체를 부모 타입 레퍼런스로 다루는 기술)을 적용하여
		// 부모 타입으로 Exception을 한번에 처리해도 되지만
		// 각각의 예외 발생에 해당하는 로직을 짜야할 경우에는 세분화해야함
		// 또한 상위 Exception 타입이 먼저 기술 되면 먼저 받아서 처리해버리기 떄문에
		// catch 블럭의 나열 순서에 유의(하위 타입부터 먼저 기재)
	}
	
	public void method4() {
		// 5. NegativeArraySizeExcpetion
		// : 배열 선언 과정에서 배열의 크기를 음수로 지정하는 예외 상황
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		
		int[] arr = null;
		
		//try {
		if(num > 0) {
			arr = new int[num];
		//}catch(NegativeArraySizeException e) {
		}else {
			System.out.println("양수를 입력해주세요");
		}
	}
	// RuntimeException의 경우 조건문을 통해서 애초에 예외가 발생하지 않도록 처리 가능 => 권장 사항
}
