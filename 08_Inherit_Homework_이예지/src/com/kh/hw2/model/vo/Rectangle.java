package com.kh.hw2.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		// ���� : �ʺ� * ����
		System.out.println("���� :" + width * height);
		// �ѷ� : 2 * (�ʺ� + ����)
		System.out.println("�ѷ� :"+ 2 * (width + height) );
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}
