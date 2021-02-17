package com.kh.chap01_string.controller;

public class B_StringMethodTest {
	public void method1() {
		String str1 = "Hello World";
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		// 1. charAt(int index) : char
		char ch = str1.charAt(4);
		System.out.println("ch : " + ch);
		
		// 2. concat(String str) : String
		// : ��ģ ���ڿ��� new String���� ����
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// 3. toString() : String
		System.out.println("str1 : " + str1.toString());
		
		// 4. equals(Object obj) : boolean
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		// 5. hashCode() : int
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		// 6. length() : int
		System.out.println("str1�� ���� :" + str1.length());

		// 7. subString(int beginIndex) : String
		// 	  subString(int beginIndex, int endIndex) : String
		System.out.println(str1.substring(6)); // �ش� �ε������� ������ ����
		System.out.println(str1.substring(0,6)); // �ش� �ε������� ������ -1���� ����
		
		// 8. replace(char old, char new) : String
		String str4 = str1.replace('l', 'c');
		System.out.println("str4: " + str4); // �ش� ���ڿ��� l���ڰ� c���ڷ� ��� �ٲ�� ��ȯ
		
		// 9. toUpperCase() / toLowerCase() : String
		// : �빮�ڷ�, �ҹ��ڷ�
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str5.toLowerCase());
		
		// 10. trim() : String
		// : �� �� ���� ����
		String str6 = "   JAVA   ";
		System.out.println("str6 : " + str6.trim());
		
		// 11. toCharArray() : char[]
		// ���ڿ��� ���ڹ迭�� �ٲپ� ����
		String str7 = "abcdefg";
		char[] arr = str7.toCharArray();
		for(char c : arr) {
			System.out.println(c);
		}
	}

}
