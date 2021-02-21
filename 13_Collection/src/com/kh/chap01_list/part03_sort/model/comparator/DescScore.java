package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class DescScore implements Comparator<Student>{

	// ���� ��������
	// o1, o2 ���� �ٲٱ� or ���̳ʽ� ��ȣ ���̱� or ����� -1���ϱ�
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getScore() - o1.getScore();
	}

}