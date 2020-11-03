package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/* while문
	 * 
	 * [초기식]
	 * while(조건식){
	 * 		실행할 코드;
	 * 		[증감식];
	 * }
	 */
	
	public void method1() {
		
		System.out.println("----- method 1 -----");
		
		// 1부터 5까지 출력하기
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}
	
	public void method2() {
		
		System.out.println("----- method 2 -----");
		
		// 10부터 1까지 출력하기
		int i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
	}
	
	public void method3() {
		
		System.out.println("----- method 3 -----");
		
		// 1에서 10사이의 홀수만 출력하기
		// 1 3 5 7 9
		
		int i = 1;
		while(i <= 10) {
				System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("----- method 4 -----");
		
		// 1부터 랜덤 값(50~100)까지의 합 구하기
		int random = (int)(Math.random() * 51) + 50;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	
	public void method5() {
		
		System.out.println("----- method 5 -----");
		
		// 사용자에게 문자열을 입력 받아서 각 인덱스 별 문자를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		// 입력 받은 문자열의 길이를 알려면 --> 문자열.length() 메소드 사용
		System.out.println("문자열의 길이: " + str.length());
		
		// str.charAt(0)
		// str.charAt(1)
		// ...
		// str CharAt(문자열의 길이-1)
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
	
	//-----------------------중첩 반복문 --------------------
	
	public void method6() {
		
		System.out.println("----- method 6 -----");
		
		// 2단부터 9단까지 출력
		
		int dan = 2;
		while(dan <= 9) {
			System.out.println("===" + dan + "단===");
			int su = 1;
			while(su <= 9) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				su++;
			}
//			System.out.println();
			dan++;
		}
	}
	
	public void method7() {
		
		System.out.println("----- method 7 -----");
		
		// 시계 0시 0분 ~ 23시 59분 출력
		
		int hour = 0;
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
			System.out.printf("%2d시 %2d분\n", hour, min);
			min++;
			}
			hour++;
		}
	}
	
	// -> 정해진 횟수만큼 반복하고자 할때는 for문을 이용하는 것이 편리함
	// while문은 메뉴를 만들어 프로그램을 계속해서 진행할 것인지 판단하는 용도로 주로 사용할 것
	
	
	public void method8() {
		
		System.out.println("----- method 8 -----");
		
		Scanner sc = new Scanner(System.in);
		
		//while문의 조건에 true를 넣으면 계속해서 반복하는 무한루프를 만들 수 있음
		while(true) {
			System.out.println("===== 메뉴 ====");
			System.out.println("1. 1부터 5까지 출력");
			System.out.println("2. 10부터 1까지 출력");
			System.out.println("3. 1부터 10까지 홀수만 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return; //메소드를 종료시킨다는 의미
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
	
	public void method9() {
		
		System.out.println("----- method 9 -----");
		
		// 문자열 입력 받고 입력 받은 문자열 출력 -> 입력 받은 문자열이 "exit"가 아닐 때까지 반복
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		//str.equalsIgnoreCase("exit") ->대소문자를 구분하지 않고 처리하겠다는 의미
		while(!str.equals("exit") && !str.equals("EXIT")) {
			System.out.print("문자열을 입력해주세요: ");
			str = sc.nextLine();
			System.out.println("str: " + str);
		}
		System.out.println("exit 입력으로 종료되었습니다.");
	}

}
