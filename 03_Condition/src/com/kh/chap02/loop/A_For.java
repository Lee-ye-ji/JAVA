package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/* 반복문 : 프로그램의 수행 흐름을 제어하는 제어문 중에 하나로
	 * 실행 코드를 반복적으로 수행시켜줌
	 * 크게 for문과 while문 두 종류로 나뉨
	 */
	
	/* for(초기식; 조건식; 증감식){
	 * 		실행할 코드;
	 * }
	 * 
	 *  초기식: 반복문이 수행 될 때 단 한번 수행되는 부분
	 *  		보통 반복문 안에서 사용 될 변수를 선언 및 초기화 하는 부분
	 *  조건식 : 반복문이 수행 될 조건을 작성할 부분
	 *  		조건식이 true인 경우 해당 코드를 실행
	 *  		조건식이 false가 되는 순간 반복을 멈추고 빠져 나옴
	 *  		보통 초기식에서 사용 된 변수를 가지고 조건식을 작성함
	 *  증감식 : 반복문을 제어하는 변수 값을 증감 시키는 부분
	 *  		증감 연산자(++,--)가 주로 사용 됨
	 * */
	
	public void method1() {
		
		System.out.println("===== method1 ====");
		
		// "안녕하세요" 10줄 출력
		for(int i=1; i<=10; i++) {
			System.out.println("안녕하세요");
		}
	}
	public void method2() {
		
		System.out.println("===== method2 ====");
		
		// 1부터 5까지 출력
		for(int i = 1; i <= 5; i++) { // 증감식의 i++ => 전위 연산을 하던 후위 연산을 하던 크게 상관 없음
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public void method3() {
		
		System.out.println("===== method3 ====");
		
		// 5부터 1까지 출력
		for(int i =5; i >= 1; i--) { // 증가(++) 연산자 뿐만 아니라 감소(--) 연산자도 사용 가능
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("===== method4 ====");
		
		// 1부터 10사이의 홀수 출력
		// 1 3 5 7 9
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { //홀수인 경우만 출력 되도록
				System.out.print(i+ " ");
			}
		}
		for(int i = 1; i <= 10 ;i+=2) { //증감식에는 증감연산자 외의 다른 식이 들어갈 수 있다.
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public void method5() {
		
		System.out.println("===== method5 ====");
		
		// 1부터 10까지 정수의 합계
		
		// 합계를 기록할 변수
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);
	}
	
	public void method6() {
		
		System.out.println("===== method6 ====");
		
		// 1부터 사용자가 키보드로 입력한 수까지의 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
//		System.out.println("1부터 사용자가 입력한 수까지의 합: " + sum);
		System.out.println("1부터 " + num + "까지의 합: " + sum);

	}
	
	public void method7() {
		
		System.out.println("===== method7 ====");
		
		// 구구단 2단 출력하기
		// 2*1 = 2
		// 2*2 = 4
		// 2*3 = 6
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		System.out.println();
	}
	
	public void method8() {

		System.out.println("===== method8 ====");
		
		//사용자에게 입력 받은 수에 해당하는 구구단 출력하기
		Scanner sc = new Scanner(System.in);;
		System.out.print("단 수를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		// if - 입력 된 숫자가 2~9사이의 숫자인지 먼저 확인
		if(dan >= 2 && dan <= 9) {
			for(int su = 1; su < 10; su++) {
				System.out.printf("%d * %d = %d\n" , dan, su, (dan * su));
			}

		}else {
			System.out.println("2~9사이의 값을 입력해여야합니다.");
		}
		System.out.println();
	}
	
	public void method9() {
		
		System.out.println("===== method9 ====");
		
		/* 1부터 어떤 랜덤 값(1부터 10사이의 랜덤 값)까지의 합계 구하기
		 * java.lang.Math 클래스에서 제공하는 random() 메소드
		 * 사용해서 랜덤 값 발생 시킬 수 있음
		 * java.lang 패키지는 import할 필요가 없음
		 * -> 컴파일러에 의해 import java.lang.*;이 생성됨
		 * */
		
		// Math.random() -> 0.0 ~ 0.999999.... 사이의 랜덤 값 발생
		// int random = Math.random();
		
		// 0.0 * 10 <= random < 1*10 -> 원하는 범위의 숫자를 곱한다.
		// 0 <= random < 10  -> 0 ~ 9의 수가 나옴
		// 0 + 1 <= random < 10 + 1 -> 원하는 시작 값에 맞추기 위해 더한다.
		// 1 <= random < 11 -> 1.0  <= random < 11.0
		// 1.0  <= random < 11.0 -> int로 형변환
		int random = (int)(Math.random() * 10) + 1;
		System.out.println("random:" + random);
		
		// 1부터 random 값 까지의 정수들의 합계
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1부터" + random + "까지의 합 :" + sum);
	}
	
	public void method10() {
		
		System.out.println("===== method10 ====");
		
		// 랜덤 구구단 출력
		// 2부터 9사이의 랜덤 값을 random 변수에 담고
		int random = (int)(Math.random() * 8) + 2;
		
		//random 단 출력
		System.out.println("===" + random + "단===");
		
		//반복문
		for(int i = 1; i< 10; i++) {
			System.out.println(random + "*" + i + "=" + (random * i)); 
		}
	}
	
	public void method11() {
		
		System.out.println("===== method11 ====");
		
		// 사용자에게 두 개의 정수 값 입력 받아
		// 작은 수부터 큰 수 까지의 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수: ");
		int num2 = sc.nextInt();
		
		// 2, 4 -> 2 3 4
		// 4, 2 -> 2 3 4
		
		int min = 0; // 입력 된 정수 중 작은 값을 저장할 변수
		int max = 0; // 입력 된 정수 중 큰 값을 저장할 변수
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "부터 " + max + "까지의 합 : " + sum);
	}
	
	// -------------------------- 중첩 반복문 ----------------------
	
	public void method12() {
		
		System.out.println("===== method12 ====");
		
		// 1부터 5까지 출력되는 문장 3줄 출력
		// 1 2 3 4 5 
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 1; i <= 3; i++) { // -> 1줄씩 출력을 3번 반복
			for(int j = 1; j <= 5; j++) { // 1~5까지 출력
				System.out.print(j+ " ");
			}
			System.out.println(); // 1~5 한번 출력 후 개행
		}
	}
	
	public void method13() {
		
		System.out.println("===== method13 ====");
		
		// 0시 0분 ~ 23시 59분 출력
		// 시 증가, 분 증가
		
		// 시 -> 0시부터 23시까지 증가 --> 외부 for문
		// 분 -> 0분부터 59분까지 증가  --> 내부 for문
		
		for(int hour = 0; hour <= 23; hour++) {
			for(int min = 0; min <= 59; min++) {
				System.out.println(hour + "시" + min + "분");
			}
		}
	}
	
	public void method14() {
		
		System.out.println("===== method14 ====");
		
		// 2단부터 9단까지 출력
		// 단 -> 2 ~ 9 --> 외부 for문
		// 수 -> 1 ~ 9 --> 내부 for문
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===" + dan + "단===");
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + "*" + su + "=" + (dan * su));
			}
		}
	}
	
	public void method15() {
		
		System.out.println("===== method15 ====");
		
		// ****
		// ****
		// ****
		// ****
		// ****
		
		// 행 -> 5개 --> 외부 for문
		// 열 -> 4개 --> 내부 for문
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print('*');
			}
			System.out.println(); //개행문
		}
		System.out.println();
	}
	
	public void method16() {
		
		System.out.println("===== method16 ====");
		
		// 1***
		// *2**
		// **3*
		// ***4
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); //개행문
		}
	}
	

}
