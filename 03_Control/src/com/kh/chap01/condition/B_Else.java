package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/* if-else 문
	 * if(조건식){
	 * 			실행 한 코드1;
	 * }else{
	 * 			실행 한 코드2;
	 * }
	 * 
	 * 조건식의 결과가 true인 경우 코드 1 수행 후 빠져나감
	 * 하지만 조건식의 결과가 false인 경우 무조건 코드 2 수행
	 */
	
	/* if-else if else문
	 * if(조건식1){
	 * 		실행할 코드1:
	 * else if(조건식2){
	 * 		실행할 코드2;
	 * }else{
	 * 		실행할 코드3;
	 * }
	 * 
	 * 조건이 다수 일 경우 사용하는 조건문으로
	 * 조건식 1의 결과가 true인 경우 코드 1을 수행하고 빠져나감
	 * 하지만 조건식1의 결과가 false인 경우 다음 조건식2 확인
	 * 조건식 2의 결과가 true인 경우 코드2를 수행하고 빠져나감
	 * 하지만 조건식 2의 결과가 false인 경우 무조건 코드 3 실행
	 */
	
	public void method1() {
		// A_If 클래스의 method1() : 양수, 음수 0 판별
		// 양수, 음수, 0 판별의 3개의 단독 if문은
		// if-else if-else 문으로 변경 가능
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}else if(num < 0) {
			System.out.println("음수다.");
		}else {
			System.out.println("0이다.");
		}
		// 단독 if문으로 구성하는 것보다 조건 확인 횟수가 줄어들게 되어 효율적
	}
	
	public void method2() {
		// A_If 클래스의 method2(): 짝홀 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		// 짝수 아니면 홀수 --> if-else
		if(num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}else {
			System.out.println("입력한 숫자는 홀수입니다.");
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
		}else if(gender == 'F' || gender == 'f') {
			student = "여학생";
		}else {
			// M,m,F,f 외의 다른 문자를 입력했을 때는 잘못 입력하셨습니다라고 출력
			System.out.println("잘못 입력하셨습니다.");
			// 잘 못 입력 받았을 경우 "이다."를 출력하지 않고 싶음
			// 호출 된 메소드를 종료하고 싶을 때 return 구문 사용
			return; //이 코드를 만났을 때 메소드 3은 바로 끝남
		}
		
		System.out.println(student + "이다.");
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 13세이하 - 어린이, 13세 초과 19세 이하 - 청소년, 19세 초과 - 성인
		
		String result = "";
		
		if(age <= 13) {
			result = "어린이";
		}else if(/*age > 13 &&*/ age <= 19) {  // else if 구문은 위의 if 구문의 조건은 만족하지 못하고 내려왔기 때문에
			result = "청소년";			   // if 문의 반대 조건을 내부적으로 포함하고 있음
		}else {
			result = "성인";
		}
		
		// if문의 조건에 범위 값을 작성 할 때 조건 순서 구성에도 유의할 것
		System.out.println(result);
	}
	
	public void method5() {
		// 사용자에게 정수를 입력 받아
		// 점수 별로 등급을 나눠 점수와 등급을 출력하는 메소드
		
		// 90점 이상은 A등급
		// 90점 미만 80점 이상 B등급
		// 80점 미만 70점 이상 C등급
		// 70점 미만 60점 이상 D등급
		// 60점 미만 F등급
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 "+ score + "이고, 등급은 "+ grade + "입니다.");
	}
	
	public void method6() {
		// 위의 문제에 각 등급 별 중간 점수 이상의 경우에는
		// 등급에 "+"라는 문자를 추가하여 출력하게 하자
		// 중첩 if문을 통해서 해결해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade += "+";
			}
		}else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade += "+";
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade += "+";
			}
		}else if(score >= 60) {
			grade = "D";
			if(score >= 65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 "+ score + "이고, 등급은 "+ grade + "입니다.");
	}

}
