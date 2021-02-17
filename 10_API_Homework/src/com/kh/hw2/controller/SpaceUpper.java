package com.kh.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	
	public SpaceUpper() {
		
	}
	
	public void spaceToUpper() {
		// 영문을 입력 받는다. (모두 소문자로 띄어쓰기 포함해서)
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오(띄어쓰기 포함): ");
		String input = sc.nextLine();
		
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를 구성
		StringTokenizer stn = new StringTokenizer(input);
		int length = stn.countTokens();

		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		StringBuilder sb = new StringBuilder(input);
		String str = "";
		char[] cArr = new char [length];
		
		for(int i = 0; i < length; i++) {
			str = stn.nextToken();
			cArr[i] = str.toUpperCase().charAt(0);
			str = str.replace(str.charAt(0), cArr[i]);
			System.out.print(str + " ");
		}
		
		
		
	}

}
