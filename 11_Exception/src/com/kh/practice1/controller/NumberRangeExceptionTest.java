package com.kh.practice1.controller;

import com.kh.practice1.exception.NumberRangeException;

public class NumberRangeExceptionTest {
	// controller의 메소드 (-> checkDouble(int, int) : boolean) 안에서는
	// 첫번째 수가 두번째 수의 배수인지 확인하여 배수가 맞으면 true리턴, 아니면 false리턴
	// 단, 전달 된 두 수가 1~100사이의 값이 아니라면 NumberRangeException 발생(에러메시지 : 1~100사이의 값이 아닙니다) 시키고
	// main()으로 넘겨 main()에서 try~catch 구문 작성
	
	public boolean checkDouble(int num1, int num2) throws Exception{
		
		if( num1 < 1 || num1 > 100 || num1 < 2 || num2 > 100) {
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
