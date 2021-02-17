package com.kh.hw1.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	// �ʵ�
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() { // �Ʒ��� �޴� �ݺ� ����
		while(true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
					tokenMenu(); 
					break;
			case 2: 
					inputMenu(); 
					break;
			case 9: 
					System.out.println("���α׷��� �����մϴ�."); 
					return;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
		}
		
	}
	
	public void tokenMenu() {
		
		String str = "J a v a P r o g r a m";
		
		// Token ó�� �� ���ڿ� ���� ������ ����ϰ�
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		
		// �� str�� TokenController�� afterToken() �޼ҵ��� ���ڷ� ���� ��ȯ �� ���
		String strBlank = tc.afterToken(str);
		
		// �� ��ȯ ���� �̿��� Token ó�� �� ���� ������ �빮�� ��ȯ�� ���� ���
		System.out.println("��ū ó�� �� ���� : " + strBlank);
		System.out.println("��ū ó�� �� ���� : " + strBlank.length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + strBlank.toUpperCase());
	}
	
	public void inputMenu() {
		
		// �Է� ���� ���ڿ��� TestController�� firstCap()�� ���ڷ� ���� ��ȯ �� ���
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		
		String firstCap = tc.firstCap(input);
		System.out.println("ù ���� �빮�� : " + firstCap);
		
		// ã�� ���� �Է� �޾� TestController�� findChar()�� �Ű������� �Ʊ� �Է� ����
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char one = sc.nextLine().charAt(0);
		
		
		// ���ڿ��� ���� �ϳ��� �Ű������� ���� ��ȯ �� ���
		int findChar = tc.findChar(firstCap, one);
		System.out.println(one + "���ڰ� ��� �� ���� : " + findChar);
	}


}
