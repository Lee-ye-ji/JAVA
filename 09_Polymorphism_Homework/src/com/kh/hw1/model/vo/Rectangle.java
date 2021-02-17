package com.kh.hw1.model.vo;

import com.kh.hw1.model.vo.IShape;

public class Rectangle extends Shape implements IShape{
	
	private double width; 	// 가로
	private double height;	// 세로
	
	public Rectangle() {}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

}
