package com.kh.chap07_method.part02_methodTest.run;

import com.kh.chap07_method.part02_methodTest.controller.NonstaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		// NonStaticeMethod test
		NonstaticMethod test = new NonstaticMethod();
		
		// 1. �Ű������� ��ȯ ���� ���� �޼ҵ� ȣ��
		test.method1();
		
		// 2. �Ű����� ���� ��ȯ ���� �ִ� �޼ҵ� ȣ��
		// �� ��ȯ���� ��ġ�ϴ� �ڷ����� ������ �޼ҵ� ���� ���� ��ȯ ���� ��Ƽ� ���
		String str = test.method2();
		System.out.println(str);
		
		// 3. �Ű������� �ְ� ��ȯ ���� ���� �޼ҵ� ȣ��
		test.method3(10, 20);
		// *** �ݵ�� ���� ���� �Ű������� Ÿ�԰� ������ ������ ��ġ�ϴ� ���� �Ѱ� �־�� �� ***
		
		// 4. �Ű������� �ְ� ��ȯ ���� �ִ� �޼ҵ� ȣ��
		int result = test.method4(3, 5);
		System.out.println("result : " + result);
		
		
		// StaticMethod test
		// ��ü �������� �ʰ� ȣ��
		// �̹� ���α׷� ���� �ÿ� static ������ �޼ҵ尡 ���� �Ǿ� �ֱ� ����
		// ������ Ŭ������.�޼ҵ��();
		StaticMethod.method1();
		
		System.out.println("10�� 20�� ����" + StaticMethod.method2() + "�Դϴ�.");
		
		StaticMethod.method3("����");
		
		System.out.println(StaticMethod.method4("���η�"));
		
		
		
		
		
		
		
		

	}

}
