package com.kh.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	
	public SpaceUpper() {
		
	}
	
	public void spaceToUpper() {
		// ������ �Է� �޴´�. (��� �ҹ��ڷ� ���� �����ؼ�)
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �Է��Ͻÿ�(���� ����): ");
		String input = sc.nextLine();
		
		// StringTokenizer�� ���� ���⸦ �������� ��ū ������ ���� ���� �����ϴ� �޼ҵ带 ����
		StringTokenizer stn = new StringTokenizer(input);
		int length = stn.countTokens();

		// ���� ���� ù ���ڴ� �빮�ڷ� �ǰ� �ϰ� �� �ܿ� ������ �ҹ��ڷ� �ؼ� StringBuilder�� ��� ���
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
