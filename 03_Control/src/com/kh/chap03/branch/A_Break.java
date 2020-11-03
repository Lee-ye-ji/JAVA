package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break: 가장 가까운 반복문을 빠져나가는 문구
	// *** switch의 break는 switch문만 빠져나가는 break문
	// 반복문에서 사용되는 break와 다름 ***
	
	public void method1() {
		// "exit" 입력 전까지 문자열을 계속 입력받고 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			//str을 출력하기 전에 exit인지 확인하여 반복을 빠져나갈지 지속할지 결정
			if(str.equals("exit"))
				break; //분기문
			
			System.out.println("str : " + str);
		}
		//System.out.println("test");
		// -> 무한 반복문 안에 break가 없는 경우 다음 코드 오류 발생
		// (무한 반복문을 빠져나오지 않는다면 실행할 수 없는 코드이므로)
	}
	
	public void method2() {
		// 1부터 사용자가 입력한 숫자까지의 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		// for문(무한반복)
		for(int i = 1;;i++) {
			sum += i;
			if(i == num)
				break;
		}
		System.out.println("sum : " + sum);
	}
	
	public void method3() {
		// 사용자에게 반복적으로 정수 두개와 연산 기호(문자)를 입력 받고
		// 그에 해당하는 결과를 출력하기
		// 또한 제시 된 연산 기호를 입력하지 않고 다른 연산 기호를 입력했을 경우 반복 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
//			sc.nextLine();
			
			System.out.print("연산기호(+,-) : ");
//			String op = sc.nextLine();
			String op = sc.next();
			
			int result = 0;
			
			if(op.equals("+")) {
				result = num1 + num2;
			}else if(op.equals("-")) {
				result = num1 - num2;
			}else {
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			
			System.out.println("result : " + result);
		}
	}

}
