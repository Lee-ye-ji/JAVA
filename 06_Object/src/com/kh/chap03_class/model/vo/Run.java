package com.kh.chap03_class.model.vo;

import java.util.Scanner;

public class Run { // PersonŬ������ ���� �����ڸ� default�� �����ϸ� ���� ��Ű�� ���ο����� ���� �����ϴ�.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("�Ѹ�");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-2222-3333");
		p.setEmail("dooly@naver.com");
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �̸� : ");
		String name =  sc.nextLine();
		
		// setter�� �̿��ؼ� �̸� �ٽ� ����
		p.setName(name);
		System.out.println(p.information());

	}

}
