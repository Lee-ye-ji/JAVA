package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/* do while문
	 * [초기식]
	 * do{
	 * 		실행할 코드;
	 * 		[증감식];
	 * }while(조건식);
	 * 
	 */
	
	public void method1() {
		// while문과 다른 점은 조건이 맞지 않아도
		// 반드시 한번은 수행을 먼저하고 조건 검사를 한다는 점
		
		int num = 0;
		do {
			System.out.println(num);
		}while(num != 0);
	}
	
	public void method2() {
		// 1부터 5까지 출력
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 5);
	}
	
	public void method3() {
		//1부터 랜덤 수(17~24)까지의 합 구하기
		
		int random = (int)(Math.random() * 8) + 17;
		System.out.println("랜덤 수: " + random);
		
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i <= random);
		
		System.out.println("1부터 " + random + "까지의 합계: " + sum);
	}
	
	public void method4() {
		// 사용자에게 문자열을 입력 받아서 각 인덱스 별 문자를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		// 입력 받은 문자열의 길이를 알려면 --> 문자열.length() 메소드 사용
		System.out.println("문자열의 길이: " + str.length());
		
		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;
		}while(i < str.length());
		
		//만약에 빈 문자열을 입력 받은 경우 오류 발생 -> do while문은 일단 한번 실행하고 조건을 확인하기 때문
		
	}

}
