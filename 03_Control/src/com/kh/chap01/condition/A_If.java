package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/* 프로그램은 기본적으로 순차적으로 진행되지만
	 * 실행 부분을 선택적으로 실행 해야 할 때
	 * 또는 반복적으로 실행 해야 할 때
	 * "제어문"을 이용함
	 * 
	 * 선택적으로 실행하는 선택문 -> 조건문
	 * 반복적으로 실행하는 반복문 -> 반복문
	 * 그 외의 흐름 제어 -> 분기문
	 * 
	 * <조건문>
	 * 조건식을 통해 참인지 거짓인지를 판단해서
	 * 해당 조건이 만족하는 경우 그에 해당하는 실행문을 실행
	 * 
	 * -> 조건식의 결과는 true/false의 논리값이어야함
	 * -> 비교연산자(대소 비교, 동등 비교), 논리연산자(&&, ||)를 조건식에서 사용함
	 * 
	 * 조건문은 크게 if문과 switch문으로 나뉘며
	 * if문은 크게 세가지로 나뉨
	 * 1. 단독 if문
	 * 2. if else문
	 * 3. if else if문
	 * */
	
	/*단독 if문
	 * if(조건식){
	 * 			실행 할 코드;
	 * }
	 * 
	 * -> 조건식의 결과 값이 true(참)면 중괄호 ({ })안의 코드 실행
	 * -> 조건식의 결과 값이 false(거짓)면 코드 실행하지 않고 넘어감
	 * */
	
	public void method1() {
		// 연산자 실습 문제 1, 2 : 양수 , 음수 , 0 판별을 if문으로 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num < 0) {
			System.out.println("음수다");
		}
		
		if(num == 0) {
			System.out.println("0이다");
		}
	}
	
	public void method2() {
		// 실습 문제 3: 짝홀 판별을 if문으로 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
	}
	
	public void method3() {
		// 실습문제 5: 성별 입력 받아 남학생인지 여학생인지 구별
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		
		String student = "";
		// 문자열 공백으로 초기화해두기
		
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}
		
		if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}
		
		// M,m,F,f 외의 다른 문자를 입력했을 때는 잘못 입력하셨습니다라고 출력
		if(gender != 'M' && gender !='m' && gender != 'F' && gender != 'f') {
			System.out.println("잘못 입력하셨습니다.");
			// 잘 못 입력 받았을 경우 "이다."를 출력하지 않고 싶음
			// 호출 된 메소드를 종료하고 싶을 때 return 구문 사용
			return; //이 코드를 만났을 때 메소드 3은 바로 끝남
		}
		
		System.out.println(student + "이다.");
	}
	
	public void method4() {
		// 새로운 예시
		// 입력된 이름이 본인이 맞는 지 확인하는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		/*if(name == "이예지") {
			System.out.println("본인입니다.");
		}
		
		if(name != "이예지") {
			System.out.println("본인이 아닙니다.");
		}*/
		
		/* 기본자료형은 비교 시에 ==, != 와 같은 동등비교를 할 수 있지만
		 * String은 기본자료형이 아닌 참조자료형이므로
		 * String 클래스에서 제공하는 equals() 메소드를 사용해서 비교해야 함
		 * */
		
		if(name.equals("이예지")) {
			System.out.println("본인입니다.");
		}
		
		if(!name.equals("이예지")) {
			System.out.println("본인이 아닙니다.");
		}
	}

}
