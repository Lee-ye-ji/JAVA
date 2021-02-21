package com.kh.library.model.vo;

public class Book {
	private String title; // 도서 제목
	private int category; // 장르 분류 번호
	private String author; // 도서 저자
	
	public Book() {}

	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", category=" + category + ", author=" + author + "]";
	}

	
	
	

}
