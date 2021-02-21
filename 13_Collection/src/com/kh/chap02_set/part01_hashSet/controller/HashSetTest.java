package com.kh.chap02_set.part01_hashSet.controller;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

/*
 * Set 계열의 특징 : 순서 유지 X, 중복 저장 X
 * Set 계열의 종류 : HashSet, LinkedSet, TreeSet 
 */

public class HashSetTest {
	public void doHashset() {
		// Set은 인터페이스이므로 객체 생성 불가
		// Set set = new Set();
		
		// Set의 후손 클래스로 객체 생성(다형성)
		// Set set = new HashSet();
		
		System.out.println("========= String 클래스로 테스트 =======");
		HashSet<String> set = new HashSet<>();
		String str1 = "안녕하세요";
		set.add(str1);
		set.add("우리는 지금");
		set.add("set 공부중");
		System.out.println(set);	// -> add한 순서가 유지되지 않음
		
		String str2 = "안녕하세요";
		set.add(str2);
		System.out.println(set);	// -> 중복 데이터 저장 X
		
		// Student -> list basic에서 복사해오기
		System.out.println("========== Student 클래스로 테스트 =========");
		HashSet<Student> hs = new HashSet<>();
		
		// add(E e) : set에 인스턴스 추가
		hs.add(new Student("김영희 ", 80));
		Student s1 = new Student("한영희", 100);
		hs.add(s1);
		hs.add(new Student("박영희", 60));
		hs.add(new Student("이영희", 60));
		System.out.println(hs);	// -> add 순서 유지되지 않음
		
		Student s2 = new Student("한영희", 100);
		hs.add(s2);
		System.out.println(hs); // -> 중복 값 제거되지 않음
		// Object의 hashCode()를 사용중이라 주소 값이 다르면 다른 객체로 인식
		// s1과 s2의 필드값이 같지만 다른 인스턴스이므로 다르다고 인식함
		// Student 클래스에 hashCode()를 오버라이딩하여 필드 값이 같은 동등객체로
		// 같은 hashode 값을 리턴하도록 수정
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("========== HashSet 출력 테스트 =========");
		// index가 없으므로 get(int index) 이용한 일반 for문으로 출력 불가
		// (1) for each문(항상된 for문)
		for(Student st : hs) {
			System.out.println(st);
		}
		
		System.out.println("=================================");
		// (2) Iterator(반복자) 사용
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			// System.out.println(it.next());
			Student st = it.next();
			System.out.println(st);
		}
	}

}
