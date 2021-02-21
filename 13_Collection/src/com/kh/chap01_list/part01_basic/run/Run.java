package com.kh.chap01_list.part01_basic.run;

import com.kh.chap01_list.part01_basic.controller.ArrayListTest;
import com.kh.chap01_list.part01_basic.controller.ObjectArrayTest;
import com.kh.chap01_list.part01_basic.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//ObjectArrayTest at = new ObjectArrayTest();
		ArrayListTest at = new ArrayListTest();
		
		System.out.println("학생 3명 추가");
		at.addStudent(new Student("우별림", 100));
		at.addStudent(new Student("김철수", 50));
		at.addStudent(new Student("김영희", 60));
		
		// 학생 출력
		at.printStudent();
		
		System.out.println("학생 한 명 더 추가");
		at.addStudent(new Student("홍길동", 30));
		
		// 학생 출력
		at.printStudent();
		
		System.out.println("1번 인덱스 학생 제거");
		at.removeStudent(1);
		
		// 학생 출력
		at.printStudent();

	}

}
