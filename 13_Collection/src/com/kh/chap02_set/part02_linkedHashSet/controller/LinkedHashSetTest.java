package com.kh.chap02_set.part02_linkedHashSet.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class LinkedHashSetTest {
	public void doLinkedHashSet() {
		// HashSet과 거의 동일하지만 추가 순서를 유지하면서 저장됨
		System.out.println("====== LinkedHashSet 테스트 =====");
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
		lhs.add(new Student("김영희", 80));
		lhs.add(new Student("한영희", 100));
		lhs.add(new Student("박영희", 60));
		lhs.add(new Student("박영희", 60));
		System.out.println(lhs);
		// -> hashCode() 이미 오버라이딩 되어 있으므로 중복 객체(필드 값이 같은 동등 객체)를 제거함
		
		Iterator<Student> it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ListIterator : list에서만 구현 가능한 양방향 Iterator
		System.out.println("====== ListIterator 테스트 ======");
		List<Student> list = new ArrayList<>();
		list.addAll(lhs);	// LinkedHashSet이 가지고 있는 Student 3명의 데이터를 List화
		
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next()); // 기존과 동일한 순방향
		}
		
		// 역방향 코드를 먼저 작성하면 커서 앞에는 아무런 데이터가 없으므로 출력 되지 않음
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()); // 뒤에서 앞으로 진행하는 역방향
		}
	}

}
