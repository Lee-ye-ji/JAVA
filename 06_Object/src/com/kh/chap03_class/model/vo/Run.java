package com.kh.chap03_class.model.vo;

import java.util.Scanner;

public class Run { // Person클래스의 접근 제한자를 default로 변경하면 같은 패키지 내부에서만 접근 가능하다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("둘리");
		p.setAge(20);
		p.setGender('F');
		p.setPhone("010-2222-3333");
		p.setEmail("dooly@naver.com");
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 이름 : ");
		String name =  sc.nextLine();
		
		// setter를 이용해서 이름 다시 수정
		p.setName(name);
		System.out.println(p.information());

	}

}
