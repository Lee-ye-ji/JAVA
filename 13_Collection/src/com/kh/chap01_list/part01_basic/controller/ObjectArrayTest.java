package com.kh.chap01_list.part01_basic.controller;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ObjectArrayTest {
	// ��ü �迭�� ����ϴ� ���
	private Student[] arr = new Student[3];
	private int size = 0; // ��ü �迭�� �ε��� �� ���� ����� ��� �� ������ ����

	//�л� �߰�
	public void addStudent(Student student) {
		if( size < arr.length ) {
			arr[size++] = student;
		}else {
			// ������ ũ�⺸�� �Ѿ�� ��쿡 ���� �˰����� ���� ���� �ؾ���
			Student[] newArr = new Student[arr.length + 10];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			
			newArr[size++] = student;
			
			arr = newArr;
		}
		
	}

	// �л� ���
	public void printStudent() {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public void removeStudent(int index) {
		// ���� ���� �ε��� ���� �����ְ� ���� �����ʹ� ������ �����ִ� �˰����� ���� �����ؾ���
		for(int j = index; j < arr.length-1; j++) {
			arr[j] = arr[j+1];
		}
		size--;
	}

	

}
