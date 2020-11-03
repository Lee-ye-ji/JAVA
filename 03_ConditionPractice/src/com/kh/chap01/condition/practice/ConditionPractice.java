package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ex\n"
				+ "1.입력\n"
				+ "2.수정\n"
				+ "3.조회\n"
				+ "4.삭제\n"
				+ "9.종료\n"
				+ "메뉴를 입력하세요 : ");
		int menuNum = sc.nextInt();
		
		String manual = ""; 
		switch(menuNum) {
		case 1:
			manual = "입력";
			break;
		case 2:
			manual = "수정";
			break;
		case 3:
			manual = "조회";
			break;
		case 4:
			manual = "삭제";
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			return;
		default:
			System.out.println("잘못된 번호 입력입니다.");
			return;
		}
		System.out.println( manual + " 메뉴입니다.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		int integer = sc.nextInt();
		
		if(integer > 0) {
			if(integer % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int korean = sc.nextInt();
		
		System.out.println("수학점수: ");
		int math = sc.nextInt();
		
		System.out.println("영어점수: ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double avg = sum / 3;
		
		if(korean >= 40 && math >=40 && english >= 40) {
			if(avg >= 60) {
				System.out.println(
						"국어: " + korean + "\n"+
						"수학: " + math + "\n"+
						"영어: " + english + "\n"+
						"합계: " + sum + "\n"+
						"평균: " + avg 
						);
				System.out.println("축하합니다, 합격입니다!");
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력:");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println( month +"월은 겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println( month +"월은 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println( month +"월은 여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println( month +"월은 가을 입니다.");
			break;
		default:
			System.out.println( month +"월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String idConfirm = "yejilee";
		String pwConfirm = "yeji123";
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호: ");
		String pw = sc.nextLine();
		
		if(!id.equals(idConfirm)) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(!pw.equals(pwConfirm)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("로그인 성공");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급:");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자":
			System.out.println(grade + "는 회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회가 가능합니다.");
			break;
		case "회원":
			System.out.println(grade + "는  게시글 작성, 댓글 작성, 게시글 조회가 가능합니다.");
			break;
		case "비회원":
			System.out.println(grade + "는 게시글 조회만 가능합니다.");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			return;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("키(m)를 입력해주세요 :");
		double length = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요 :");
		double weight = sc.nextDouble();
		
		double bmi = weight / (length * length);
		
		if(bmi < 18.5) {
			System.out.println("BMI 지수 :" + bmi);
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("BMI 지수 :" + bmi);
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("BMI 지수 :" + bmi);
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("BMI 지수 :" + bmi);
			System.out.println("비만");
		}else{
			System.out.println("BMI 지수 :" + bmi);
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력:");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력:");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int result = 0;
		
		System.out.println("연산자를 입력(+,-,*,/,%):");
		char computation = sc.next().charAt(0);
//		sc.nextLine();
		
		if(num1 > 0  && num2 > 0) {
			switch(computation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;	
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.println(num1 + "" + computation + "" + num2 + '=' + result);
//		System.out.println((int)num1 + (char)computation + (int)num2 + '=' + result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간 고사 점수:");
		int mid = sc.nextInt();
		
		System.out.println("기말 고사 점수:");
		int fin = sc.nextInt();
		
		System.out.println("과제 점수:");
		int ass = sc.nextInt();
		
		System.out.println("출석 회수:");
		int att = sc.nextInt();
		
		//결과 
		
		//중간 고사 
		double midRes = mid * 0.2;
		
		//기말고사
		double finRes = fin * 0.3;
		
		//과제
		double assRes = ass * 0.3;
		
		double result = midRes + finRes + assRes + (double)att;
		
		//출석률
		double attRate = 20 * 0.7;
		
		if(result >= 70) {
			if( att >= attRate) {
				System.out.println("==========결과========");
				System.out.println("중간 고사 점수(20) :" + midRes);
				System.out.println("기말 고사 점수(30) :" + finRes);
				System.out.println("과제 점수      (30) :" + assRes);
				System.out.println("출석 점수      (20) :" + (double)att);
				System.out.println("총점 :" + result);
				System.out.println("PASS");
			}else {
				System.out.println("==========결과========");
				System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
			}
		}else {
			if(att >= attRate) {
				System.out.println("==========결과========");
				System.out.println("FAIL [점수 미달] (총점" + result + ")");
			}else {
				System.out.println("==========결과========");
				System.out.println("FAIL [출석 횟수 부족] (" + (double)att + "/20)");
				System.out.println("FAIL [점수 미달] (총점" + result + ")");
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.\n" +
				"1. 메뉴 출력\n"+ 
				"2. 짝수/홀수\n"+ 
				"3. 합격/불합격\n"+ 
				"4. 계절\n"+ 
				"5. 로그인\n"+ 
				"6. 권한 확인\n"+ 
				"7. BMI\n"+ 
				"8. 계산기\n" + 
				"9. Pass/Fail");
		System.out.print("선택:");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
