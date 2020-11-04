package com.kh.example.run;

import com.kh.example.model.vo.Student;
import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class Run {

	public static void main(String[] args) {;
		Student[] stArr = { new Student(3, 1, 1, "È«±æµ¿"),
							new Student(4, 3, 2, "À¯°ü¼ø"),
							new Student(2, 7, 5, "À±ºÀ±æ") };
		
		
		for(int i = 0; i < stArr.length; i++) {
			System.out.println(stArr[i].information());
		}
		

	}

}
