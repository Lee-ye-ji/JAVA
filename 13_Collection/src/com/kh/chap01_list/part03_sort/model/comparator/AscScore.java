package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscScore implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getScore() - o2.getScore();
	}

	// ���� ������������ ����
	/*@Override
	public int compare(Object o1, Object o2) {
		// o1 (����) vs o2(������)
		int standard = ((Student)o1).getScore();
		int object = ((Student)o2).getScore();
		
		if(standard > object) {
			return 1; // ������ ũ�� ����� return -> ���� ����
		}else if(standard == object) {
			return 0;	// ���ʰ� �������� ���� ������ 0�� return
		}else {
			return -1;	//�������� ũ�� ������ return -> �������� X
		}
		return 0;
		return standard - object;
	}*/

}
