package com.kh.hw2.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		// 면적 : PI * 반지름 * 반지름
		System.out.printf("면적: %.1f", (Math.PI *radius * radius));
		System.out.println();
		// 둘레 : PI * 반지름 * 2
		System.out.printf("둘레: %.1f", (Math.PI * radius * 2));
		System.out.println();
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	
	
}
