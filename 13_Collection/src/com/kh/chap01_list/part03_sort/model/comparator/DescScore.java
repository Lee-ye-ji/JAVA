package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class DescScore implements Comparator<Student>{

	// 점수 내림차순
	// o1, o2 순서 바꾸기 or 마이너스 부호 붙이기 or 결과에 -1곱하기
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getScore() - o1.getScore();
	}

}
