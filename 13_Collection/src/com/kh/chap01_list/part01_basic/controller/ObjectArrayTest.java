package com.kh.chap01_list.part01_basic.controller;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ObjectArrayTest {
	// 객체 배열을 사용하는 경우
	private Student[] arr = new Student[3];
	private int size = 0; // 객체 배열의 인덱스 및 현재 저장된 요소 수 관리용 변수

	//학생 추가
	public void addStudent(Student student) {
		if( size < arr.length ) {
			arr[size++] = student;
		}else {
			// 기존의 크기보다 넘어서는 경우에 대한 알고리즘을 직접 구현 해야함
			Student[] newArr = new Student[arr.length + 10];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			
			newArr[size++] = student;
			
			arr = newArr;
		}
		
	}

	// 학생 출력
	public void printStudent() {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public void removeStudent(int index) {
		// 전달 받은 인덱스 값은 지워주고 뒤의 데이터는 앞으로 떙겨주는 알고리즘을 직접 구현해야함
		for(int j = index; j < arr.length-1; j++) {
			arr[j] = arr[j+1];
		}
		size--;
	}

	

}
