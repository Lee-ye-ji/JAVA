package com.kh.practice1.controller;

import com.kh.practice1.exception.NumberRangeException;

public class NumberRangeExceptionTest {
	// controller�� �޼ҵ� (-> checkDouble(int, int) : boolean) �ȿ�����
	// ù��° ���� �ι�° ���� ������� Ȯ���Ͽ� ����� ������ true����, �ƴϸ� false����
	// ��, ���� �� �� ���� 1~100������ ���� �ƴ϶�� NumberRangeException �߻�(�����޽��� : 1~100������ ���� �ƴմϴ�) ��Ű��
	// main()���� �Ѱ� main()���� try~catch ���� �ۼ�
	
	public boolean checkDouble(int num1, int num2) throws Exception{
		
		if( num1 < 1 || num1 > 100 || num1 < 2 || num2 > 100) {
			throw new NumberRangeException("1���� 100������ ���� �ƴմϴ�.");
		}
		
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
