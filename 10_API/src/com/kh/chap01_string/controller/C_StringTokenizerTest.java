package com.kh.chap01_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1() {
		String str ="Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �̿��Ͽ� ���ڿ� �и�
		
		// ��� 1. �и��� ���ڿ��� �迭�� ó���ϰ� ���� ��
		// -> String Ŭ������ split �޼ҵ�
		// split(String regex) : String[]
		String[] arr = str.split(",");
		
		System.out.println("�и� �� ���ڿ��� ���� : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// ��� 2. �и� �� ���ڿ����� ��ü�� ����ϰ� ���� ��
		// -> java.util.StringTokenizer Ŭ���� �̿�
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		// countToken() : int -> ��ū ���� ����
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens());
		
		/*int length = stn.countTokens();
		for(int i = 0; i < length; i++) {
			// nextToken() : String -> ���� ��ū ����, ���� ��ū ����
			System.out.println(stn.nextToken());
		}*/
		
		 // hasMoreTokens() : boolean
		// -> ��ū�� �����ִ��� Ȯ��
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		String str2 = "JAVA Oracle JDBC HTML CSS Spring";
		StringTokenizer stn2 = new StringTokenizer(str2);
		// ��ȹ ���ڸ� ���ڷ� ���� ������ ����Ʈ ��ȹ���ڴ� ����
		
		System.out.println("==== ���� ����  ====");
		while(stn2.hasMoreTokens()) {
			System.out.println(stn2.nextToken());
		}
		
		String str3 = "JAVA@Oracle!JDBC*HTML@CSS!Spring";
		StringTokenizer stn3 = new StringTokenizer(str3, "@!*");
		// ���� ���� ��ȹ ���ڸ� ���ڷ� ���� �� ����, ��ȹ ���ڴ� ���̰� 1
		
		System.out.println("===== ��ȹ ���� ���� �� ���� =====");
		while(stn3.hasMoreTokens()) {
			System.out.println(stn3.nextToken());
		}
		
		// *** ���� split���� ���� ���� ���ڸ� �����ϰ��� �Ѵٸ�? ***
		// split �޼ҵ��� �Ű������� ���� ǥ������ ����ؾ� ��  -> ���߿� javascript���� �н�
		String[] arr2 = str3.split("[@!*]"); //[]ǥ���ϸ� ��������
		for(String s : arr2) {
			System.out.println(s);
		}
		
		StringTokenizer stn4 = new StringTokenizer(str, ",", true);
		// boolean �Ű������� �߰��Ͽ� ��ȹ ���ڵ� ��ū���� ������ �� ����
		// -> �⺻ ���� false�� ��ū���� �������� ����
		
		System.out.println("===== ��ȹ ���ڵ� ��ū���� ���� =====");
		while(stn4.hasMoreTokens()) {
			System.out.println(stn4.nextToken());
		}
		
		/* split()
		 * - ���� : ���� ǥ���� ��� ���� (�پ��� �������� �ɰ� �� ����)
		 * - ���� : �ӵ��� ������(���� ǥ���� �������)
		 * 
		 * StringTokenizer
		 * - ���� : �ӵ��� ������(�ٷ��� ������)
		 * - ���� : ���� ǥ���� ��� �Ұ���(�ܼ��� ���ڷθ� �ɰ� �� ���� -> ������)
		 */
		
	}

}
