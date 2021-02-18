package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.controller.NumberRangeExceptionTest;
import com.kh.practice1.exception.NumberRangeException;

public class Run {
	// main()���� ������ ���� 2���� �Է¹޾�
	// checkDouble(int, int) : boolean
	// �޼ҵ��� �Ű������� �Ͽ� ȣ��
	
	// controller�� �޼ҵ� (-> checkDouble(int, int) : boolean) �ȿ�����
	// ù��° ���� �ι�° ���� ������� Ȯ���Ͽ� ����� ������ true����, �ƴϸ� false����
	// ��, ���� �� �� ���� 1~100������ ���� �ƴ϶�� NumberRangeException �߻�(�����޽��� : 1~100������ ���� �ƴմϴ�) ��Ű��
	// main()���� �Ѱ� main()���� try~catch ���� �ۼ�
	public static void main(String[] args) throws NumberRangeException {
		NumberRangeExceptionTest nre = new NumberRangeExceptionTest();
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ���� �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		
		boolean bool = false;
		try {
			bool = nre.checkDouble(num1, num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ù ��° ���� �� ���� ���� ����ΰ�? :" + bool);
		
		

	}

}
