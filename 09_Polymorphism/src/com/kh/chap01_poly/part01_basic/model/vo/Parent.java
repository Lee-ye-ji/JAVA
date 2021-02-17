package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
	private int x;
	private int y;
	
	public Parent() {}

	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("나 부모야");
	}
	
	public void print() {
		System.out.println("나 부모야");
	}

}
