package com.kh.chap02_customException.controller;

import java.util.Scanner;

import com.kh.chap02_customException.exception.UserException;

public class UserExceptionTest {
	
	public void method() throws UserException {
		// �ҹ��ڸ� �Է¹ް� �ҹ��ڰ� �ƴ� �Է��� ���� ��� UserException �߻�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�(�ݵ�� �ҹ��ڸ�) : ");
		String input = sc.next();
		
		for(int i  = 0; i < input.length(); i++) {
			// a to z �ƴϸ� -> a���� �۰ų� z���� ũ��.
			if(input.charAt(i) < 'a' || input.charAt(i) > 'z') {
				throw new UserException(input.charAt(i) + "�� �ҹ��ڰ� �ƴմϴ�.");
			}
		}
	}

}
