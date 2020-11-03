package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		System.out.println("-----형 변환_실습문제 1-----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char letter = sc.nextLine().charAt(0);
		
		System.out.println(letter + " unicode: "+ (int)letter);
		
	}
	
	public void method2() {
		System.out.println("\n-----형 변환_실습문제 2-----");
		
		Scanner subject = new Scanner(System.in);
		
		System.out.print("국어:");
		double korean = subject.nextDouble();
		
		System.out.print("영어: ");
		double english = subject.nextDouble();
		
		System.out.print("수학: ");
		double math = subject.nextDouble();
		
		int sum = (int) (korean + english + math);
		int avg = (int) (sum/3);
		
		System.out.println("총점: "+ sum);
		System.out.println("평균:" + avg);
		
	}
	
	public void method3() {
		System.out.println("\n-----형 변환_실습문제 3-----");
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println(  iNum1 / (int)fNum ); // 3
		System.out.println( (float)iNum1 / fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'

	}

}
