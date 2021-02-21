package com.kh.chap02_set.part03_treeSet.controller;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part03_treeSet.model.vo.Student;

public class TreeSetTest {
	public void doTreeSet() {
		System.out.println("===== Integer Ŭ������ �׽�Ʈ =====");
		TreeSet<Integer> set = new TreeSet<>();
		set.add(new Integer(10));
		set.add(new Integer(5));
		set.add(15);	// int -> Integer ���� �ڽ�
//		set.add("��");
		// ���� �� ���� : ���� ������ ������ �����ϹǷ� ���� Ÿ���� �ƴ� ���� ������
		// ClassCastException �߻�
		// -> �Ѱ��� Ÿ���� �ڷ����� ���� ����
		
		// Iterator �̿��ؼ� ���
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// Integer Ŭ������ ���������� ������ �ִ� ������ ������������ ���� ��
		
		System.out.println("======== Student Ŭ������ �׽�Ʈ ========");
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student("�迵��", 80));
		ts.add(new Student("�ѿ���", 100));
		ts.add(new Student("�ڿ���", 60));
		
		// TreeSet�� ���� ���ؿ� �־ ������ ���� ������?
		// => �ߺ� ���Ÿ� ��
		ts.add(new Student("�ڿ���", 90)); // �̸� ���������� ��� �ߺ����� ����
		ts.add(new Student("�̿���", 60)); // �������� ��� �ߺ����� ����
		
		Iterator<Student> it2 = ts.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		// ���� �߻� : tree ������ ��� ���� ������ ������ ����ǹǷ� Student Ŭ������
		// �ش� ������ �������־�� �� => implements Comparable
	}

}