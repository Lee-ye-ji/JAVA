package com.kh.practice3.run;

import com.kh.practice3.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		System.out.println(b.information());
		
		Book b1 = new Book("������ Ǫ", "�Ѻ���ī����", "Ǫ");
		System.out.println(b1.information());
		
		Book b2 = new Book("�Ǳ۷�", "��������", "ũ��������", 2000, 30.45);
		System.out.println(b2.information());

	}

}
