package com.kh.practice1.exception;

public class NumberRangeException extends Exception{
	public NumberRangeException() {} // 기본 생성자
	
	public NumberRangeException(String msg) {
		super(msg);
	}

}
