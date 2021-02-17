package com.kh.hw1.model.vo;

public class Triangle implements IShape{
	private double base; // ¹Øº¯
	private double height; // ³ôÀÌ

	public Triangle() {}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// ³ĞÀÌ = (¹Øº¯ * ³ôÀÌ)/2
		return (base * height)/2;
	}

	@Override
	public double perimeter() {
		// µÑ·¹ = ¹Øº¯ + ³ôÀÌ + ºøº¯±æÀÌ
		return base + height + Math.sqrt(base * base + height * height) ;
	}
	
	
	// ºøº¯ ±æÀÌ °è»ê
	public double hypotenuse() {
		//ºøº¯ ±æÀÌ = Math.sqrt( ¹Øº¯ * ¹Øº¯ + ³ôÀÌ * ³ôÀÌ)
		return  Math.sqrt(base * base + height * height);
	}
	
}
