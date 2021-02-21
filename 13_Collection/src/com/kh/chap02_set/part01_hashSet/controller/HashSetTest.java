package com.kh.chap02_set.part01_hashSet.controller;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

/*
 * Set �迭�� Ư¡ : ���� ���� X, �ߺ� ���� X
 * Set �迭�� ���� : HashSet, LinkedSet, TreeSet 
 */

public class HashSetTest {
	public void doHashset() {
		// Set�� �������̽��̹Ƿ� ��ü ���� �Ұ�
		// Set set = new Set();
		
		// Set�� �ļ� Ŭ������ ��ü ����(������)
		// Set set = new HashSet();
		
		System.out.println("========= String Ŭ������ �׽�Ʈ =======");
		HashSet<String> set = new HashSet<>();
		String str1 = "�ȳ��ϼ���";
		set.add(str1);
		set.add("�츮�� ����");
		set.add("set ������");
		System.out.println(set);	// -> add�� ������ �������� ����
		
		String str2 = "�ȳ��ϼ���";
		set.add(str2);
		System.out.println(set);	// -> �ߺ� ������ ���� X
		
		// Student -> list basic���� �����ؿ���
		System.out.println("========== Student Ŭ������ �׽�Ʈ =========");
		HashSet<Student> hs = new HashSet<>();
		
		// add(E e) : set�� �ν��Ͻ� �߰�
		hs.add(new Student("�迵�� ", 80));
		Student s1 = new Student("�ѿ���", 100);
		hs.add(s1);
		hs.add(new Student("�ڿ���", 60));
		hs.add(new Student("�̿���", 60));
		System.out.println(hs);	// -> add ���� �������� ����
		
		Student s2 = new Student("�ѿ���", 100);
		hs.add(s2);
		System.out.println(hs); // -> �ߺ� �� ���ŵ��� ����
		// Object�� hashCode()�� ������̶� �ּ� ���� �ٸ��� �ٸ� ��ü�� �ν�
		// s1�� s2�� �ʵ尪�� ������ �ٸ� �ν��Ͻ��̹Ƿ� �ٸ��ٰ� �ν���
		// Student Ŭ������ hashCode()�� �������̵��Ͽ� �ʵ� ���� ���� ���ü��
		// ���� hashode ���� �����ϵ��� ����
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("========== HashSet ��� �׽�Ʈ =========");
		// index�� �����Ƿ� get(int index) �̿��� �Ϲ� for������ ��� �Ұ�
		// (1) for each��(�׻�� for��)
		for(Student st : hs) {
			System.out.println(st);
		}
		
		System.out.println("=================================");
		// (2) Iterator(�ݺ���) ���
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			// System.out.println(it.next());
			Student st = it.next();
			System.out.println(st);
		}
	}

}
