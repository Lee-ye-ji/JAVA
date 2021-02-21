package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscScore implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getScore() - o2.getScore();
	}

	// 점수 오름차순으로 정렬
	/*@Override
	public int compare(Object o1, Object o2) {
		// o1 (왼쪽) vs o2(오른쪽)
		int standard = ((Student)o1).getScore();
		int object = ((Student)o2).getScore();
		
		if(standard > object) {
			return 1; // 왼쪽이 크면 양수를 return -> 순서 변경
		}else if(standard == object) {
			return 0;	// 왼쪽과 오른쪽의 값이 같으면 0을 return
		}else {
			return -1;	//오른쪽이 크면 음수를 return -> 순서변경 X
		}
		return 0;
		return standard - object;
	}*/

}
