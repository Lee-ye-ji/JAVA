package com.kh.chap01_list.part03_sort.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part03_sort.model.comparator.AscName;
import com.kh.chap01_list.part03_sort.model.comparator.AscScore;
import com.kh.chap01_list.part03_sort.model.comparator.DescName;
import com.kh.chap01_list.part03_sort.model.comparator.DescScore;
import com.kh.chap01_list.part03_sort.model.vo.Student;

public class StudentController {

	public void testSort() {
		ArrayList<Student> sl = new ArrayList</*Student*/>();
		// ���׸��� �����ص� �߷� ����
		sl.add(new Student("�ڿ���", 80));
		sl.add(new Student("�迵��", 60));
		sl.add(new Student("�ѿ���", 100));
		
		System.out.println("======= ��ü ����Ʈ ��� =======");
		for(int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		// java.util.Comparator - compare()
		// ���ο� class�� �����Ͽ� Comparator�� ��ӹ޾� compare()�޼ҵ带 �������̵��Ͽ�
		// ������ ���� ���� ������ -> ���� ���� ���� ���� ���� �� ����
		System.out.println("======= Comparator ========");
		System.out.println("======= ���� �������� ���� ======");
		// AscScore�����
		// Collections.sort(sl, new AscScore());
		sl.sort(new AscScore());
		for(int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		// DescScore Ŭ���� �����
		System.out.println("===== ���� �������� ���� ====");
		Collections.sort(sl, new DescScore());
		for(int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		// AscName Ŭ���� �����
		System.out.println("==== �̸� ���� ���� ���� =====");
		Collections.sort(sl, new AscName());
		for(int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		// DescName Ŭ���� �����
		System.out.println("==== �̸� ���� ���� ���� =====");
		Collections.sort(sl, new DescName());
		for(int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		// java.lang.Comparable - compareTo() �޼ҵ� �������̵� �ؼ�
		// �����ϰ��� �ϴ� ��ü�� Comparable ��� �޾� compareTo()�޼ҵ� �������̵� �ؼ�
		// ������ ���� ���� ������ -> �Ѱ��� ���� ���ظ� ����
		// ��� �����ϱ� ( = ���� ��������)
		System.out.println("======= Comparable ======");
		System.out.println("=========== ��� ==========");
		Collections.sort(sl);
		for(int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		// ***** ������ �� *****
		// sort() �޼ҵ� ���� �� ���� ����Ʈ�� ����ǹǷ�
		// ���� ����Ʈ�� ���� ���� sort()�� �ϰ� �ʹٸ� �纻 ����Ʈ�� ����
		// �纻 ����Ʈ�� sort()�� �����ؾ���
	}

}
