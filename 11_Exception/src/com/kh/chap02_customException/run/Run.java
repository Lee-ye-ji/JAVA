package com.kh.chap02_customException.run;



import org.omg.CORBA.UserException;

import com.kh.chap02_customException.controller.UserExceptionTest;

public class Run {
	/* ����� ���� Exception
	 * - ����ڰ� ���� Exception�� ���� �� ����
	 * - �� ���� : ���α׷��� �ǵ���� �귯���� ���� ��� �߻��ϴ� ����
	 * ��, �ڹٿ��� �����ϴ� ���� Ŭ���������� ó���� �� ���� ���ܰ� ���� ��� ����ڰ� ���� ���
	 * */

	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();
		try {
			uet.method();
		} catch (com.kh.chap02_customException.exception.UserException e) {
			e.printStackTrace();
		}

}
}
