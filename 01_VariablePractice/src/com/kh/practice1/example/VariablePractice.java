package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		System.out.println("-----변수_실습문제 1-----");
		
		Scanner user = new Scanner(System.in);
		
		//이름
		System.out.print("이름을 입력하세요: ");
		String name = user.nextLine();
		
		//나이
		System.out.print("나이를 입력하세요: ");
		int age = user.nextInt();
		user.nextLine(); // -> 버퍼 비우는 용도로 사용
		
		//성별
		System.out.print("성별을 입력하세요(남/여): ");
		char gender = user.nextLine().charAt(0);
		
		//키
		System.out.print("키를 입력하세요(cm): ");
		double height = user.nextDouble();
		
		System.out.print("\n");
		
		System.out.println("키  " +  height + "인  " + age + "살  " 
		+ gender + "자  " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		
		System.out.println("\n-----변수_실습문제 2-----");
		
		int iNum1;
		int iNum2;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		iNum1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요: ");
		iNum2 = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.println("더하기 결과: " + (iNum1+iNum2) );
		System.out.println("빼기 결과: " + (iNum1-iNum2) );
		System.out.println("곱하기 결과: " + (iNum1*iNum2) );
		System.out.println("나누기 몫 결과: "+ (iNum1/iNum2));
		
	}
	
	public void method3() {
		
		System.out.println("\n-----변수_실습문제 3-----");
		
		Scanner square = new Scanner(System.in);
		
		System.out.print("가로: ");
		double width = square.nextDouble();
		
		System.out.print("세로: ");
		double height = square.nextDouble();
		
		// 면적 = 가로 * 세로
		double area = width * height;
		// 둘레 = (가로 + 세로) * 2
		double circumference = (width + height) * 2;
		
		System.out.print("\n");
		System.out.println("면적: " + area);
		System.out.println("둘레: " + circumference);
	}
	
	public void method4() {
		
		System.out.println("\n-----변수_실습문제 3-----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		
		System.out.println("첫 번째 문자: "+ word.charAt(0));
		System.out.println("두 번째 문자: "+ word.charAt(1));
		System.out.println("세 번째 문자: "+ word.charAt(2));
	}

}
