package com.kh.practice3.run;

import com.kh.practice3.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		System.out.println(b.information());
		
		Book b1 = new Book("곰돌이 푸", "한빛아카데미", "푸");
		System.out.println(b1.information());
		
		Book b2 = new Book("피글렛", "생능출판", "크리스토퍼", 2000, 30.45);
		System.out.println(b2.information());

	}

}
