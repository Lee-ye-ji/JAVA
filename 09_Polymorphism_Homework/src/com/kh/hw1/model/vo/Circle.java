package com.kh.hw1.model.vo;

import com.kh.hw1.model.vo.IShape;

public class Circle extends Shape implements IShape{
	
	public double PI = Math.PI; // Math.PI�� �ʱ�ȭ
	private double radius; 	// ������
	
	public Circle() {}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return PI * radius * radius;
	}
	
	public double perimeter() {
		return 2 * PI * radius;
	}

}
