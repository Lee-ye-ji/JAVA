package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
		
		public void practice1() {
			Scanner p1 = new Scanner(System.in);
			System.out.print("정수: ");
			int num = p1.nextInt();
			String result = (num > 0) ? "양수이다" : "양수가 아니다";
			System.out.println(result);
		}
		
		public void practice2() {
			Scanner p2 = new Scanner(System.in);
			System.out.print("정수: ");
			int num = p2.nextInt();
			String result = (num > 0) ? "양수이다" : ((num == 0) ? "0이다" : "음수다");
			System.out.println(result);
		}
		
		public void practice3() {
			Scanner p3 = new Scanner(System.in);
			System.out.print("정수: ");
			int num = p3.nextInt();
			String result = (num % 2 == 0) ? "짝수다" : "홀수다";
			System.out.println(result);
		}
		
		public void practice4() {
			Scanner p4 = new Scanner(System.in);
			System.out.print("인원 수: ");
			int person = p4.nextInt();
			System.out.print("사탕 개수: ");
			int candy = p4.nextInt();
			int giveCandy = candy / person;
			int remainCandy = candy % person;
			System.out.println("1인당 사탕 개수: " + giveCandy);
			System.out.println("남는 사탕 개수: " + remainCandy);
		}
		
		public void practice5() {
			Scanner p5 = new Scanner(System.in);
			System.out.print("이름: ");
			String schoolName = p5.nextLine();
			System.out.print("학년(숫자만): ");
			int schoolYear = p5.nextInt();
			System.out.print("반(숫자만): ");
			int schoolClass = p5.nextInt();
			System.out.print("번호(숫자만): ");
			int schoolNumber = p5.nextInt();
			p5.nextLine();
			System.out.print("성별(M/F): ");
			char schoolGender = p5.nextLine().charAt(0);
			char gender = (schoolGender == 'M') ? '남' : '여';
			System.out.print("성적(소수점 아래 둘째자리까지): ");
			double schoolGrade = p5.nextDouble();
			System.out.println(schoolYear + "학년 " + schoolClass + "반 "+
					schoolNumber + "번 " + schoolName +" "+ gender+ "학생의 " +
					"성적은 " + schoolGrade + "이다.");		
		}
		public void practice6() {
			Scanner p6 = new Scanner(System.in);
			System.out.print("나이: ");
			int age = p6.nextInt();
			String ageGrade = (age <= 13) ? "어린이" :( age>19 ? "성인" : "청소년");
			System.out.println(ageGrade);	
		}
		
		public void practice7() {
			Scanner p7 = new Scanner(System.in);
			System.out.print("국어 : ");
			int korean = p7.nextInt();
			System.out.print("수학 : ");
			int math = p7.nextInt();
			System.out.print("영어 : ");
			int english = p7.nextInt();
			
			int sum = korean + math + english;
			System.out.println("합계 : " +sum);
			double avg = sum / 3.0;
			System.out.println("평균 : " +avg);
			
			boolean pass = (korean >= 40) && (math >= 40) && (english >= 40) && (avg >= 60);
			String passOrfail = (pass == true) ? "합격" : "불합격";
			System.out.println(passOrfail);
		}
		
		public void practice8() {
			Scanner p8 = new Scanner(System.in);
			System.out.print("주민번호를 입력하세요(-포함) : ");
			String socialSecurityNumber =  p8.nextLine();
			char gender = socialSecurityNumber.charAt(7);
			String genderDistinguish = (gender % 2 == 0) ? "여자" : "남자";
			System.out.println(genderDistinguish);
		}
		
		public void practice9() {
			Scanner p9 = new Scanner(System.in);
			System.out.print("정수1 : ");
			int num1 = p9.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = p9.nextInt();
			
			System.out.print("입력 : ");
			int input =  p9.nextInt();
			
			boolean condition = (num1 <= input) || ( num2 > input ) && (num1 < num2);
			System.out.println(condition); 
		}
		
		public void practice10() {
			Scanner p10 = new Scanner(System.in);
			System.out.print("입력1 : ");
			int input1 = p10.nextInt();
			
			System.out.print("입력2 : ");
			int input2 = p10.nextInt();
			
			System.out.print("입력3 : ");
			int input3 = p10.nextInt();
			
			boolean result = (input1 == input2)  && (input2 == input3);
			System.out.println(result);
		}

}
