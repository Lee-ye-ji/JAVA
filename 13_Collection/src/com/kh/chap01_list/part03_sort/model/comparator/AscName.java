package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// String 클래스에서 제공하는 compareTo() -> 사전순으로 앞이 크면 1, 뒤가 크면 -1 반환
		return o1.getName().compareTo(o2.getName());
	}

}
