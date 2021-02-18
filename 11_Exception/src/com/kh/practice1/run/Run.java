package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.controller.NumberRangeExceptionTest;
import com.kh.practice1.exception.NumberRangeException;

public class Run {
	// main()에서 임의의 정수 2개를 입력받아
	// checkDouble(int, int) : boolean
	// 메소드의 매개변수로 하여 호출
	
	// controller의 메소드 (-> checkDouble(int, int) : boolean) 안에서는
	// 첫번째 수가 두번째 수의 배수인지 확인하여 배수가 맞으면 true리턴, 아니면 false리턴
	// 단, 전달 된 두 수가 1~100사이의 값이 아니라면 NumberRangeException 발생(에러메시지 : 1~100사이의 값이 아닙니다) 시키고
	// main()으로 넘겨 main()에서 try~catch 구문 작성
	public static void main(String[] args) throws NumberRangeException {
		NumberRangeExceptionTest nre = new NumberRangeExceptionTest();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		boolean bool = false;
		try {
			bool = nre.checkDouble(num1, num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("첫 번째 수는 두 번쨰 수의 배수인가? :" + bool);
		
		

	}

}
